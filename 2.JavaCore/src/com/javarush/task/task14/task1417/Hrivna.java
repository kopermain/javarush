package com.javarush.task.task14.task1417;

/**
 * Created by Виктор on 08.03.2017.
 */
public class Hrivna extends Money{

    public Hrivna(double amount) {
        super(amount);
    }

    public  String getCurrencyName() {
        return "HRN";
    }

}