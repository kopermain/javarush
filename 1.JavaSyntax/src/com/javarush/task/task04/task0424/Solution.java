package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());


        if (a != b & b == c) {
            System.out.println(1);
        }else{
            if (a == c & b != c) {
                System.out.println(2);
            }else{
                if (a == b & b != c) {
                    System.out.println(3);
                }
            }
        }
    }
}
