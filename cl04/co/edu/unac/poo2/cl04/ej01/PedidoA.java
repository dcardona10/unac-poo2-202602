package co.edu.unac.poo2.cl04.ej01;

import java.util.List;

public class PedidoA {

    private List<ProductoA> productos;

    public double calcularTotal() {
        double total = 0;
        for (ProductoA producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }
}
