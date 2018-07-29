
import java.util.ArrayList;
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
public class Birdwatcher {

    ArrayList<Bird> birds = new ArrayList<Bird>();
    Scanner scanner;

    public Birdwatcher(Scanner scanner) {
        this.scanner = scanner;
        this.start();
    }

    public void start() {
        String command, bird;
        while (true) {
            System.out.print("? ");
            command = this.scanner.nextLine();
            if (command.equals("Add")) {
                this.addBird();
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:?");
                bird = this.scanner.nextLine();
                this.observed(bird);
            } else if (command.equals("Statistics")) {
                this.printStatistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                bird = this.scanner.nextLine();
                this.printBird(bird);
            } else if (command.equals("Quit")) {
                break;
            }

        }
    }

    public void addBird() {
        String name, latinName;

        System.out.print("Name: ");
        name = this.scanner.nextLine();
        System.out.print("Latin Name: ");
        latinName = this.scanner.nextLine();
        this.birds.add(new Bird(name, latinName));

    }

    public void observed(String name) {
        for (Bird bird : this.birds) {
            if (bird.getType().equals(name)) {
                bird.inObservationCount();
                break;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void printStatistics() {
        for (Bird bird : this.birds) {
            System.out.println(bird.toString());
        }
    }

    public void printBird(String name) {
        for (Bird bird : this.birds) {
            if (bird.getType().equals(name)) {
                System.out.println(bird.toString());

                break;
            }
        }
    }

}
