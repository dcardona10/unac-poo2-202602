package co.edu.unac.poo2.cl08.ej02;

public class EstudianteController {

    private EstudianteService service;

    public EstudianteController() {
        service = new EstudianteService();
    }

    public boolean registrarEstudiante(Estudiante estudiante) {

        return service.registrar(estudiante);
    }
}
