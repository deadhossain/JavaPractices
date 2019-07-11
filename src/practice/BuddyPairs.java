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
public class BuddyPairs {
    
    private static int buddySum(long n)
    {
      int sum = 1;
      for(int i=2;i<=Math.ceil(n/2);i++){
        if(n%i==0){
          sum += i;
        } 
      }
      return sum;
    }
    
    public static long[] buddy(int start,int limit) {
      long test;
      for (int i = start; i < limit; i++) {
        test = buddySum(i);
        if(i<test && i==buddySum(test-1)-1){
          return new long[]{i,test-1};
        }
      }
      return new long[]{};
    }
    
}
