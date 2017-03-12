package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            int[] i = new int[1];
            i[20] = 3;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            byte[] i = new byte[1];
            i[1] = (char)9*9/30;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            float i = 2 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[-1];
            i[20] = 3;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            float i = 4/0 ;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            float i = 5 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            float i = 6 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            float i = 7 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            float i = 8 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }



    }
}
