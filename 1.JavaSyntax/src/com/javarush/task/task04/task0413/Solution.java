package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int chs = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        switch (chs){
            case 1:
                System.out.print("понедельник");
                break;
            case 2:
                System.out.print("вторник");
                break;
            case 3:
                System.out.print("среда");
                break;
            case 4:
                System.out.print("четверг");
                break;
            case 5:
                System.out.print("пятница");
                break;
            case 6:
                System.out.print("суббота");
                break;
            case 7:
                System.out.print("воскресенье");
                break;
            default:
                System.out.print("такого дня недели не существует");
        }

    }
}