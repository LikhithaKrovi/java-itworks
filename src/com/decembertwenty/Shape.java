package com.decembertwenty;

abstract class Shape {
    abstract public void calculateArea();
}

class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    public void calculateArea(){
        float area = (float) 3.14 * this.radius;
        System.out.println("Area of the circle : " + area);
    }
}

class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        int area = length * width;
        System.out.println("Area of the Rectangle : " + area);
    }
}

class Area{
    public static void main(String [] args){
        Circle circleObj = new Circle(7);
        Rectangle recObj = new Rectangle(8,9);

        circleObj.calculateArea();
        recObj.calculateArea();
    }
}
