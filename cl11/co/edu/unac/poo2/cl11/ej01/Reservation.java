package co.edu.unac.poo2.cl11.ej01;

public class Reservation {
    private int id;
    private String customer;
    private String room;

    public Reservation(int id, String customer, String room) {
        this.id = id;
        this.customer = customer;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public String getRoom() {
        return room;
    }
}
