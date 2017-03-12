package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        if(s.length() == 1 && a != 0){
            if (a%2 == 0 ) System.out.print("четное однозначное число");
            if (a%2 != 0 ) System.out.print("нечетное однозначное число");
        }
        if(s.length() == 2){
            if (a%2 == 0 ) System.out.print("четное двузначное число");
            if (a%2 != 0 ) System.out.print("нечетное двузначное число");
        }
        if(s.length() == 3){
            if (a%2 == 0 ) System.out.print("четное трехзначное число");
            if (a%2 != 0 ) System.out.print("нечетное трехзначное число");
        }



        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);

        if (a < 1 && a > 999) {
            return;
        }

        if (a%2 == 0 && s.length() == 1) {
            System.out.println("четное однозначное число");
        }else {

            if (a%2 != 0 && s.length() == 1) {
                System.out.println("нечетное однозначное число");
            }else{

                if (a%2 == 0 && s.length() == 2) {
                    System.out.println("четное двузначное число");
                }else{
                    if (a%2 != 0 && s.length() == 2) {
                        System.out.println("нечетное двузначное число");
                    }else{
                        if (a%2 == 0 && s.length() == 3) {
                            System.out.println("четное трехзначное число");
                        }else{
                            if (a%2 != 0 && s.length() == 3) {
                                System.out.println("нечетное трехзначное число");
                            }
                        }
                    }
                }
            }

        }



        if (a > 0 || a < 1000){
            if (a%2 == 0 && a < 10 ) {
            System.out.println("четное однозначное число");
        }else{
            if (a%2 != 0 && a < 10 ) {
                System.out.println("нечетное однозначное число");
            }else{
                if (a%2 == 0 && (a > 9 && a < 100)) {
                    System.out.println("четное двузначное число");
                }else{
                    if (a%2 != 0 && (a > 9 && a < 100)) {
                        System.out.println("нечетное двузначное число");
                    }else{
                        if (a%2 == 0 && a > 99 ) {
                            System.out.println("четное трехзначное число");
                        }else{
                            if (a%2 != 0 && a > 99) {
                                System.out.println("нечетное трехзначное число");
                            }else{

                            }
                        }
                    }
                }
            }
        }

    }*/
    }
}
