
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();
        String name;
        String studentNumber;
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();

            studentList.add(new Student(name, studentNumber));
        }

        for (Student std : studentList) {
            System.out.println(std);
        }

        System.out.println("Give search tearm: ");
        String result = reader.nextLine();
        System.out.println("result");

        for (Student std : studentList) {
            if (std.getName().contains(result)) {
                System.out.println(std);
            }
        }
    }
}
