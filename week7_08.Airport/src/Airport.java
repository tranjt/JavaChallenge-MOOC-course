
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class Airport {
    
    private HashMap<String, Airplane> planeList = new HashMap<String, Airplane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private Scanner reader;

    public Airport(Scanner reader) {
        this.reader = reader;
    }

    public void addPlane() {
        String id, capacity;

        System.out.print("Give plane ID: ");
        id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        capacity = reader.nextLine();
        planeList.put(id, new Airplane(id, capacity));
    }

    public void addFlight() {
        String planeID, departureCode, destinationCode;
        System.out.print("Give plane ID: ");
        planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        departureCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        destinationCode = reader.nextLine();

        if (!this.planeList.containsKey(planeID)) {
            System.out.println("Plane not found");
        } else {
            this.flights.add(new Flight(this.planeList.get(planeID), departureCode, destinationCode));
        }

    }

    public void start() {
        handleAirportPanel();
        System.out.println("");
        handleFlightService();
    }

    public void handleAirportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        String input;
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            input = reader.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                addPlane();
            } else if (input.equals("2")) {
                addFlight();
            }
        }

    }

    public void handleFlightService() {
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println("");
        
        String input;
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            input = reader.nextLine();
            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                printPlanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printPlane();
            }
        }
    }

    public void printPlanes() {
        for (String planeID : this.planeList.keySet()) {
            System.out.println(this.planeList.get(planeID));
        }
    }

    public void printFlights() {        
        for (Flight flight : this.flights) {
            System.out.println(flight);
        }        
    }

    public void printPlane() {
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        if (this.planeList.containsKey(planeID)) {
            System.out.println(this.planeList.get(planeID));
        }

    }

}
