// Find the First Non-Repeating Element in an Array
package com.java.basic.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

    public static void main(String[] args){

        int[] arr={2,4,5,1,2,4,7};

        Map<Integer,Integer> map= new HashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(map.get(num)==1){
                System.out.println("First non-repeating element: " + num);
                return;
            }
        }
        System.out.println("No non-repeating element found");
    }
}
