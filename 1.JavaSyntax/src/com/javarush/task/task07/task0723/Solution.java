package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {

       Thread.currentThread();

        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }


            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
