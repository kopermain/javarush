package com.javarush.task.task14.task1421;


/**
 * Created by Виктор on 08.03.2017.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null) {
            return instance;
        }else {
            return new Singleton();
        }
    }
}
