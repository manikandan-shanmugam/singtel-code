package com.company.manikandan;

class Animal {

    public boolean walk() {
        System.out.println("I am walking");
        return true;
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


class Parrot extends Bird {
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

class Fish extends Animal {

    @Override
    public boolean walk() {
        System.out.println("I can't walk");
        return false;
    }

    public boolean sing() {
        System.out.println("I can't sing");
        return false;
    }

    public boolean swim() {
        System.out.println("I am Swimming");
        return true;
    }
}

class Shark extends Fish {

    // we can't use the size, color,other props in logic, so make it as info in constructor
    Shark() {
        System.out.println("I am large, grey and eat other fish");
    }
}

class Clownfish extends Fish {

    // we can't use the size, color,other props in logic, so make it as info in constructor
    Clownfish() {
        System.out.println("I am small, orange in color and make jokes");
    }
}

class Dolphin extends Animal {

    public boolean swim() {
        System.out.println("I am Swimming");
        return true;
    }
}

class Butterfly extends Bird {

    @Override
    public boolean sing(String sound) {
        System.out.println("I can't sing");
        return false;
    }
}

class Caterpillar extends Animal {

    public boolean fly() {
        return false;
    }

}

public class Solution {

    public static void main(String[] args) {

//        Bird bird = new Bird();
//        bird.walk();
//        bird.fly();
//        bird.sing("");
//
//        Duck duck = new Duck();
//        duck.swim();
//        duck.sing("Quack , quack");
//
//        Chicken chicken = new Chicken();
//        chicken.fly();
//        chicken.sing("");

        // to re-use the chicken for rooster, ans for A.3.2 and A.3.3
//        Chicken rooster = new Chicken();
//        rooster.sing("Rooster");

//        Parrot parrotWithDog = new Parrot();
//        parrotWithDog.sing("Dog");
//
//        Parrot parrotWithCat = new Parrot();
//        parrotWithDog.sing("Cat");
//
//        Parrot parrotWithRooster = new Parrot();
//        parrotWithDog.sing("Rooster");
//
//        // consider 4th parrot with duck
//        Parrot parrotWithDuck = new Parrot();
//        parrotWithDog.sing("Duck");
//
//        Parrot parrotAlone = new Parrot();
//        parrotWithDog.sing("");

//        Fish fish = new Fish();
//        fish.walk();
//        fish.sing();
//        fish.swim();

        Butterfly butterfly= new Butterfly();
        butterfly.fly();
        butterfly.sing("butterfly sound");

        Caterpillar caterpillar= new Caterpillar();
        caterpillar.fly();
        caterpillar.walk();

    }
}
