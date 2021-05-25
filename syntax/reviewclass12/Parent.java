package com.syntax.reviewclass12;

public class Parent {
    protected String name = "Jon";

    protected void parentPrintMethod(){
        System.out.println(name);
    }
}
class Child extends Parent{
    String name = "Jane";
    public void childPrintMethod(){
        System.out.println(name);
        System.out.println(super.name);
    }
    public void printAll(){
        super.parentPrintMethod();
        System.out.println(super.name);
        this.childPrintMethod();
        System.out.println(this.name);
    }
}