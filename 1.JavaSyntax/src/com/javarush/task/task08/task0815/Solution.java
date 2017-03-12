package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("dog1", "mak");
        hashMap.put("sok2", "lok");
        hashMap.put("for3", "dd");
        hashMap.put("ss4", "dd");
        hashMap.put("ss5", "vs");
        hashMap.put("wee6", "wevw");
        hashMap.put("wev7", "ewv");
        hashMap.put("ev8", "evw");
        hashMap.put("ve9", "ev");
        hashMap.put("ev99", "rr");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int max = 0;
        Set< Map.Entry<String, String > > entrySet = map.entrySet();

        for (Map.Entry<String , String > zap : entrySet ) {
            if (zap.getValue().equals(name)) max++;
        }

        return max;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int max = 0;
        Set< Map.Entry<String, String > > entrySet = map.entrySet();

        for (Map.Entry<String , String > zap : entrySet ) {
            if (zap.getKey().equals(lastName)) max++;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
