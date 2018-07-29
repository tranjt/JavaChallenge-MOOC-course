package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> translations = new HashMap<String, Set<String>>();

    @Override
    public void add(String word, String entry) {
        if (this.translations.get(word) == null) {
            this.translations.put(word, new HashSet<String>());
        }
        this.translations.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (this.translations.get(word) != null) {
            return this.translations.get(word);
        }
        return null;
    }

    @Override
    public void remove(String word) {
        this.translations.remove(word);
    }

}
