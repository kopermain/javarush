package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "G:/test2.txt";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileName = reader.readLine();
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            while (true){
                String stokaD = reader.readLine();
                bufferedWriter.write(stokaD);
                if (stokaD.equals("exit"))
                    break;
                bufferedWriter.newLine();
            }

        }catch (Exception e){
            e.getMessage();
        }

        try {
            if (bufferedWriter != null)
                bufferedWriter.close();
            if (fileWriter != null)
                fileWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
