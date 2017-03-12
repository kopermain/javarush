package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        ArrayList a = new ArrayList();

        int min;
        if(m>=n){min = n;}else{min=m;}
        for(int i=1;i<=min;i++){if(n%i==0 && m%i==0){a.add(i);}}

        System.out.println(a.get(a.size()-1));
    }
}
