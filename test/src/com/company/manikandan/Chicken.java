package com.company.manikandan;

public class Chicken extends Bird {

    String sound;

    @Override
    public boolean fly() {
        return false;
    }

    // consider rooster only have sound different
    public boolean sing(String type) {
        switch (type) {
            case "Rooster":
                sound = "Cock-a-doodle-doo";
                break;
            default:
                sound = "Cluck, cluck";
        }
        return super.sing(sound);
    }
}
