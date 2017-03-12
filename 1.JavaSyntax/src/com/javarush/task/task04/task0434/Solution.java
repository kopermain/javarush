package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int str = 1, stl;

        while (str <= 10){
            stl = 1;
            while (stl < 10){
                System.out.print(" "+(str*stl));
                stl++;
            }
            System.out.println(" "+(str*stl));
            str++;
        }

    }
}
