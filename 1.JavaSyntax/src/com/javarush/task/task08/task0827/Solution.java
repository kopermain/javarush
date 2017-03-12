package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
//        Date dateold = new Date(date);
//        Date tekDate = new Date();
//
//        int dney = (int)(tekDate.getTime()-dateold.getTime())/(24*60*60*1000);
//
//        if ( dney-2 % 2 == 1 ){
//            return true;
//        }else {
//            return false;
//        }

        Date date1 = new Date(date);
        Date date2 = new Date(date1.getYear(), 0, 1);

        return (int)((date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000)) % 2 == 0 ? true : false;
    }

}
