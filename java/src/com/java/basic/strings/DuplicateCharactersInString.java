// duplicate characters in the given string

package com.java.basic.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharactersInString {

    public static void main(String[] args){

        String str="Programming";

        Map<Character,Integer> frequency= new LinkedHashMap<>();

        for(char ch:str.toCharArray()){
          //  frequency.get(frequency.getOrDefault(ch,0)+1);
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
       // for(char ch:str.toCharArray()){

        for(Map.Entry<Character,Integer> entry: frequency.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ "=" +entry.getValue());
            }
        }
    }
}
