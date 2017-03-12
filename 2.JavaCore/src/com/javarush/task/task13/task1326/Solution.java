package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        try (BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) {

            while (readFile.ready()){
                list.add(Integer.parseInt(readFile.readLine()));
            }

            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) System.out.println(list.get(i));
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
