///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package UVA;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
///**
// *
// * @author Hossain
// */
//public class Main {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int times = sc.nextInt();
//        int coinNumber, s1 = 0, s2 = 0;
//        ArrayList<Integer> ar = new ArrayList();
//        while (times-->0) {            
//            coinNumber = sc.nextInt();
//            ar.clear();
//            s1 = 0; s2 = 0;
//            while (coinNumber-->0) {                
//                ar.add(sc.nextInt());
//            }
//            ar.sort(Comparator.reverseOrder());
//            s1 = ar.remove(0);
//            s2 = ar.remove(ar.size()-1);
//            for (int coin : ar) {
//                if (s1>s2) {
//                    s2 += coin;
//                }
//                else
//                {
//                    s1 += coin;
//                }
//            }
//            System.out.println(Math.abs(s1-s2));
//        }
//    }
//    
//}

import java.io.*;
import java.util.*;

class Main{
    
    public static int seriesLength(int m, int n)
    {
        int count =1;
        do
        {
            count++;
            if(m%2==0)
                m /= 2;
            else
                m = 3*m+1;
            System.out.println(m);
        }while(m!=1);
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println(seriesLength(1, 10));

//        ArrayList<Integer> coinList = new ArrayList<>();
//        ArrayList<Integer> resultList = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int times = sc.nextInt();
//        int coinCount,s1,s2;
//        while(times-->0)
//        {   
//            coinCount = sc.nextInt();
//            s1=0;
//            s2=0;
//            coinList.clear();
//            while(coinCount-->0)
//            {
//                coinList.add(sc.nextInt());
//            }
//            
//            coinList.sort(Comparator.reverseOrder());
//            s1 = coinList.remove(0);
//            s2 = coinList.remove(coinList.size()-1);
//            for (Integer coin : coinList) {
//                if (s1>s2) {
//                    s2 += coin;
//                }
//                else
//                {
//                    s1 += coin;
//                }            
//            }
//            resultList.add(Math.abs(s2-s1));
//        }
//        
//        for (Integer result : resultList) {
//            System.out.println(result);
//        }

    
    }
}
