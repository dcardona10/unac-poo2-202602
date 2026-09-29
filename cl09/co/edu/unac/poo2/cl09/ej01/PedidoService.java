package co.edu.unac.poo2.cl09.ej01;

public class PedidoService {

    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public void crearPedido(Pedido pedido) {
        if (pedido.getTotal() <= 0) {
            System.out.println("Pedido inválido.");
            return;
        }

        repository.guardar(pedido);
    }
}
