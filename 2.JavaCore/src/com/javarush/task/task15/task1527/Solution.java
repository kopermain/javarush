package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url, key = "", value = "", valueObj = null;
        int nachaloStroki, konecStroki, ravno;

        try {
            url = reader.readLine();
            nachaloStroki = url.indexOf('?');

            while (true) {

                if (nachaloStroki == -1) {
                    break;
                }

                konecStroki = url.indexOf('&', nachaloStroki + 1);
                ravno = url.indexOf('=', nachaloStroki + 1);

                //Нет & нет = (только ключ в конце строки)
                if (konecStroki == -1 && ravno == -1) {
                    key = url.substring(nachaloStroki + 1);

                    //Есть & нет = (только ключ внутри строки)
                } else if (konecStroki != -1 && ravno == -1) {
                    key = url.substring(nachaloStroki + 1, konecStroki);

                    //Нет & есть = (ключ и значение в конце строки)
                } else if (konecStroki == -1 && ravno != -1) {
                    key = url.substring(nachaloStroki + 1, ravno);
                    value = url.substring(ravno + 1);

                    //Есть & есть = (Ключ и значение внутри строки)
                }
                if (konecStroki != -1 && ravno != -1) {

                    //Если равно больше чем конец строки это равно не считается, скорее всего это в следующей паре равно
                    if (konecStroki < ravno) {
                        key = url.substring(nachaloStroki + 1, konecStroki);
                    } else {
                        key = url.substring(nachaloStroki + 1, ravno);
                        value = url.substring(ravno + 1, konecStroki);
                    }

                }

                System.out.print(key + " ");

                if (key.equals("obj")) {
                    valueObj = value;
                }

                nachaloStroki = konecStroki;
            }

            if (valueObj != null) {
                try {
                    double sD = Double.parseDouble(valueObj);
                    alert(sD);
                } catch (RuntimeException e) {
                    alert(valueObj);
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
