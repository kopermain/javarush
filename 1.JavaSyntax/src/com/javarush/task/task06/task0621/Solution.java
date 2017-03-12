package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedushkaName = reader.readLine();
        Cat dedushka = new Cat(dedushkaName);

        String babushkaName = reader.readLine();
        Cat babushka = new Cat(babushkaName);

        String dadName = reader.readLine();
        Cat dad = new Cat(dedushka, dadName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, babushka);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, catMother, dad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, dad);



        System.out.println(dedushka);
        System.out.println(babushka);
        System.out.println(dad);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat dad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat( Cat dad, String name) {
            this.name = name;
            this.dad = dad;
        }

        Cat(String name, Cat parent, Cat dad) {
            this.name = name;
            this.parent = parent;
            this.dad = dad;
        }

        @Override
        public String toString() {

            if (parent == null && dad == null){
                return "Cat name is " + name + ", no mother, no father";
            }else{
                if (parent == null) {
                    return "Cat name is "+name+", no mother, father is "+dad.name+"";
                }else{
                    if (dad == null){
                    return "Cat name is " + name + ", mother is " + parent.name + ", no father";
                }else{
                        return "Cat name is " + name + ", mother is "+parent.name+", father is "+dad.name+"";
                    }
                }
             }
        }
    }

}
