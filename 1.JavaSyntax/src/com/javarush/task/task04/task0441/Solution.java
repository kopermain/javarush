package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a >= b && a >= c && b <= c ) System.out.println(c);
        else if (a >= b && a >= c && b >= c ) System.out.println(b);
        else if (b >= a && b >= c && a <= c ) System.out.println(c);
        else if (b >= a && b >= c && a >= c ) System.out.println(a);
        else if (c >= a && c >= b && a <= b ) System.out.println(b);
        else if (c >= a && c >= b && a >= b ) System.out.println(a);
        else if (a ==b && a==c ) System.out.println(a);

    }
}
