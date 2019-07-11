/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.math.BigInteger;

/**
 *
 * @author Hossain
 */
public class SumFct {
    public static BigInteger perimeter(BigInteger n) {

        BigInteger i1= BigInteger.ZERO;
        BigInteger i2= BigInteger.ONE;
        BigInteger sum= BigInteger.ONE;
        BigInteger temp;
        n = n.add(BigInteger.valueOf(1));
        for (BigInteger i = BigInteger.ONE; i.compareTo(n)==-1; i = i.add(BigInteger.valueOf(1))) {
            temp = i2;
            i2 = i2.add(i1);
            i1 = temp;
            sum = sum.add(i2);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}
