package com.company;

public class Cat extends Pet{
    private String catName;

    public Cat(String catName){
        super(catName);

    }
    public String speak(){
        return "meow";
    }
}
