package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();
        int max = 0, min = 0;
        //напишите тут ваш код

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
            max = Math.max(max, arrayList.get(i).length());
            if (min == 0)
                min = arrayList.get(i).length();
            else
            min = Math.min(min, arrayList.get(i).length());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == min || arrayList.get(i).length() == max){
                System.out.println(arrayList.get(i));
                break;
            }
        }
    }
}
