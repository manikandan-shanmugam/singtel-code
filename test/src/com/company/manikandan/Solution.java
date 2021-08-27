package com.company.manikandan;

class Animal {

    void walk() {
        System.out.println("I am walking");
    }
}

class Duck extends Bird {

    public boolean swim() {
        System.out.println("I am swimming");
        return true;
    }

}

class Chicken extends Bird {

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
        chicken.sing("");

        // to re-use the chicken for rooster, ans for A.3.2 and A.3.3
        Chicken rooster = new Chicken();
        rooster.sing("Rooster");
    }
}
