package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int razmerArray = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for (int i = 0; i < razmerArray-1; i++) {
            maximum = Math.max(maximum, Integer.parseInt(reader.readLine()));
        }

        System.out.println(maximum);
    }
}
