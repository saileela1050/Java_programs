// frequency of each element

package com.java.basic.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {

    public static void main(String[] args){

        int[] arr={2,7,3,2,9,2,4,7};
        Map<Integer,Integer> frequency=new HashMap<>();

        for(int num: arr){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:frequency.entrySet()){
            System.out.println(entry.getKey()+ "=" +entry.getValue());
        }
    }
}
