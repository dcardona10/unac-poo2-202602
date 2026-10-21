package co.edu.unac.poo2.cl11.ej01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryReservationRepository implements ReservationRepository {
    
    private final Map<Integer, Reservation> reservations = new HashMap<>();

    @Override
    public void save(Reservation reservation) {
        reservations.put(reservation.getId(), reservation);
    }

    @Override
    public Reservation findById(int id) {
        return reservations.get(id);
    }

    @Override
    public List<Reservation> findAll() {
        return new ArrayList<>(reservations.values());
    }
}
