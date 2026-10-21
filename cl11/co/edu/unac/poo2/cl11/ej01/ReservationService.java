package co.edu.unac.poo2.cl11.ej01;

import java.util.List;

public class ReservationService {
    private final ReservationRepository repository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.repository = reservationRepository;
    }

    public void saveReservation(Reservation reservation) {
        repository.save(reservation);
    }

    public Reservation findReservationById(int id) {
        return repository.findById(id);
    }

    public List<Reservation> findAllReservations() {
        return repository.findAll();
    }
}
