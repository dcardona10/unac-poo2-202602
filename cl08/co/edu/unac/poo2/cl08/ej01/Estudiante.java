package co.edu.unac.poo2.cl08.ej01;

public class Estudiante {

    public void registrar(String nombre, int edad) {

        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Nombre obligatorio.");
            return;
        }

        if (edad < 18) {
            System.out.println("El estudiante debe ser mayor de edad.");
            return;
        }

        System.out.println("Guardando estudiante...");
        System.out.println("Estudiante registrado");
    }
}
