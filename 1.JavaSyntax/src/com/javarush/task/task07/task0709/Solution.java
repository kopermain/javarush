package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        int minStroka = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayList.add(bufferedReader.readLine());
            minStroka = arrayList.get(i).length();
        }

        for (int i = 0; i < arrayList.size(); i++) {
            minStroka = Math.min(minStroka, arrayList.get(i).length());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == minStroka){
                System.out.println(arrayList.get(i));
            }
        }
    }
}
