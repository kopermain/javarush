package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man1 = new Man("Igor",23,"Moskow");
        Man man2 = new Man("Evgen",33,"Piter");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Lera",19,"Kolomna");
        Woman woman2 = new Woman("Olga",48,"Baku");

        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);


    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name){
            this.name = name;
        }

        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }


    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name){
            this.name = name;
        }

        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
