package co.edu.unac.poo2.cl09.ej01;

public class Main {

    public static void main(String[] args) {

        PedidoRepository repository = new PedidoRepositoryArchivo();
        PedidoService service = new PedidoService(repository);
        service.crearPedido(new Pedido());
    }
}
