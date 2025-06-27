package com.testpackage;


// creating parent class Animal
class Animal{
    // creating two methods eat and sleep of parent class
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

//now creating child class 'Dog' extending methods of parent class 'Animal using 'extends' keyword
class Dog extends Animal{
    // method of child class
    void bark(){
        System.out.println("Dog is barking");
    }
}
/*Creating Class which include main method where we can call all methods
  of parent and child class by creating obj of Child class 'myDog'
*/

public class InheritanceConcept{
    public static void main (String[] args){
        // creating obj of child class
        Dog myDog= new Dog();

        //calling method of parent class
        myDog.eat();
        myDog.sleep();

        //calling child class method
        myDog.bark();
    }
}