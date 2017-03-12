package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int i = 10, k ;

        while (i > 0 ){
            k=9;
            while (k > 0 ){
                System.out.print("S");
                k--;
            }
            System.out.println("S");
            i--;
        }

    }
}
