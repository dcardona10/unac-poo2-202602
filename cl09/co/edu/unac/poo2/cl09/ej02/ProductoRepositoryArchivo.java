package co.edu.unac.poo2.cl09.ej02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductoRepositoryArchivo implements  ProductoRepository {

    private final String FILE_PATH = "C:\\Users\\david\\OneDrive\\Documents\\UNAC\\2026-2\\unac-poo2-202602\\cl09\\productos.txt";

    @Override
    public void guardar(Producto producto) {

        try (FileWriter fw = new FileWriter(FILE_PATH, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(producto.getId() + "|" + producto.getDescripcion() + "|" + producto.getPrecio());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
