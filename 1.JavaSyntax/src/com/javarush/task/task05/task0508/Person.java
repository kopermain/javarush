package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {

    String name;
    int age;
    char sex;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getSex(){
        return sex;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setSex(char newSex){
        sex = newSex;
    }

    public static void main(String[] args) {

    }
}
