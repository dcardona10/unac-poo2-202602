package co.edu.unac.poo2.cl03.ej03;

import java.util.List;

public class Compra {

    private String codigo;
    private Cliente cliente;
    private List<Producto> productos;

    public Compra(String codigo, Cliente cliente, List<Producto> productos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.productos = productos;
    }

    public double calcularCompra() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }

        if (cliente.isPremium()) {
            total = total - (total * 0.1);
        }

        return total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
