package co.edu.unac.poo2.cl10.ej01;

public class Habitacion {

    private String numero;
    private boolean disponible;

    public Habitacion(String numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public String getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }
}
