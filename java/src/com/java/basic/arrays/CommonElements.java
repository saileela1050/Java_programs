//Find Common Elements in Two Arrays

package com.java.basic.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args){

        int[] arr1={1,3,2,4};
        int[] arr2={4,3,5,8};

        Set<Integer> set= new HashSet<>();
        Set<Integer> common= new HashSet<>();

        for(int num:arr1){
            set.add(num);

        }
        for(int num:arr2){
            if(set.contains(num)){
                common.add(num);
            }

        }
        System.out.println("Common elements: " + common);
    }
}
