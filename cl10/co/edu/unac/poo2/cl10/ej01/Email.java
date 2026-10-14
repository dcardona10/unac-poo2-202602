package co.edu.unac.poo2.cl10.ej01;

public class Email {

    private String valor;

    public Email(String valor) {
        if (valor == null || !valor.contains("@")) {
            throw new IllegalArgumentException("Correo electrónico inválido");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}