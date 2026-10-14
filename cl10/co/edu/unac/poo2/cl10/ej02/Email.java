package co.edu.unac.poo2.cl10.ej02;

public class Email {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    private String value;

    public Email(String value) {
        if (value == null || !value.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}