package co.edu.unac.poo2.cl03.ej02;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularPrecio(double impuesto) {
        return precio + (precio * impuesto);
    }

    public void imprimir() {
        System.out.println(nombre);
        System.out.println(precio);
    }
}
