// Merge Two Arrays into a Single Array

package com.java.basic.arrays;

import java.util.Arrays;

public class MergeTwoArraysIntoSingle {

    public static void main(String[] args){

        int[] arr1={1,2,3,4};
        int[] arr2={2,3,4,5};

        int[] merged=new int[arr1.length+arr2.length];

        for(int i=0; i< arr1.length;i++){
            merged[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merged[arr1.length+i]=arr2[i];
        }
        System.out.println("Merged Array:" + Arrays.toString(merged));
    }
}
