public class Main {

    public static void main(String[] args) {

        Thread hilo1 = new Thread(() -> {
            try {
                double res = 10 / 2;
                System.out.println("Resultado 1: " + res);
            } catch (ArithmeticException e) {
                System.out.println("Error en Hilo 1: " + e.getMessage());
            }
        });

        Thread hilo2 = new Thread(() -> {
            try {
                double res = 10 / 0;
                System.out.println("Resultado 2: " + res);
            } catch (ArithmeticException e) {
                System.out.println("Error en Hilo 2: " + e.getMessage());
            }
        });

        hilo1.start();
        hilo2.start();
    }
}
