package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        double minut = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        double ostan = minut % 5;

        if ((ostan >= 0) && (ostan <3)) {
            System.out.println("зелёный");
        }
        if ((ostan >=3) && (ostan <4)) {
            System.out.println("желтый");
        }
        if ((ostan >=4) && (ostan <5)) {
            System.out.println("красный");
        }
    }
}