package co.edu.unac.poo2.cl06.ej01;

public class Producto {

    private String nombre;
    private int tiempoProcesamiento;

    public Producto(String nombre, int tiempoProcesamiento) {
        this.nombre = nombre;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public void setTiempoProcesamiento(int tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }
}
