/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Zun
 */
public class MindfulDictionary {

    private Map<String, String> finnishToEnglishDict = new HashMap<String, String>();
    private Map<String, String> englishToFinnishDict = new HashMap<String, String>();
    private String fileName;

    public MindfulDictionary(String fileName) {
        this.fileName = fileName;
    }

    public MindfulDictionary() {
        this.fileName = null;
    }

    public void add(String word, String translation) {
        if (!this.finnishToEnglishDict.containsKey(word)) {
            this.finnishToEnglishDict.put(word, translation);
        }
        if (!this.englishToFinnishDict.containsKey(word)) {
            this.englishToFinnishDict.put(translation, word);
        }
    }

    public String translate(String word) {
        if (this.finnishToEnglishDict.containsKey(word)) {
            return this.finnishToEnglishDict.get(word);

        } else if (this.englishToFinnishDict.containsKey(word)) {
            return this.englishToFinnishDict.get(word);

        }
        return null;
    }

    public void remove(String word) {
        if (this.finnishToEnglishDict.containsKey(word)) {
            this.englishToFinnishDict.remove(this.finnishToEnglishDict.remove(word));
        }
        if (this.englishToFinnishDict.containsKey(word)) {
            this.finnishToEnglishDict.remove(this.englishToFinnishDict.remove(word));
        }
    }

    public boolean load() {
        Scanner fileReader;
        String[] parts;
        String line;
        try {
            fileReader = new Scanner(new File(this.fileName));
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            fileReader.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(new File(this.fileName));
            for (String key : this.finnishToEnglishDict.keySet()) {
                fileWriter.write(key + ":" + this.finnishToEnglishDict.get(key)+ "\n");
            }
            fileWriter.close();
            return true;

        } catch (Exception e) {
            return false;
        }

    }

}
