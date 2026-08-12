package co.edu.unac.poo2.cl04.ej01;

import java.util.List;

public class PedidoB {

    private List<ProductoB> productos;

    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(ProductoB::obtenerPrecio)
                .sum();
    }
}
