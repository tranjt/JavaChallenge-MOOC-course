package file;

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
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        int lines = 0;
        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            reader.nextLine();
            lines++;
        }
        reader.close();
        return lines;
    }

    public int characters() throws Exception {
        int characters = 0, lineCount = 0;
        String line;

        Scanner reader = new Scanner(this.file);
        while (reader.hasNextLine()) {
            line = reader.nextLine();
            lineCount++;
            characters += line.length();
        }
        reader.close();
        return characters + lineCount;
    }

}
