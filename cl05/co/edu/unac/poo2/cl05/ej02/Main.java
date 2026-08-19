package co.edu.unac.poo2.cl05.ej02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EstudianteMenorDeEdadException, EdadNoValidaException {

        Scanner scan = new Scanner(System.in);
        try {
            Estudiante estudiante = new Estudiante();
            System.out.print("ID del Estudiante: ");
            String id = scan.next();
            estudiante.setId(id);
            System.out.print("Nombre del Estudiante: ");
            String nombre = scan.next();
            estudiante.setNombre(nombre);
            System.out.print("Edad del Estudiante: ");
            int edad = scan.nextInt();
            estudiante.setEdad(edad);
            Matricula.matricular(estudiante);
            System.out.println("Estudiante registrado exitosamente: " + estudiante.toString());
        } catch (EstudianteMenorDeEdadException | EdadNoValidaException e) {
            System.out.println("Error en la matrícula: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("El proceso terminó.");
        }
    }

}
