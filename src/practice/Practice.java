/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Hossain
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public int multiply(int n)
    {
        int result = 1;int digit;
        while(n>1){
            digit = n%10;
            result = result*digit;
            n = n / 10;
        }
        return result;
    }
    
    public int persisitence(int n)
    {
        int count = 0;
        if (n<10)
        {
            return 0;
        }
        else
        {
            while (n>9){
                n = multiply(n);
                System.out.println(n);
                count = count + 1;
            }
            return count;
        }
    }
    
    public static String listSquared(long m, long n) {
        long squareSum;
        double sqrt;
        String result ="[";
        for(long i=m; i<=n;i++)
        {
            squareSum = 0;
            for(int j=1; j<=i;j++)
            {
                if(i%j==0)
                {
                    squareSum += j*j;
                }
            }
            sqrt = Math.sqrt(squareSum) - (int) Math.sqrt(squareSum) ;
            if (sqrt==0)
            {
                result += "["+i+","+squareSum+"], ";
                
            }
            
        }
        if(result.length()>2)
        {
            result = result.substring(0, result.length() - 2);
        }
        
        result +="]";
        return result;
    }
    
    public static int findShort(String s) {
        int count = 0;
        int min = s.length();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isWhitespace(s.charAt(i)))
            {
                if(min>count)min = count;
                count = 0;
                continue;
            }
            count++;
        }
        if(min>count)min = count;
        System.out.println(min);
        return min;
    }
    
    public static void main(String[] args) {
        
        ToSmallest.smallest(261235);
        ToSmallest.smallest(209917);
        ToSmallest.smallest(285365);
        ToSmallest.smallest(269045);
        ToSmallest.smallest(296837);
        
        
        
//        PigLatin.pigIt("Pig latin is cool");
//        long startTime = System.nanoTime();
//        System.out.println(Arrays.toString(BuddyPairs.buddy(10,50))) ;
//        long stopTime = System.nanoTime();
//        System.out.println(stopTime - startTime);

//        SnakesLadders game = new SnakesLadders();
//        System.out.println(game.play(1, 1));
//        System.out.println(game.play(1, 5));
//        System.out.println(game.play(6, 2));
//        System.out.println(game.play(1, 1));


//        System.out.println(game.play(1, 1));
//        System.out.println(game.play(1, 5));
//        System.out.println(game.play(6, 4));
//        System.out.println(game.play(2, 2));
//        System.out.println(game.play(2, 5));
//        System.out.println(game.play(3, 3));
//        System.out.println(game.play(3, 6));
//        System.out.println(game.play(1, 5));
//        System.out.println(game.play(3, 3));
//        System.out.println(game.play(5, 6));
//        System.out.println(game.play(6, 1));
//        System.out.println(game.play(4, 1));
//        System.out.println(game.play(3, 1));
//        System.out.println(game.play(1, 5));
//        System.out.println(game.play(6, 4));
//        System.out.println(game.play(5, 5));
//        System.out.println(game.play(1, 3));
//        System.out.println(game.play(4, 2));
//        System.out.println(game.play(6, 6));
//        System.out.println(game.play(1, 3));
//        System.out.println(game.play(3, 5));
//        System.out.println(game.play(4, 4));
//        System.out.println(game.play(1, 5));
//        System.out.println(game.play(1, 1));
//        System.out.println(game.play(3, 5));

//Game #1 move #1 {1, 1}: Player 1 is on square 38
//Game #1 move #2 {1, 5}: Player 1 is on square 44
//Game #1 move #3 {6, 4}: Player 2 is on square 10
//Game #1 move #4 {2, 2}: Player 1 is on square 48
//Game #1 move #5 {2, 5}: Player 1 is on square 55
//Game #1 move #6 {3, 3}: Player 2 is on square 6
//Game #1 move #7 {3, 6}: Player 2 is on square 26
//Game #1 move #8 {1, 5}: Player 1 is on square 61
//Game #1 move #9 {3, 3}: Player 2 is on square 32
//Game #1 move #10 {5, 6}: Player 2 is on square 43
//Game #1 move #11 {6, 1}: Player 1 is on square 68
//Game #1 move #12 {4, 1}: Player 2 is on square 48
//Game #1 move #13 {3, 1}: Player 1 is on square 72
//Game #1 move #14 {1, 5}: Player 2 is on square 54
//Game #1 move #15 {6, 4}: Player 1 is on square 82
//Game #1 move #16 {5, 5}: Player 2 is on square 60
//Game #1 move #17 {1, 3}: Player 2 is on square 60
//Game #1 move #18 {4, 2}: Player 1 is on square 88
//Game #1 move #19 {6, 6}: Player 2 is on square 72
//Game #1 move #20 {1, 3}: Player 2 is on square 76
//Game #1 move #21 {3, 5}: Player 1 is on square 96
//Game #1 move #22 {4, 4}: Player 2 is on square 84
//Game #1 move #23 {1, 5}: Player 2 is on square 90
//Game #1 move #24 {1, 1}: Player 1 is on square 98
//Game #1 move #25 {3, 5}: Player 1 is on square 112
    }
    
}
