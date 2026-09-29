package co.edu.unac.poo2.cl09.ej01;

public class PedidoRepositoryMemoria implements PedidoRepository {

    @Override
    public void guardar(Pedido pedido) {
        System.out.println("Pedido guardado en memoria.");
    }
}
