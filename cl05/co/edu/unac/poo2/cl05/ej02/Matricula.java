package co.edu.unac.poo2.cl05.ej02;

public class Matricula {

    public static void matricular (Estudiante estudiante) throws EstudianteMenorDeEdadException, EdadNoValidaException {

        if (!isNumber(String.valueOf(estudiante.getEdad()))) {
            throw new EdadNoValidaException("El valor de la edad no es correcto.");
        } else if (estudiante.getEdad() < 18) {
            throw new EstudianteMenorDeEdadException("El estudiante no puede matricularse.");
        }


    }

    private static boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
