/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Hossain
 */
public class Line {
   public static String WhoIsNext(String[] names, long n)
   {
       while(n>5)
       {
           n = n-4;
           n = n/2;
       }
       System.out.println(names[(int)n-1]);
       return names[(int)n-1];
   }
}