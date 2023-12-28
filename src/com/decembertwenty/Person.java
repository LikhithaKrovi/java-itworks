package com.decembertwenty;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.age = age;
        this.name= name;
    }
}

class Student extends Person{
 String grade;

    public Student(String name, int age, String grade)  {
        super(name, age);
        this.grade=grade;
    }
}
