package co.unac.edu.poo2.cl02.ej02;

public class PrestamoRepository {

    public static void generarPrestamo(Prestamo prestamo) {
        if (prestamo.getLibro().getUnidades() > 0) {
            prestamo.getLibro().setUnidades(prestamo.getLibro().getUnidades() - 1);
            System.out.println("Préstamo generado exitosamente: " + prestamo.toString());
        } else {
            System.out.println("No se pudo efectuar el préstamo: unidades no disponibles.");
        }
    }
}
