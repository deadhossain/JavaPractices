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
//import java.util.Arrays;
//public class DirReduction {
//    public static String[] dirReduc(String[] arr) {
//        boolean check = false;
//        while(check!=true)
//        {
//            check = true;
//            for (int i = 0; i < arr.length-1; i++) {
//                if (arr[i]==(null) || arr[i+1]==(null))  {
//                    continue;
//                }
//                else if ((arr[i].equals("SOUTH") && arr[i+1].equals("NORTH")) || (arr[i].equals("NORTH") && arr[i+1].equals("SOUTH"))) {
//                    arr[i] = null;
//                    arr[i+1] = null;
//                    check = false;
//                }
//                else if ((arr[i].equals("EAST") && arr[i+1].equals("WEST")) || (arr[i].equals("WEST") && arr[i+1].equals("EAST"))) {
//                    arr[i] = null;
//                    arr[i+1] = null;
//                    check = false;
//                }
//            }
//            arr = Arrays.stream(arr).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
//        }
//        return arr;
//    }
//}

import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
}
