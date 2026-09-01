package co.edu.unac.poo2.cl07.ej01;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void retirar (double monto) {

        if (this.saldo < monto) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        } else {
            this.saldo -= monto;
            System.out.println("Retiro realizado con éxito.");
            System.out.println("Nuevo saldo: " + this.saldo);
        }
    }
}
