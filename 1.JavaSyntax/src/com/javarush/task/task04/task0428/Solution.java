package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int kol = 0;

        if (a>0){
            kol ++;
        }
        if (b>0){
            kol ++;
        }
        if (c>0){
            kol ++;
        }

        System.out.println(kol);
    }
}
