/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Hossain
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {        
        for (String ch : str2.split("")) {
            if(!str1.contains(ch))return false;
            str1 = str1.replaceFirst(ch, "");
        }
    	return true;
    }
}
