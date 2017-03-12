package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Math.max(Math.max(Math.max(a, b), c), d));

        /*
        if (a>b & a>c & a>d){
            System.out.print(a);
        }else {
            if (b>a & b>c & b>d){
                System.out.print(b);
            }else{
                if (c>a & c>b & c>d){
                    System.out.print(c);
                }else{
                    System.out.print(d);
                }
            }
        }*/
    }
}
