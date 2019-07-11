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
public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        for(String s: str.split(" ")){
            System.out.println(s.substring(1)+s.charAt(0)+"ay");
        }
        return str;
    }
}
