package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {

    String name;
    int age;
    char sex;

    public void initialize(String newName){
        name = newName;
    }

    public void initialize(String newName, int newAge){
        name = newName;
        age = newAge;
    }

    public void initialize(String newName, int newAge, char newSex){
        name = newName;
        age = newAge;
        sex = newSex;
    }

    public static void main(String[] args) {

    }
}
