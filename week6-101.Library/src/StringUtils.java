/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zun
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        searched = searched.toLowerCase().trim();
        word = word.toLowerCase();
        return word.contains(searched);
    }
    
}
