package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String >(6);

        list.add("мама");
        list.add("мыла");
        list.add("раму");

//        list.set(0,list.get(0).concat("именно"));
//        list.set(1,list.get(1).concat("именно"));
//        list.set(2,list.get(2).concat("именно"));

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}