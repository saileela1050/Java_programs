// Find the Second-Largest Element in an Array


package com.java.basic.arrays;

public class SecondLargestElement {

    public static void main(String[] args){

        int[] arr={2,7,9,13,20,25,28,30};
        int secondLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num<largest) {
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("second largest does not exists");
        }else{
            System.out.println("second largest number:" +secondLargest);

        }
    }
}
