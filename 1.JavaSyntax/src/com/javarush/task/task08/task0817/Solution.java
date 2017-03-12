package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        hashMap.put("3", "3");
        hashMap.put("4", "4");
        hashMap.put("5", "5");
        hashMap.put("6", "5");
        hashMap.put("7", "7");
        hashMap.put("8", "8");
        hashMap.put("9", "9");
        hashMap.put("10", "10");

        return hashMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String , String > copy = new HashMap<String , String >(map);
        ArrayList<String > spisok = new ArrayList<String >();

        for (Map.Entry<String , String >  zap: map.entrySet()
             ) {
            int povtor = 0;
            for (Map.Entry<String , String > cZap: copy.entrySet()
                 ) {
                if (zap.getValue().equals(cZap.getValue())){
                    povtor++;
                }
            }

            if (povtor > 1) spisok.add(zap.getValue());
        }

        for (int i = 0; i < spisok.size(); i++) {
            removeItemFromMapByValue(map, spisok.get(i));
        }

    }



    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
