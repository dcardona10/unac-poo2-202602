package co.edu.unac.poo2.cl03.ej04;

import java.util.List;

public class Venta {

    private Cliente cliente;
    private List<Libro> libros;

    public void vender() {

        double total = 0;
        for(Libro l : libros) {
            total += total + l.getPrecio();
        }

        System.out.println(total);
    }
}
