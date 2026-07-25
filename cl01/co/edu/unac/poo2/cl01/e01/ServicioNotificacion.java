package co.edu.unac.poo2.cl01.e01;

public class ServicioNotificacion {

    public static void notificacionExitosa(Usuario usuario) {
        System.out.println("Usuario creado exitosamente: " + usuario.toString());
    }

    public static void notificacionFallida(Usuario usuario) {
        System.out.println("Error al crear usuario: " + usuario.getNombre());
    }
}
