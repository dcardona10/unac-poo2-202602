package co.edu.unac.poo2.cl06.ej02;

import java.util.List;

public class Cliente {

    private String nombre;
    private List<Producto> productos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
