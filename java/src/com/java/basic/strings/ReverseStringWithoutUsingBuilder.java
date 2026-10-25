// Reverse a String Without Using StringBuilder.reverse()


package com.java.basic.strings;

public class ReverseStringWithoutUsingBuilder {

    public static void main(String[] args){

        String str="java developers";
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
    }
}
