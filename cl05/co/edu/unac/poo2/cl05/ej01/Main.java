package co.edu.unac.poo2.cl05.ej01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            double num1 = scan.nextDouble();
            System.out.print("Ingrese el divisor: ");
            double num2 = scan.nextDouble();
            double res = Division.dividir(num1, num2);
            System.out.println("El resultado es: " + res);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("La operación de división finalizó");
        }
    }
}
