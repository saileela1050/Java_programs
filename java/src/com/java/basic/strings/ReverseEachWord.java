// Reverse Each Word in a Sentence

package com.java.basic.strings;

public class ReverseEachWord {

    public static void main(String[] args){

        String str="java is easy";

        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();

        for(String word:words){
            StringBuilder reversed=new StringBuilder(word).reverse();
            result.append(reversed).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
