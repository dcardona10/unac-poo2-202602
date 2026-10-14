package co.edu.unac.poo2.cl10.ej02;

public class Room {

    private String number;
    private int capacity;
    private boolean available = true;

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.available = true;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable() {
        return available;
    }
}