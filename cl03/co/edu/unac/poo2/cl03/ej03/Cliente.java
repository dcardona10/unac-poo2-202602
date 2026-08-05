package co.edu.unac.poo2.cl03.ej03;

public class Cliente {

    private String id;
    private String nombre;
    private boolean premium;

    public Cliente(String id, String nombre, boolean premium) {
        this.id = id;
        this.nombre = nombre;
        this.premium = premium;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
