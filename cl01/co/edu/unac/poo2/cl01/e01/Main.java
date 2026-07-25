package co.edu.unac.poo2.cl01.e01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();
        System.out.print("ID: ");
        usuario.setId(sc.next());
        System.out.print("Nombre: ");
        usuario.setNombre(sc.next());
        System.out.print("Correo: ");
        usuario.setCorreo(sc.next());
        System.out.print("Teléfono: ");
        usuario.setTelefono(sc.next());

        UsuarioRepositorio.guardarUsuario(usuario);
    }
}
