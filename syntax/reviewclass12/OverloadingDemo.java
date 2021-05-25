package com.syntax.reviewclass12;

public class OverloadingDemo {
    // overloading the constructor
    String firstName;
    String lastName;
    int age;
    double salary;
    OverloadingDemo(){
        this.firstName=" ";
        this.lastName=" ";
        this.age=20;
        this.salary=100000;
        System.out.println("Default constructor with no parameters called");
    }
    OverloadingDemo(String firstName){
       this();
       this.firstName=firstName;
        System.out.println("Constructor with firstname constructor");
    }
    OverloadingDemo(String firstName, String lastName){
        this(firstName);
        this.lastName=lastName;
        System.out.println("Constructor with firstname and lastName");
    }
    OverloadingDemo(String firstName, String lastName, int age){
        this(firstName, lastName);
        this.age=age;
        System.out.println("Constructor with firstName ,lastName, age");
    }
    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age+" "+salary);
    }
}
