package com.company.manikandan;

public class Caterpillar extends Animal {

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
        return false;
    }

    @Override
    public boolean swim() {
        return false;
    }

}
