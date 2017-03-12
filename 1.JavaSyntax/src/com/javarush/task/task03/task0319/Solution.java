package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        String name ;
        int yer, many;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        name = bufferedReader.readLine();
        yer = Integer.parseInt(bufferedReader.readLine());
        many = Integer.parseInt(bufferedReader.readLine());

        System.out.print(name+" получает "+yer+" через "+many+" лет.");

    }
}
