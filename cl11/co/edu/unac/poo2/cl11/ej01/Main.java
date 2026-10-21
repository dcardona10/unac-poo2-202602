package co.edu.unac.poo2.cl11.ej01;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationService service;
        try {
            service = new ReservationService(new MySqlReservationRepository());
        } catch (IllegalStateException exception) {
            System.err.println("Could not initialize MySQL repository: " + exception.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                printMenu();
                Integer option = readInteger(scanner, "Select an option: ");
                if (option == null) {
                    break;
                }

                try {
                    switch (option) {
                        case 1:
                            saveReservation(scanner, service);
                            break;
                        case 2:
                            findReservation(scanner, service);
                            break;
                        case 3:
                            findAllReservations(service);
                            break;
                        case 0:
                            running = false;
                            break;
                        default:
                            System.out.println("Invalid option. Choose 0, 1, 2, or 3.");
                    }
                } catch (IllegalStateException exception) {
                    System.err.println("Reservation operation failed: " + exception.getMessage());
                }
                System.out.println();
            }
        }

        System.out.println("Exiting reservation program.");
    }

    private static void printMenu() {
        System.out.println("1: Save Reservation");
        System.out.println("2: Find Reservation by ID");
        System.out.println("3: Find All Reservations");
        System.out.println("0: Exit");
    }

    private static void saveReservation(Scanner scanner, ReservationService service) {
        Integer id = readInteger(scanner, "Reservation ID: ");
        if (id == null) {
            return;
        }

        System.out.print("Customer: ");
        if (!scanner.hasNextLine()) {
            return;
        }
        String customer = scanner.nextLine();

        System.out.print("Room: ");
        if (!scanner.hasNextLine()) {
            return;
        }
        String room = scanner.nextLine();

        service.saveReservation(new Reservation(id, customer, room));
        System.out.println("Reservation saved.");
    }

    private static void findReservation(Scanner scanner, ReservationService service) {
        Integer id = readInteger(scanner, "Reservation ID: ");
        if (id == null) {
            return;
        }

        Reservation reservation = service.findReservationById(id);
        if (reservation == null) {
            System.out.println("Reservation not found.");
        } else {
            printReservation(reservation);
        }
    }

    private static void findAllReservations(ReservationService service) {
        List<Reservation> reservations = service.findAllReservations();
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        for (Reservation reservation : reservations) {
            printReservation(reservation);
        }
    }

    private static Integer readInteger(Scanner scanner, String prompt) {
        while (scanner.hasNextLine()) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.valueOf(input.trim());
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid integer.");
            }
        }
        return null;
    }

    private static void printReservation(Reservation reservation) {
        System.out.println("ID=" + reservation.getId()
                + ", Customer=" + reservation.getCustomer()
                + ", Room=" + reservation.getRoom());
    }
}
