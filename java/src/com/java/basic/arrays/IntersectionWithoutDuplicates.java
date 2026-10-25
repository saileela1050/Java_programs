// Find the Intersection of Two Arrays Without Duplicates

package com.java.basic.arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionWithoutDuplicates {

    public static void main(String[] args){

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        Set<Integer> set=new HashSet<>();
        Set<Integer> intersection= new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        System.out.println("Intersection:" +intersection);
    }
}
