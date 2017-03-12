package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("pupkin1", true, 10);
        Human son2 = new Human("pupkin2", true, 12);
        Human dau3 = new Human("pupkin3", false, 16);
        Human dad = new Human("pupkin4", true, 32);
        dad.children.add(son1);
        dad.children.add(son2);
        dad.children.add(dau3);
        Human mom = new Human("pupkin5", false, 36);
        mom.children.add(son1);
        mom.children.add(son2);
        mom.children.add(dau3);
        Human ded1 = new Human("pupkin6", true, 49);
        ded1.children.add(dad);
        Human ded2 = new Human("pupkin7", true, 59);
        ded2.children.add(mom);
        Human baba1 = new Human("pupkin8", false, 47);
        baba1.children.add(dad);
        Human baba2 = new Human("pupkin9", false, 56);
        baba2.children.add(mom);

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(dau3.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public  Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
