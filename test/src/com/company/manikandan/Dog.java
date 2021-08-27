package com.company.manikandan;

// based on real logic
public class Dog extends Animal {

    @Override
    public boolean walk() {
        return true;
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean sing(String sound) {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
