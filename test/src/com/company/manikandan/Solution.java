package com.company.manikandan;

class Animal {

    void walk() {
        System.out.println("I am walking");
    }
}

public class Solution {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
