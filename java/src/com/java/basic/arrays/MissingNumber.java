// find only one missing number in the given array
// not important

package com.java.basic.arrays;

public class MissingNumber {

    public static void main(String[] args){

        int[] arr={1,2,3,5,6};
        int n=6;
        int expectedsum=n* (n+1)/2;
        int actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        int missingNumber=expectedsum-actualsum;

        System.out.println("Missing Number:" +missingNumber);
    }
}
