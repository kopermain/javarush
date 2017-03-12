package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        int yer;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        yer = Integer.parseInt(bufferedReader.readLine());
        name = bufferedReader.readLine();

        System.out.print(name+" захватит мир через "+yer+" лет. Му-ха-ха!");
    }
}
