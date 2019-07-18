/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Hossain
 */
public class ToSmallest {
    public static void smallest(long n) {
        System.out.println("real " + n);
        String longNumber = Long.toString(n);
        int smallest = Integer.MAX_VALUE ;
        int smallestIndex = -1;
        int number;
        int current = -1;

        
        for (int i = 0; i < longNumber.length(); i++) {
            number = Character.getNumericValue(longNumber.charAt(i)); 
            if(number<=smallest)
            {
                smallest = number;
                smallestIndex = i;
            }
        }
        
        for (int i = 0; i < longNumber.length(); i++) {
            number = Character.getNumericValue(longNumber.charAt(i)); 
            if(number>smallest)
            {
                System.out.println(longNumber.substring(0, i+1)+ longNumber.charAt(smallestIndex)+longNumber.substring(i+1, smallestIndex)+longNumber.substring(smallestIndex+1, longNumber.length()));
                return;
            }
        }
        
    }
}