package co.edu.unac.poo2.cl06.ej01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente();
        cl1.setNombre("Luis");
        List<Producto> prods1 = new ArrayList<Producto>();
        prods1.add(new Producto("TV", 10));
        prods1.add(new Producto("Parlante", 6));
        prods1.add(new Producto("Laptop", 8));
        prods1.add(new Producto("Headset", 4));
        cl1.setProductos(prods1);

        Cliente cl2 = new Cliente();
        cl2.setNombre("Pedro");
        List<Producto> prods2 = new ArrayList<Producto>();
        prods2.add(new Producto("Nevera", 12));
        prods2.add(new Producto("Laptop", 8));
        prods2.add(new Producto("Antena TDT", 3));
        cl2.setProductos(prods2);

        Cajero cj1 = new Cajero("Juan", cl1);
        Cajero cj2 = new Cajero("Andres", cl2);

        long init = System.currentTimeMillis();

        cj1.procesarCompra(init);
        cj2.procesarCompra(init);
    }
}
