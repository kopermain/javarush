package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new Nite1()));
        threads.add(new Thread(new Nite2()));
        threads.add(new Thread(new Nite3()));
        threads.add(new Thread(new Nite4()));
        threads.add(new Thread(new Nite5()));

    }

    public static void main(String[] args) {
//        threads.get(0).start();
//        threads.get(1).start();
//        threads.get(2).start();
//        threads.get(3).start();
//        threads.get(4).start();

    }

    public static class Nite1 implements Runnable{

        @Override
        public void run() {
           while (true) {}
        }
    }

    public static class Nite2 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class Nite3 implements Runnable{

        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Nite4 extends Thread implements Message {


        @Override
        public void showWarning()
        {
//            interrupt();
//            try {join();}
//            catch (InterruptedException e){
//                System.out.println("InterruptedException");
//            }
            this.stop();
        }

        @Override
        public void run()
        {
            while (!isInterrupted())
            {
            }
        }
    }

    public static class Nite5 extends Thread implements Runnable{


        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer summ = 0;
            try {
                while (true) {
                    String s = reader.readLine();
                    try {
                        Integer i = Integer.parseInt(s);
                        summ += i;
                    } catch (Exception e2) {
                        if ("N".equals(s)) break;
                    }
                }
                System.out.println(summ);
            } catch (Exception e) {
            }
        }

    }

}