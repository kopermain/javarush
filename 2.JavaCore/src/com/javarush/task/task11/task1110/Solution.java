package com.javarush.task.task11.task1110;

/* 
Добавь недостающие переменные
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String  name;
        private int age;
        private  int weight;
        private int speed;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;

        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
}