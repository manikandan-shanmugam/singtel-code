package com.company.manikandan;

public class Butterfly extends Bird {

    @Override
    public boolean sing(String sound) {
        System.out.println("I can't sing");
        return false;
    }
}
