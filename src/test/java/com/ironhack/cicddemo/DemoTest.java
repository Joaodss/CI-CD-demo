package com.ironhack.cicddemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    private final Demo demo = new Demo();

    @Test
    void testGetSampleText1() {
        assertEquals("Hello!", demo.getSampleText());
    }

    @Test
    void testGetSampleText2() {
        demo.setSampleText("New sample text");
        assertEquals("New sample text", demo.getSampleText());
    }


}