
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
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
public class JumpSimulator {

    private ArrayList<SkiJumper> jumpers = new ArrayList<SkiJumper>();
    private Random random = new Random();
    private Scanner reader = new Scanner(System.in);
    private int roundCount = 0;

    public void run() {
        String command;
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        registerJumper();
        System.out.println("The tournament begins!\n");
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            command = reader.nextLine();
            if (!command.equals("jump")) {
                break;
            }
            generateJump();
        }

        System.out.println("Thanks!\n");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        printTournamentResult();
    }

    private void generateJump() {
        this.roundCount++;
        System.out.println("\nRound " + this.roundCount + "\n");
        System.out.println("Jumping order:");
        Collections.sort(jumpers);

        printJumpersOrder();
        System.out.println("Results of round " + this.roundCount);
        calculateScore();
    }

    private void calculateScore() {
        int jumpLength;
        int[] jumpScore;

        for (SkiJumper jumper : this.jumpers) {

            jumpLength = generateNumberBetween(60, 120);
            jumpScore = generateScore();
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumpLength);
            System.out.println("    judge votes: " + scoreToString(jumpScore) + "\n");

            jumper.addPoint(scoreSum(jumpScore, jumpLength));
            jumper.addJumpLength(jumpLength);
        }

    }

    private void registerJumper() {
        String name;
        while (true) {
            System.out.print("  Participant name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                break;
            }
            jumpers.add(new SkiJumper(name));
            System.out.println("");
        }
    }

    public void printJumpersOrder() {
        int count = 1;
        for (SkiJumper jumper : this.jumpers) {
            System.out.println("  " + count++ + ". " + jumper);
        }
        System.out.println("");
    }

    private int generateNumberBetween(int low, int hight) {
        return random.nextInt(hight - low) + low;
    }

    public int[] generateScore() {
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            scores[i] = generateNumberBetween(10, 20);
        }
        return scores;
    }

    public String scoreToString(int[] scores) {
        String scoresString = "[";
        for (int i = 0; i < scores.length; i++) {
            scoresString += scores[i];
            if (i + 1 < scores.length) {
                scoresString += ", ";
            } else {
                scoresString += "]";
            }
        }
        return scoresString;
    }

    public int scoreSum(int[] scores, int jumpLength) {
        int total = 0;
        Arrays.sort(scores);
        for (int i = 1; i < scores.length - 1; i++) {
            total += scores[i];
        }
        return total + jumpLength;
    }

    public void printTournamentResult() {
        int i = 1;
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (SkiJumper jumper : this.jumpers) {
            System.out.println(i++ + "           " + jumper);
            System.out.println("             " + jumper.jumpLengthsToString());
        }
    }
}
