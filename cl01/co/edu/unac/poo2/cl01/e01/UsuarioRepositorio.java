package co.edu.unac.poo2.cl01.e01;

public class UsuarioRepositorio {

    private Usuario usuario;

    public UsuarioRepositorio (Usuario usuario) {
        this.usuario = usuario;
    }

    public static void guardarUsuario(Usuario usuario) {
        if (UsuarioValidador.validarCorreo(usuario.getCorreo()) && UsuarioValidador.validarTelefono(usuario.getTelefono())) {
            ServicioNotificacion.notificacionExitosa(usuario);
        } else {
            ServicioNotificacion.notificacionFallida(usuario);
        }
    }
}
