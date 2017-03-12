package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);
//        int[] sortArr = array.clone();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < i; j++) {
//                min = Math.min(min, array[j]);
//            }
//            if (i == 10 && i == 11) {
//                System.out.println(min);
//            }
//        }
    }
}
