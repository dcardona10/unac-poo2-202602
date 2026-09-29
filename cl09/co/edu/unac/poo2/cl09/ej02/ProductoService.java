package co.edu.unac.poo2.cl09.ej02;

public class ProductoService implements ProductoUseCase {

    private ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void crearProducto(Producto producto) {

        if(producto.getPrecio() <= 0) {
            throw new IllegalArgumentException("Precio no válido.");
        }

        repository.guardar(producto);
    }
}
