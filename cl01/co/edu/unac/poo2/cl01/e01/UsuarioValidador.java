package co.edu.unac.poo2.cl01.e01;

public class UsuarioValidador {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PHONE_REGEX = "^\\d{10}$";

    public static boolean validarCorreo(String correo) {
        if (!correo.matches(EMAIL_REGEX)) {
            return false;
        }
        return true;
    }

    public static boolean validarTelefono(String telefono) {
        if (!telefono.matches(PHONE_REGEX)) {
            return false;
        }
        return true;
    }
}
