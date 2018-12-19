package com.company;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog loudDog = new LoudDog("Loud Dog");

        System.out.println(cat.getName()+ ": " + cat.speak());
        System.out.println(dog.getName() + ": "+ dog.speak());
        System.out.println(loudDog.getName() + ": " + loudDog.speak());

        System.out.println("==Kennel==");
        Kennel kennel = new Kennel();
        kennel.allSpeak();
    }
}
