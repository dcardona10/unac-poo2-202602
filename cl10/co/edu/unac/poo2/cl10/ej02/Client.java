package co.edu.unac.poo2.cl10.ej02;

public class Client {

    private String id;
    private String name;
    private Email email;

    public Client(String id, String name, Email email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}