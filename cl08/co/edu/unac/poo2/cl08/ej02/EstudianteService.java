package co.edu.unac.poo2.cl08.ej02;

public class EstudianteService {

    EstudianteRepository repository;

    public EstudianteService() {
        repository = new EstudianteRepository();
    }

    public boolean registrar(Estudiante estudiante) {

        if (estudiante.getNombre() == null || estudiante.getNombre().isEmpty()) {
            throw new EstudianteException("Nombre obligatorio.");
        }

        if (estudiante.getEdad() < 18) {
            throw new EstudianteException("El estudiante debe ser menor de edad.");
        }

        return repository.guardar(estudiante);
    }
}
