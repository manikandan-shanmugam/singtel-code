package com.company.manikandan.test;

import com.company.manikandan.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTest {

    Animal[] animals;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
     animals    = new Animal[]{
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
    }

    @org.junit.jupiter.api.Test
    void countAnimal() {
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
        assertEquals(flyCount,4);
        assertEquals(walkCount,8);
        assertEquals(swimCount,7);
        assertEquals(singCount,8);
    }
}