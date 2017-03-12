package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = bufferedReader.readLine();
        return stroka;
    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int chs = Integer.parseInt(bufferedReader.readLine());
        return chs;
    }

    public static double readDouble() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double ches = Double.parseDouble(bufferedReader.readLine());
        return ches;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean bool = Boolean.parseBoolean(bufferedReader.readLine());
        return bool;
    }

    public static void main(String[] args) {

    }
}
