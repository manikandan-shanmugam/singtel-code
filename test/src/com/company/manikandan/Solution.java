package com.company.manikandan;

class Animal {

    void walk() {
        System.out.println("I am walking");
    }
}

class Duck extends Bird{

    public boolean swim(){
        System.out.println("I am swimming");
        return true;
    }

}

class Chicken extends Bird{

    @Override
    public boolean fly() {
        return false;
    }
}

public class Solution {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing("");

        Duck duck = new Duck();
        duck.swim();
        duck.sing("Quack , quack");

        Chicken chicken = new Chicken();
        chicken.fly();
        chicken.sing("Cluck, cluck");
    }
}
