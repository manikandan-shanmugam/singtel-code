package com.company.manikandan;

public class Parrot extends Bird {
    String sound;

    @Override
    public boolean sing(String livingWith) {

        switch (livingWith) {
            case "Dog":
                sound = "Woof, woof";
                break;
            case "Cat":
                sound = "Me ow";
                break;
            case "Rooster":
                sound = "Cock-a-doodle-doo";
                break;
            case "Duck":
                sound = "Quack , quack";
                break;
            default:
                sound = "";
        }
        return super.sing(sound);
    }
}
