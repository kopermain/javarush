package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int max = 1;
//
//        for (int i = 0; i < 10; i++) {
//            list.add(Integer.parseInt(bufferedReader.readLine()));
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//           //max = Math.max(max, Collections.frequency(list, list.get(i)));
//            int tch = 0;
//            int tekKol = 0;
////            for (int j = 0; j < list.size(); j++) {
////                if (list.get(j) == tch) tekKol++;
////            }
////            max = Math.max(max, tekKol);
//            if (tch != list.get(i)){
//                tch = list.get(i);
//                tekKol = 1;
//            }else {
//                tekKol++;
//            }
//            max = Math.max(max, tekKol);
//        }
//
//        System.out.print(max);

        int iSeq = 1, iMaxSeq = 0;

        for(int i = 0; i < 10; i++) {
            list.add(Integer.valueOf(bufferedReader.readLine()));

            if (i > 0)
                if (list.get(i).intValue() == list.get(i-1).intValue())
                    iSeq++;
                else
                    iSeq = 1;

            if (iSeq > iMaxSeq)
                iMaxSeq = iSeq;
        }

        System.out.println(iMaxSeq);
    }

}