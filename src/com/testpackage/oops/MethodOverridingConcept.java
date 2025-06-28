package com.testpackage.oops;

//Parent Class with makeSound() method
class AnimalTest {
    void makeSound(){
        System.out.println("Animal Making sound");
    }
}

//child class overriding method of parent class
class DogTest extends AnimalTest{
    void makeSound(){
        System.out.println("bark");
    }
}

public class MethodOverridingConcept {
    public static void main(String[] args){
     AnimalTest myTestDog = new DogTest(); //Parent reference child class
     myTestDog.makeSound();
    }
}