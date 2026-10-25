// Find the Maximum Difference Between Two Elements in an Array


package com.java.basic.arrays;

public class MaximumDiffBtwTwoElements {

    public static void main(String[] args){

        int[] arr={2,4,3,1,8,9};

        int minElement=arr[0];
        int maxDifference=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            int difference=arr[i]-minElement;

            if(difference>maxDifference){
                maxDifference=difference;
            }
            if(arr[i]<minElement){
                minElement=arr[i];

            }
        }
        System.out.println("Maximum Difference:" +maxDifference);
    }
}
