
import java.io.File;
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
public class Printer {

    private Scanner reader;
    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        String readLine;
        this.reader = new Scanner(this.file, "UTF-8");
        while (this.reader.hasNextLine()) {
            readLine = reader.nextLine();
            if (readLine.contains(word) || word.isEmpty()) {
                System.out.println(readLine);
            }
        }
        reader.close();
    }

}
