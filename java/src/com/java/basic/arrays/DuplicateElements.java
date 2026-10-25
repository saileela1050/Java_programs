// print duplicate elements in the given array

package com.java.basic.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args){

        int[] arr={1,2,4,3,1,2,4};

        Set<Integer> seen= new HashSet<>();
        Set<Integer> duplicates= new HashSet<>();

        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
       System.out.println("duplicate elements:" +duplicates);
    }
}
