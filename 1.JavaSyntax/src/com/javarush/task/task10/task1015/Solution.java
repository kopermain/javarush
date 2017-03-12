package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[]{new ArrayList<String >(), new ArrayList<String >(),new ArrayList<String >(),new ArrayList<String >()};
        for (int i = 0; i < 4; i++) {
            list[i] = new ArrayList<>();
            list[i].add("list" + " " + i);
            list[i].add("list" + " " + i + "." + 1);
        }
        return list;

    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}