package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //создаем масив двухмерный
        int[][] mas = new int[10][10];

        for(int i = 0; i < 10; i++){
            mas[0][i] = i+1;
            mas[i][0] = i+1;
        }

        //printMas(mas);

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                mas[i][j] = mas[0][i] * mas[j][0];
            }
        }

        printMas(mas);

    }

    public static void printMas(int[][] mas){
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
