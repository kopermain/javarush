package com.javarush.task.task15.task1516;

/* 
Значения по-умолчанию
*/

public class Solution {
    public  int intVar ;//= (int) 1;
    public  double doubleVar ;//= (double) 3;
    public  Double DoubleVar ;//= (double) 4;
    public  boolean booleanVar ;//= true;
    public  Object ObjectVar ;//= new Object();
    public  Exception ExceptionVar ;//= new Exception();
    public  String  StringVar ;//= "String";

    public static void main(String[] args) {
        System.out.println(new Solution().intVar);
        System.out.println(new Solution().doubleVar);
        System.out.println(new Solution().DoubleVar);
        System.out.println(new Solution().booleanVar);
        System.out.println(new Solution().ObjectVar);
        System.out.println(new Solution().ExceptionVar);
        System.out.println(new Solution().StringVar);
    }
}
