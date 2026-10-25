// Find Duplicate Words in a Sentence


package com.java.basic.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWords
{
    public static void main(String[] args) {

        String str = "java easy java oops easy ";

        String[] words=str.split("\\s+");
        Map<String,Integer> map=new LinkedHashMap<>();

        for(String word:words){
           // map.put(word,map.getOrDefault(word,0)+1);
            map.put(word, map.getOrDefault(word, 0) + 1);

        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
    }
