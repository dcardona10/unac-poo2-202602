package co.edu.unac.poo2.cl07.ej01;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(100000);

        Thread cliente1 = new Thread(() -> {
            try {
                cuenta.retirar(50000);
            } catch (IllegalArgumentException e) {
                System.out.println("Error Cliente 1: " + e.getMessage());
            }
        });

        Thread cliente2 = new Thread(() -> {
            try {
                cuenta.retirar(60000);
            } catch (IllegalArgumentException e) {
                System.out.println("Error Cliente 2: " + e.getMessage());
            }
        });

        cliente2.start();
        cliente1.start();
    }
}
