package co.edu.unac.poo2.cl11.ej01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MySqlReservationRepository implements ReservationRepository {
    
    private static final String DEFAULT_URL = "jdbc:mysql://localhost:3306/unac_2026_02";
    private static final String DEFAULT_USER = "root";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

    private final String url;
    private final String user;
    private final String password;

    public MySqlReservationRepository() {
        this(
                getEnvironmentValue("DB_URL", DEFAULT_URL),
                getEnvironmentValue("DB_USER", DEFAULT_USER),
                getRequiredEnvironmentValue("DB_PASSWORD"));
    }

    public MySqlReservationRepository(String url, String user, String password) {
        this.url = Objects.requireNonNull(url, "url must not be null");
        this.user = Objects.requireNonNull(user, "user must not be null");
        this.password = Objects.requireNonNull(password, "password must not be null");

        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException exception) {
            throw new IllegalStateException(
                    "MySQL JDBC driver is not available on the classpath: " + DRIVER_CLASS,
                    exception);
        }
    }

    @Override
    public void save(Reservation reservation) {
        String sql = "INSERT INTO reservation (id, customer, room) VALUES (?, ?, ?) "
                + "ON DUPLICATE KEY UPDATE customer = VALUES(customer), room = VALUES(room)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservation.getId());
            statement.setString(2, reservation.getCustomer());
            statement.setString(3, reservation.getRoom());
            statement.executeUpdate();
        } catch (SQLException exception) {
            throw new IllegalStateException("Could not save reservation", exception);
        }
    }

    @Override
    public Reservation findById(int id) {
        String sql = "SELECT id, customer, room FROM reservation WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return mapReservation(resultSet);
                }
                return null;
            }
        } catch (SQLException exception) {
            throw new IllegalStateException("Could not find reservation with ID " + id, exception);
        }
    }

    @Override
    public List<Reservation> findAll() {
        String sql = "SELECT id, customer, room FROM reservation ORDER BY id";
        List<Reservation> reservations = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                reservations.add(mapReservation(resultSet));
            }
            return reservations;
        } catch (SQLException exception) {
            throw new IllegalStateException("Could not retrieve reservations", exception);
        }
    }

    private Reservation mapReservation(ResultSet resultSet) throws SQLException {
        return new Reservation(
                resultSet.getInt("id"),
                resultSet.getString("customer"),
                resultSet.getString("room"));
    }

    private static String getEnvironmentValue(String name, String defaultValue) {
        String value = System.getenv(name);
        return value == null || value.trim().isEmpty() ? defaultValue : value;
    }

    private static String getRequiredEnvironmentValue(String name) {
        String value = System.getenv(name);
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalStateException(
                    "Set the " + name + " environment variable before creating the repository");
        }
        return value;
    }
}
