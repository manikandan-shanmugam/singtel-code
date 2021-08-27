package com.company.manikandan;

public class Fish extends Animal {

    @Override
    public boolean walk() {
        System.out.println("I can't walk");
        return false;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean sing(String sound) {
        return false;
    }

    public boolean swim() {
        System.out.println("I am Swimming");
        return true;
    }
}
