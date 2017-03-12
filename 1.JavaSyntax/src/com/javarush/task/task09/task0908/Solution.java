package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/


import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {

            String s = null;
            String m = s.toLowerCase();
//        }catch (NoSuchElementException e){
//            System.out.println("NoSuchElementException");
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
//        }catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }catch (IllegalArgumentException e){
//            System.out.println("IllegalArgumentException");
//        }catch (ClassCastException e){
//            System.out.println("ClassCastException");
//        }catch (RuntimeException e){
//            System.out.println("RuntimeException");
        }
        //напишите тут ваш код
    }
}
