package com.syntax.reviewclass12;

public class Employee {
    String firstName;
    String lastName;
    double bonus;

    Employee(){

    }
    Employee(String firstName,String lastName,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        if(salary>150000){
            bonus=.5;
        }else{
            bonus=0.3;
        }
        System.out.println("Constructor called from the Parent Employee");
    }
}
class Tester extends Employee{

    String team;
    double bonus;
    double salary;
    Tester(String firstName,String lastName,String team,double salary){
        super(firstName, lastName,salary);
        salary=salary;
        this.team=team;
        System.out.println("Constructor called from the Child Tester class");

    }
    public void displayInfo(){
        System.out.println(" works in "+team+" bonus Plus salary "+(salary*bonus+salary));

    }
}