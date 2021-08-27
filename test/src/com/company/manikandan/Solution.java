package com.company.manikandan;


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

//        Butterfly butterfly = new Butterfly();
//        butterfly.fly();
//        butterfly.sing("butterfly sound");
//
//        Caterpillar caterpillar = new Caterpillar();
//        caterpillar.fly();
//        caterpillar.walk();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Chicken(),// for rooster
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Butterfly(),
                new Frog(),
                new Dog(),
                new Cat(),
        };

        int flyCount = 0;
        int walkCount = 0;
        int swimCount = 0;
        int singCount = 0;

        for (Animal animal : animals) {

            if (animal.fly()) {
                flyCount++;
            }

            if (animal.walk()) {
                walkCount++;
            }

            if (animal.swim()) {
                swimCount++;
            }

            if (animal.sing("")) {
                singCount++;
            }
        }


        System.out.println(String.format("%s animals can fly", flyCount));
        System.out.println(String.format("%s animals can walk", walkCount));
        System.out.println(String.format("%s animals can swim", swimCount));
        System.out.println(String.format("%s animals can sing", singCount));

    }

}

// time over 
