package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        a[0] = Integer.parseInt(reader.readLine());
        a[1] = Integer.parseInt(reader.readLine());
        a[2] = Integer.parseInt(reader.readLine());
        a[3] = Integer.parseInt(reader.readLine());
        a[4] = Integer.parseInt(reader.readLine());
        int t;

        //напишите тут ваш код

        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
               if (a[i] > a[j]){
                   t = a[i];
                   a[i] = a[j];
                   a[j] = t;
               }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

    }
}
