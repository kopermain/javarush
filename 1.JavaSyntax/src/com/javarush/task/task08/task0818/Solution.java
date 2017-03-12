package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String , Integer> map = new HashMap<String , Integer>();

        map.put("1", 100);
        map.put("2", 200);
        map.put("3", 300);
        map.put("4", 400);
        map.put("5", 500);
        map.put("6", 600);
        map.put("7", 700);
        map.put("8", 800);
        map.put("9", 900);
        map.put("10", 1000);

        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<String> keys = new ArrayList<String>();

        for (Map.Entry<String, Integer> zapis :
                map.entrySet()) {
            if (zapis.getValue() < 500) keys.add(zapis.getKey());
        }

        for (int i = 0; i < keys.size(); i++) {
            map.remove(keys.get(i));
        }

    }

    public static void main(String[] args) {

    }
}