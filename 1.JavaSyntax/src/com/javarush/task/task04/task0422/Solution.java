package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int vozrast = Integer.parseInt(bufferedReader.readLine());

        if (vozrast < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
