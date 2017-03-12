package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {

    int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width; //Ширина
        this.height = height;//Высота
    }

    public void initialize(int top){
        this.top = top;
        this.left = top+20;
        this.width = 40;
        this.height = 40;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public void initialize(Rectangle rectangle, int top){
        this.top = rectangle.top+top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public void initialize(Rectangle rectangle, int top, int left){
        this.top = rectangle.top+top;
        this.left = rectangle.left+left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public void initialize(Rectangle rectangle, int top, int left, int width){
        this.top = rectangle.top+top;
        this.left = rectangle.left+left;
        this.width = rectangle.width+width;
        this.height = rectangle.height;
    }

    public void initialize(Rectangle rectangle, int top, int left, int width, int height){
        this.top = rectangle.top+top;
        this.left = rectangle.left+left;
        this.width = rectangle.width+width;
        this.height = rectangle.height+height;
    }

    public static void main(String[] args) {

    }
}
