package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        int chs = 0;
        int kol = 0;

        while (true){

            chs = Integer.parseInt(bufferedReader.readLine());

            if (chs == -1){
                System.out.println((float) summ/kol);
                break;
            }

            summ = summ + chs;
            kol++;

        }
    }
}

