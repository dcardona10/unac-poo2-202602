package co.edu.unac.poo2.cl06.ej02;

public class Cajero extends Thread {

    private String nombre;
    private Cliente cliente;
    private long init;

    public Cajero(String nombre, Cliente cliente, long init) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.init = init;
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

    public void run() {

        System.out.println("Cajero [" + this.nombre + "] inicia compra del Cliente [" + this.cliente.getNombre() + "] - [" + (System.currentTimeMillis() - this.init) / 1000 + "s]");
        for (Producto prod : this.cliente.getProductos()) {
            this.esperarNSegundos(prod.getTiempoProcesamiento());
            System.out.println("Procesando artículo [" + prod.getNombre() + "] - [" + (System.currentTimeMillis() - this.init) / 1000 + "s]");
        }
        System.out.println("Cajero [" + this.nombre + "] finaliza compra del Cliente [" + this.cliente.getNombre() + "] - [" + (System.currentTimeMillis() - this.init) / 1000 + "s]");

    }

    private void esperarNSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
