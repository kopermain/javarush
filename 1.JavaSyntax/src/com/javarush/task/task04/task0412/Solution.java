package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int chs = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if(chs > 0){
            System.out.print(chs*2);
        }else {
            if(chs < 0){
                System.out.print(chs+1);
            }else{
                System.out.print(chs);
            }
        }

    }

}