package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    String name;
    int weight = 3;
    int age = 2;
    String color;
    String address;

    //— Имя,
    //У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
    public void initialize(String newName){
        name = newName;
        color = "r";
    }

    //— Имя, вес, возраст
    //У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String newName, int newWeight, int newAge){
        name = newName;
        weight = newWeight;
        age = newAge;
        color = "r";
    }

    //— Имя, возраст (вес стандартный)
    //У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса
    public void initialize(String newName, int newAge){
        name = newName;
        age = newAge;
        color = "r";
    }

    //— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    //У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
    public void initialize(int newWeight, String newColor){
        weight = newWeight;
        color = newColor;
    }

    //— вес, цвет, адрес (чужой домашний кот)
    //У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
    public void initialize(int newWeight, String newColor, String newAddress){
        weight = newWeight;
        color = newColor;
        address = newAddress;
    }

    public static void main(String[] args) {

    }
}
