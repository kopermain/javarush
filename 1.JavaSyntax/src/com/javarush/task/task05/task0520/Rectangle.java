package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {

   int top = 0 , left = 0, width = 0, height = 0;

   public Rectangle(int top){
       this.top = top;
   }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Rectangle(Rectangle rectangle, int top){
        this.top = rectangle.top+top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Rectangle(Rectangle rectangle, int top, int left){
        this.top = rectangle.top+top;
        this.left = rectangle.left+left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Rectangle(Rectangle rectangle, int top, int left, int width){
        this.top = rectangle.top+top;
        this.left = rectangle.left+left;
        this.width = rectangle.width+width;
        this.height = rectangle.height;
    }

    public Rectangle(Rectangle rectangle, int top, int left, int width, int height){
        this.top = rectangle.top+top;
        this.left = rectangle.left+left;
        this.width = rectangle.width+width;
        this.height = rectangle.height+height;
    }

    public static void main(String[] args) {

    }
}
