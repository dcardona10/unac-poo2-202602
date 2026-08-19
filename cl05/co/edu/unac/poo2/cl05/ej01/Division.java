package co.edu.unac.poo2.cl05.ej01;

public class Division {

    public static double dividir(double num1, double num2) throws DivisionPorCeroException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new DivisionPorCeroException("No se puede dividir por cero.");
        }
    }
}
