package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        int i = Integer.parseInt(bufferedReader.readLine());

        while (i > 0){
            System.out.println(str);
            i--;
        }

    }
}
