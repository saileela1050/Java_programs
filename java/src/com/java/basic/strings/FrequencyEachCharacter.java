package com.java.basic.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyEachCharacter {

    public static void main(String[] args){

        String str="programingese";
        Map<Character,Integer> frequency= new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:frequency.entrySet()){
            System.out.println(entry.getKey()+ "=" +entry.getValue());
        }
    }
}
