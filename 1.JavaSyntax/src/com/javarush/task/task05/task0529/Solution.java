package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        String vstr;
        int chs;

        while (true){
            vstr = bufferedReader.readLine();

            if (vstr.equals("сумма")){
                break;
            }
            chs = Integer.parseInt(vstr);

            summ = summ + chs;

        }

        System.out.println(summ);
    }
}
