package co.edu.unac.poo2.cl08.ej02;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            Estudiante estudiante = new Estudiante(nombre, edad);
            EstudianteController controller = new EstudianteController();
            if (controller.registrarEstudiante(estudiante)) {
                System.out.println("Estudiante registrado exitosamente.");
            } else {
                System.out.println("Estudiante no pudo ser registrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al registrar estudiante: " + e.getMessage());
            e.printStackTrace();
        }*/

        JFrame frame = new JFrame("Estudiantes");
        frame.setContentPane(new Estudiantes().getPnlEstudiantes());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
