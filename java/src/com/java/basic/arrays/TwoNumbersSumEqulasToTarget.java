package com.java.basic.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbersSumEqulasToTarget {

    public static void main(String[] args){

        int[] arr = {2, 7, 11, 15};
        int target=9;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int component=target-arr[i];
            if (map.containsKey(component)){
                System.out.println("Indices:" +map.get(component)+ "," +i);
                System.out.println("Numbers:" +component+ "," +arr[i]);
                return;

            }
            map.put(arr[i],i );
        }
        System.out.println("No pair found");
    }
}
