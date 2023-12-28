package com.decembertwenty;

class Animal {

   public Animal(String name, int age){
      this.name = name;
      this.age = age;
   }
   public String name;
   public int age;

   public void printInfo(){
      System.out.println("Animal name is"+name+"and age is"+age);
   }
}

class Cat extends Animal{

   public Cat(String name, int age){
      super(name, age);
   }
   public void makeCatSound(){
      System.out.println("Cat says Meow");
   }

   @Override public void printInfo(){
      System.out.println("Animal name is: "+name+" and age is "+age);
      makeCatSound();
   }
}

class Dog extends Animal{

   public Dog(String name, int age){
      super(name, age);
   }
   public void makeDogSound(){
      System.out.println("Dog says Bow");
   }

   @Override public void printInfo(){
      System.out.println("Animal name is: "+name+" and age is "+age);
      makeDogSound();
   }

}

class Test {

   public static void findObject(Animal animal){
      if(animal instanceof Dog){
         System.out.println("Object of Dog");
      } else if (animal instanceof Cat) {
         System.out.println("Object of Cat");
      }
      else {
         System.out.println("Object is not defined");
      }
   }

   public static void main(String [] args){
      System.out.println("Hello World");

      Animal obj1 = new Animal("likki", 22);
      Dog dogobj = new Dog("Sid", 24);
      Cat catobj = new Cat("nikhil", 23);

      dogobj.printInfo();
      catobj.printInfo();

      Animal animal1 = new Dog("Sid", 24);
      Animal animal2 = new Cat("nikhil", 23);
      findObject(animal1);
      findObject(animal2);
   }
}
