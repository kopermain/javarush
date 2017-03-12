package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(20,12.5));
        System.out.println(convertEurToUsd(60, 34.8));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur*course;
    }
}
