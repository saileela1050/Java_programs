// find the Longest Substring Without Repeating Characters

package com.java.basic.strings;

import java.util.HashSet;
import java.util.Set;

public class LongSubstring {

    public static void main(String[] args){

        String str="abcabcded";

        Set<Character> set= new HashSet<>();

        int start=0;
        int maxlength=0;
        int left=0;

        for(int right=0;right<str.length();right++){
            char ch=str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            if(right-left+1>maxlength){
                maxlength=right-left+1;
                start=left;
            }
        }
        String longest=str.substring(start,start+maxlength);
        System.out.println("Longest Substring:" +longest);
        System.out.println("Length:" +maxlength);

    }
}
