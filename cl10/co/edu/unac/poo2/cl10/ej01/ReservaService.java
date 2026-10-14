package co.edu.unac.poo2.cl10.ej01;

public class ReservaService {

	public void reservar(Reserva reserva, Habitacion habitacion) {
		if (habitacion.isDisponible()) {
			habitacion.ocupar();
		}
	}
}
