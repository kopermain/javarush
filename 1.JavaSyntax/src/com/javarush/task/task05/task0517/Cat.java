package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    String name;
    int weight = 1;
    int age = 1;
    String color;
    String address;

    //— Имя,
    public Cat(String name){
        this.name = name;
        color = "r";
    }

    //— Имя, вес, возраст
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "r";
    }

    //— Имя, возраст (вес стандартный)
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        color = "r";
    }

    //— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    //— вес, цвет, адрес (чужой домашний кот)
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
