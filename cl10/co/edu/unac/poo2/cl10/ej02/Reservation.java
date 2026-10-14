package co.edu.unac.poo2.cl10.ej02;

import java.util.Date;

public class Reservation {

    public static final String CONFIRMED = "CONFIRMED";
    public static final String CANCELLED = "CANCELLED";

    private String id;
    private Client client;
    private Room room;
    private Date date;
    private String status;

    public Reservation(String id, Client client, Room room, Date date, String status) {
        this.id = id;
        this.client = client;
        this.room = room;
        this.date = date;
        this.status = status;
    }

    public void confirm() {
        this.status = CONFIRMED;
    }

    public void cancel() {
        this.status = CANCELLED;
    }

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Room getRoom() {
        return room;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
}