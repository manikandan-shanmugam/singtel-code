package com.company.manikandan.test;

import com.company.manikandan.Bird;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirdTest {

    Bird bird;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        bird = new Bird();
    }

    @org.junit.jupiter.api.Test
    void fly() {
        assertEquals(bird.fly(),true);
    }
}