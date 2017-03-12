package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("January 1 1980"));
        map.put("Stallone2", new Date("March 2 1980"));
        map.put("Stallone3", new Date("March 3 1980"));
        map.put("Stallone4", new Date("April 4 1980"));
        map.put("Stallone5", new Date("June 5 1980"));
        map.put("Stallone6", new Date("July 6 1980"));
        map.put("Stallone7", new Date("August 7 1980"));
        map.put("Stallone8", new Date("September 8 1980"));
        map.put("Stallone9", new Date("October 9 1980"));
        map.put("Stallone0", new Date("November 10 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Set<Map.Entry<String, Date>> iSet = map.entrySet();
ArrayList<String> list = new ArrayList<String >();
       for (Map.Entry<String , Date> tzap: iSet
             ) {
//
//
//           // while (iter.hasNext()) {
//            //    Map.Entry pair = iter.next();
//                if (tzap.getValue().getMonth() > 4 && tzap.getValue().getMonth() < 8)
//                    iSet.remove(tzap);
//            }
//            if (tzap.getValue().after(new Date("May 31 1980"))) {
//                if (tzap.getValue().before(new Date("August 31 1980"))) iSet.remove(tzap.getKey());
//            }

        //Iterator<Map.Entry<String , Date>> iterator = map.entrySet().iterator();

        //while (iterator.hasNext()) {
          //  Map.Entry pair = iterator.next();
            if (tzap.getValue().getMonth() > 4 && tzap.getValue().getMonth() < 8) {
                list.add(tzap.getKey());
            }
        }
        for (String s : list) {
            map.remove(s);
        }

    }





    public static void main(String[] args) {
        //HashMap<String, Date> tDat = createMap();
        //removeAllSummerPeople(tDat);
    }
}
