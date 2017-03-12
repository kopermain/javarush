package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        String houseCity = reader.readLine();

        if (houseCity.length() > 0 && 0 < addresses.size()) {
            int numberStr = addresses.indexOf(houseCity);
            if (numberStr >= 0 ) {
                String familyCityName = addresses.get(numberStr+1);
                System.out.println(familyCityName);
            }
        }
    }
}
