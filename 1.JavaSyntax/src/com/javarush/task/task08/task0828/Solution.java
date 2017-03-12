package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String readName;
        int number;

        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");

        while (true){
            readName = reader.readLine();
            number = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(readName)){
                    number = i+1;
                    break;
                }
            }
            if (number == 0) {
                System.out.println("Месяц не найден.");
            }else{
                System.out.println(readName+" is "+number+" month");
            }
            break;
        }


    }
}
