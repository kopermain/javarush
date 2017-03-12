package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        boolean was = false;
        char[] charArray = s.toCharArray();
        for(int i=0; i < s.length(); i++) {
            if(charArray[i]==' ')
                was=false;
            if(!was && charArray[i]!=' ') {
                charArray[i]=Character.toUpperCase(charArray[i]);
                was=true;
            }
        }
        s = String.valueOf(charArray);
        System.out.println(s);


    }
}
