package co.edu.unac.poo2.cl08.ej02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EstudianteRepository {

    public static final String BD_ESTUDIANTES = "C:\\Users\\david\\OneDrive\\Documents\\UNAC\\2026-2\\unac-poo2-202602\\cl08\\estudiantes.txt";

    public boolean guardar(Estudiante estudiante) {
        try (FileWriter fw = new FileWriter(BD_ESTUDIANTES, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(estudiante.getNombre() + "|" + estudiante.getEdad());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
