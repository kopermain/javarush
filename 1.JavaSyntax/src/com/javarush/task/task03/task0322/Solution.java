package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        String name1, name2, name3;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        name1 = bufferedReader.readLine();
        name2 = bufferedReader.readLine();
        name3 = bufferedReader.readLine();

        System.out.print(name1+" + "+name2+" + "+name3+" = Чистая любовь, да-да!");
    }
}