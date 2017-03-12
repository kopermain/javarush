package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;//четные
    public static int odd;//не четные

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strk = bufferedReader.readLine();

        for (int i = 0; i < strk.length(); i++) {
            int cif = (int) strk.charAt(i);

            if (cif % 2 == 0) {
                Solution.even++;
            } else {
                Solution.odd++;
            }

        }

        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);

    }
}
