package com.company.manikandan;

public class Bird extends Animal {

    public boolean fly() {
        System.out.println("I am flying");
        return true;

    }

    public boolean sing(String sound) {
        System.out.println(String.format("I am singing %s",sound).trim());
        return true;
    }

    @Override
   public boolean walk() {
        System.out.println("I am walking");
        return true;
    }


    @Override
   public boolean swim() {
        return false;
    }
}
