// Find the Third-Largest Distinct Element in an Array


package com.java.basic.arrays;

public class ThirdLargestElements {

    public static void main(String[] args){

        int[] arr={3,6,10,20,5,40};

        Integer first=null;
        Integer second=null;
        Integer third=null;

        for(int num:arr){
            if(first!=null && num==first || second!=null && num==second || third!=null && num==third){
                continue;
            }
            if(first==null || num>first){
                third=second;
                second=first;
                first=num;
            } else if (second==null || num>second) {
                second=first;
                first=num;
            } else if (third==null || num>third) {
                third=num;
            }
        }
       if(third==null){
           System.out.println("Third Largest distinct element does not exist");
       }else{
           System.out.println("Third Largest element:" +third);

       }
    }
}
