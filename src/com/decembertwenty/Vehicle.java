package com.decembertwenty;

import java.beans.VetoableChangeListener;

class Vehicle {
    public Vehicle(String make, int year){
        System.out.println("Base class constructor");
        this.make = make;
        this.year = year;
    }

    public String make;
    public int year;
}

class car extends Vehicle{
    car(String make, int year){
        super(make, year);
        System.out.println("Child class constructor");
    }

    public static void main(String [] args){
        car carObj = new car("Toyota", 2015);

    }
}