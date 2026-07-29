package co.unac.edu.poo2.cl02.ej02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("1", "Juan Perez", "juan.perez@unac.edu.co"));
        usuarios.add(new Usuario("2", "Andres Correa", "andres.correa@unac.edu.co"));

        List<Libro> libros = new ArrayList<Libro>();
        libros.add(new Libro("456554", "Algebra", "Baldor", 1));
        libros.add(new Libro("448820", "Calculo", "Baldor", 5));

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la identificación del usuario: ");
        String idUsuario = sc.next();
        List<Usuario> usuariosPorId = usuarios.stream()
                .filter(u -> u.getId().equalsIgnoreCase(idUsuario))
                .collect(Collectors.toList());
        if (usuariosPorId.size() > 0) {
            System.out.println("Usuario encontrado: " + usuariosPorId.get(0).getNombre());
        }
        System.out.print("Ingrese el título del libro a alquilar: ");
        String titulo = sc.next();
        List<Libro> libroPorTitulo = libros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
        if (libroPorTitulo.size() > 0) {
            System.out.println("Libro encontrado: " + libroPorTitulo.get(0).getTitulo());
        }
        Prestamo prestamo = PrestamoService.crearPrestamo(libroPorTitulo.get(0), usuariosPorId.get(0));
        PrestamoRepository.generarPrestamo(prestamo);
    }
}
