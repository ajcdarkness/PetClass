package com.company;

public class Dog extends Pet{
    private String dogName;

    public Dog(String dogName){
        super(dogName);
    }

    public String speak(){
        return "woof";
    }
}
