package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        /*
        System.out.print(Math.max(Math.max(a,b),c)+" ");
        System.out.print(Math.min(Math.max(a,b),Math.max(b,c))+" ");
        System.out.print(Math.min(Math.min(a,b),c)+" ");
        */

        int n1, n2, n3;
        if (a >= b)
        {
            n2 = a; n3 = b;
        }
        else
        {
            n2 = b; n3 = a;
        }
        if (c <= n3)
        {
            n1 = n2; n2 = n3; n3 = c;
        }
        else if (c >= n3 && c <= n2)
        {
            n1 = n2; n2 = c;
        }
        else
        {
            n1 = c;
        }
        System.out.println(n1 + " " + n2 + " " + n3);

    }
}
