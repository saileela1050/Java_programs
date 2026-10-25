// // find  missing numbers in the given array
package com.java.basic.arrays;

import java.rmi.server.RMIServerSocketFactory;
import java.util.ArrayList;
import java.util.List;

public class MisiingNumbers {


    public static void main(String[] args){

        int[] arr={1,2,3,4,5,7,9,15};
        int n=15;

        boolean[] present=new boolean[n+1];

        for(int num:arr) {
            if (num >= 1 && num <= n) {
                present[num] = true;
            }
        }
            List<Integer> missing= new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(!present[i]){
                    missing.add(i);
                }
            }
            System.out.println("Missing numbers: " + missing);
        }
    }

