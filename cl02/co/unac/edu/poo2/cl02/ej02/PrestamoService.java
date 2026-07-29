package co.unac.edu.poo2.cl02.ej02;

import java.util.Calendar;
import java.util.Date;

public class PrestamoService {

    public static Prestamo crearPrestamo(Libro libro, Usuario usuario) {

        Prestamo prestamo = new Prestamo(libro, usuario);
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new Date());
        prestamo.setFechaInicio(calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 7);
        prestamo.setFechaDevolucion(calendar.getTime());

        return prestamo;
    }
}
