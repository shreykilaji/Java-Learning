package com.testpackage;


//Creating class which include private variable and public class(to access private variable
class Employee{

    //Private variable using private access modifier(encapsulated data)
    private int id;
    private String name;

    //creating public methods to access above private variables.
    //setter(), getter() methods implementation

    //Setter to set values in private variable
    public void setId( int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    //getter to get values from Private variables
    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}

public class EncapsulationConcept {
    public static void main(String[] args){
        //creating obj of Employee class to access public method to set and get data of Private variable

        Employee emp = new Employee();

        //set value using setter in private variable.
        emp.setId(101);
        emp.setName("Shrey Kilaji");

        // Now printing values using getter methods
        System.out.println("Employee Id: "+ emp.getId());
        System.out.println("Employee Name: "+ emp.getName());
    }
}
