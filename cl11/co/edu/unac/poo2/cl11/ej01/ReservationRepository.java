package co.edu.unac.poo2.cl11.ej01;

import java.util.List;

public interface ReservationRepository {
    
    void save(Reservation reservation);

    Reservation findById(int id);

    List<Reservation> findAll();
}
