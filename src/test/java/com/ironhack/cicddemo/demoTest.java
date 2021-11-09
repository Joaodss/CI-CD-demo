package com.ironhack.cicddemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class demoTest {
    private final Demo demo = new Demo();


    // Invalid Test
    @Test
    void testGetSampleText1() {
        assertEquals("Hello!", demo.getSampleText());
    }

    // Valid Test
    @Test
    void testGetSampleText2() {
        demo.setSampleText("New sample text");
        assertEquals("New sample text", demo.getSampleText());
    }


}