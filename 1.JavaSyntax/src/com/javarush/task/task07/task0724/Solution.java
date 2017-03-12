package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("DED1",true, 88);
        Human ded2 = new Human("DED2",true, 75);
        Human baba1 = new Human("BABA1",false, 79);
        Human baba2 = new Human("BABA2",false, 68);
        Human father1 = new Human("FATHER1",true, 45, ded1, baba1);
        Human mother1 = new Human("MOTHER1",false, 42, ded2, baba2);
        Human son1 = new Human("SON1",true, 20 , father1, mother1);
        Human daug1 = new Human("DAUG1",false, 16, father1, mother1);
        Human daug2 = new Human("DAUG2",false, 12, father1, mother1);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(son1);
        System.out.println(daug1);
        System.out.println(daug2);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

//        public Human(String name, boolean sex, Human mother, int age){
//            this.name = name;
//            this.sex = sex;
//            this.age = age;
//            this.mother = mother;
//        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















