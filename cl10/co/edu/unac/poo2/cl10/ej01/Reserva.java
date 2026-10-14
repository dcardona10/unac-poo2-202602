package co.edu.unac.poo2.cl10.ej01;

public class Reserva {

	private String id;
	private Cliente cliente;
	private int cantidadPersonas;
	private boolean activa;

	public Reserva(String id, Cliente cliente, int cantidadPersonas) {
		this.id = id;
		this.cliente = cliente;
		this.cantidadPersonas = cantidadPersonas;
		this.activa = true;
	}

	public void cancelar() {
		this.activa = false;
	}
}
