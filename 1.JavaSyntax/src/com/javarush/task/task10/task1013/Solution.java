package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int p1, p2, p3, p4;
        private String s1, s2;

        //1
        public  Human(int p1){
            this.p1 = p1;
//            this.p2 = p2;
//            this.p3 = p3;
//            this.p4 = p4;
//            this.s1 = s1;
//            this.s2 = s2;
        }

        //2
        public  Human(int p1, int p2){
            this.p1 = p1;
            this.p2 = p2;
//            this.p3 = p3;
//            this.p4 = p4;
//            this.s1 = s1;
//            this.s2 = s2;
        }

        //3
        public  Human(int p1, int p2, int p3){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
//            this.p4 = p4;
//            this.s1 = s1;
//            this.s2 = s2;
        }

        //4
        public  Human(int p1, int p2, int p3, int p4){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
//            this.s1 = s1;
//            this.s2 = s2;
        }

        //5
        public  Human(int p1, int p2, int p3, int p4, String s1){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.s1 = s1;
//            this.s2 = s2;
        }

        //6
        public  Human(int p1, int p2, int p3, int p4, String s1, String s2){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.s1 = s1;
            this.s2 = s2;
        }

        //7
        public  Human(int p1, int p2, int p3, String s1, int p4, String s2){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.s1 = s1;
            this.s2 = s2;
        }

        //8
        public  Human(int p1, int p2, String s1, int p3, int p4, String s2){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.s1 = s1;
            this.s2 = s2;
        }

        //9
        public  Human(int p1, String s1, int p2, int p3, int p4, String s2){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.s1 = s1;
            this.s2 = s2;
        }

        //10
        public  Human( String s1, int p1, int p2, int p3, int p4, String s2){
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
            this.s1 = s1;
            this.s2 = s2;
        }

    }
}
