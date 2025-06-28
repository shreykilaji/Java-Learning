package com.testpackage.oops;

// Abstract class representing a vehicle (hiding implementation details)
abstract class Vehicle {
        //abstract method (what it can do)
        abstract void accelerate();
        abstract void brake();

        // concrete method (common to all vehicle)
        void startEngine(){
            System.out.println("Engine started!");
        }
    }
//Concrete Implementation (hidden details)
/*creating a Car class which have implementation of accelerate() and brake() method
which is overridden here in this class.
*/

class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car: Pressing gas pedal..");
        //hidden complex logic behind acceleration : fuel injection, gearshift etc.
    }
    void brake(){
        System.out.println("Car: Applying brakes");
        //hidden logic behind brake system
    }
}

// Implementing 'AbstractionConcept' class with main method to call methods by creating object of Vehicle class

public class AbstractionConcept{
    public static void main(String[] args){
        Vehicle myCar= new Car();
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}