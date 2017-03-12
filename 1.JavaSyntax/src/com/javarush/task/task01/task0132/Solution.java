package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String str = Integer.toString(number);
        int[] snumber = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            snumber[i] = Integer.parseInt(str.substring(i,i+1));
        }

        for (int i =0; i < snumber.length; i++){
            sum = sum + snumber[i];
        }

        return sum;
    }
}