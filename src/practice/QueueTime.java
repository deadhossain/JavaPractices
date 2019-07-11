/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Arrays;
import static java.util.Arrays.sort;


/**
 *
 * @author Hossain
 */
public class QueueTime {
    public int minimumValue(int []arr)
    {
        sort(arr);
//        System.out.println(Arrays.toString(arr)); 
        int i = 0,length = arr.length;
        while(i<length && arr[i]<=0)
        {
            i++;
        }
//        System.out.println(arr[i]); 
        return (arr[i]<=0)?0:arr[i];
    }
    
    public int queueTime(int[] arr, int tills)
    {
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, 3))); 
        int min = 0,sum = 0,arrRange=tills;
        int length = arr.length;

        for (int i = tills; i < length; i++) {
            min = minimumValue(Arrays.copyOfRange(arr, 0, tills));
            sum = sum + min;
            for (int j = 0; j <tills; j++) {
                if (arr[j]>0) {
                    arr[j] = arr[j] - min;
                }
            }
            tills++;
            System.out.println(Arrays.toString(arr)); 
        }
        System.out.println("sum="+sum);
        return 0;
    }
}
