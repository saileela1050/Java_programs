
//find first non repeating character in the given string

package com.java.basic.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args){

        String str="program";

        Map<Character,Integer> frequency= new LinkedHashMap<>();

        // count the frequency of each character
        for(char ch: str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

       // for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
        //    if (entry.getValue() == 1) {

        //find first non repeating char
        for(char ch: str.toCharArray()){
            if(frequency.get(ch)==1){
                System.out.println("First Non Repeating Character:" +ch);
                return;
            }
        }
    }
}
