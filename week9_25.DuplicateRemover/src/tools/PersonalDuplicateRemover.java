/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Zun
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> list = new HashSet<String>();
    private int duplicate = 0;    

    @Override
    public void add(String characterString) {
        if(this.list.contains(characterString)) {
            this.duplicate++;
        }else {
            this.list.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicate;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }

    @Override
    public void empty() {
        this.list.clear();
        this.duplicate = 0;
    }
    
}
