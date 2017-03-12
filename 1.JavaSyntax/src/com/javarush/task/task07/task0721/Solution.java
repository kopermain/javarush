package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        int maximum = 0 ;
        int minimum = 0;

        //напишите тут ваш код

        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(list);

//        for (int i = 0; i < 20; i++) {
//            if (minimum == 0){
//                minimum = list[i];
//            }else{
//                minimum = Math.min(minimum, list[i]);
//            }
//
//            maximum = Math.max(maximum, list[i]);
//        }

        maximum = list[19];
        minimum = list[0];

        System.out.print(maximum + " " + minimum);
    }
}
