package co.edu.unac.poo2.cl06.ej01;

public class Cajero {

    private String nombre;
    private Cliente cliente;

    public Cajero(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarCompra(long timestamp) {

        System.out.println("Cajero [" + this.nombre + "] inicia compra del Cliente [" + this.cliente.getNombre() + "] - [" + (System.currentTimeMillis() - timestamp) / 1000 + "s]");
        for (Producto prod : this.cliente.getProductos()) {
            this.esperarNSegundos(prod.getTiempoProcesamiento());
            System.out.println("Procesando artículo [" + prod.getNombre() + "] - [" + (System.currentTimeMillis() - timestamp) / 1000 + "s]");
        }
        System.out.println("Cajero [" + this.nombre + "] finaliza compra del Cliente [" + this.cliente.getNombre() + "] - [" + (System.currentTimeMillis() - timestamp) / 1000 + "s]");

    }

    private void esperarNSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
