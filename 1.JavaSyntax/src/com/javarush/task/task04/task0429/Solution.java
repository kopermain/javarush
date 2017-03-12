package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int k = 0;
        int km = 0;

        if (a > 0) {
            k++;
        }else {
            if (a<0) {
                km++;
            }
        }

        if (b > 0) {
            k++;
        }else {
            if (b<0) {
                km++;
            }
        }

        if (c > 0) {
            k++;
        }else {
            if (c<0) {
                km++;
            }
        }

        System.out.println("количество отрицательных чисел: "+km);
        System.out.println("количество положительных чисел: "+k);

    }
}
