package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        int maxSize = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayList.add(bufferedReader.readLine());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            maxSize = Math.max(maxSize, arrayList.get(i).length());
        }

        for (int i = 0; i < 5; i++) {
            if (arrayList.get(i).length() == maxSize){
                System.out.println(arrayList.get(i));
            }
        }
    }
}
