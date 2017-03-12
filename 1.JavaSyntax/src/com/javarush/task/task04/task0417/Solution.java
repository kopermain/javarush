package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[3];
        for (int i = 0; i < 3; i++)
            n[i] = Integer.parseInt(reader.readLine());
        if (n[0] == n[1] && n[0] == n[2])
            System.out.println(n[0] + " " + n[0] + " " + n[0]);
        else{
            if (n[0] == n[1])
                System.out.println(n[0] + " " + n[1]);
            if (n[0] == n[2])
                System.out.println(n[0] + " " + n[2]);
            if (n[1] == n[2])
                System.out.println(n[1] + " " + n[2]);
        }

    }
}