package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int god = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        //for (float i = god; i < god+100; i++) {

          //  System.out.print(i+"  ");

            //Каждый 4 год высокосный
            if (god % 4 == 0) {
                //Столетия не кратно 400
                if (god % 100 == 0 & god % 400 != 0) {
                    System.out.println("количество дней в году: 365");
                } else {
                    System.out.println("количество дней в году: 366");
                }
            } else {
                //Год не высокосный
                System.out.println("количество дней в году: 365");
            }
        //}
    }
}