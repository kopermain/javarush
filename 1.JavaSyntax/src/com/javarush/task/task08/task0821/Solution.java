package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String > result = new HashMap<String , String >();

        result.put("1", "11");
        result.put("2", "22");
        result.put("3", "33");
        result.put("4", "44");
        result.put("5", "55");
        result.put("6", "55");
        result.put("7", "7");
        result.put("8", "8");
        result.put("8", "9");
        result.put("10", "10");

        return result;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
