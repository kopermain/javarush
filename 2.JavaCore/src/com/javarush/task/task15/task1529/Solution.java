package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";
        int pasanger;

        try {
            key = reader.readLine();

            if (key.equals("helicopter")) {
                result = new Helicopter();
            }else if (key.equals("plane")) {
                pasanger = Integer.parseInt(reader.readLine());

                result = new Plane(pasanger);
            }

            reader.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
