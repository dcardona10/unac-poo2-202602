package co.edu.unac.poo2.cl10.ej01;

public class Cliente {

    private String id;
    private String nombre;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
