
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
public class PhoneBookUI {

    private PhoneBook phonebook;
    private Scanner reader;

    public PhoneBookUI() {
        this.phonebook = new PhoneBook();
        this.reader = new Scanner(System.in);
    }

    public void run() {
        printCommands();
        String command, name, number, street, city, info;

        while (true) {
            System.out.println("");
            System.out.print("command: ");
            command = reader.nextLine();

            if (command.equals("1")) {
                System.out.print("whose number: ");
                name = reader.nextLine();
                System.out.print("number: ");
                number = reader.nextLine();
                this.phonebook.addNumber(name, number);

            } else if (command.equals("2")) {
                System.out.print("whose number: ");
                name = reader.nextLine();
                number = this.phonebook.searchPhoneNumberByName(name);
                System.out.println(number);

            } else if (command.equals("3")) {
                System.out.println("number: ");
                number = reader.nextLine();
                name = this.phonebook.searchPersonByPhoneNumber(number);
                System.out.println(name);

            } else if (command.equals("4")) {
                System.out.print("whose address: ");
                name = reader.nextLine();
                System.out.print("street: ");
                street = reader.nextLine();
                System.out.print("city: ");
                city = reader.nextLine();
                this.phonebook.addAdress(name, street, city);

            } else if (command.equals("5")) {
                System.out.print("whose information: ");
                name = reader.nextLine();
                info = this.phonebook.searchPersonalInfo(name);
                System.out.println(info);
                
            } else if (command.equals("6")) {
                System.out.print("whose information: ");
                name = reader.nextLine();
                this.phonebook.deletePersonByName(name);
                
            } else if (command.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                name = reader.nextLine();
                info = this.phonebook.filteredSearch(name);
                System.out.println(info);
                
            } else if (command.equals("x")) {
                break;
            }

        }
    }

    public void printCommands() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

}
