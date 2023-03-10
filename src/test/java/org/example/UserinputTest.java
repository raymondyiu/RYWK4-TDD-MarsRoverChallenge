package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class UserinputTest {

    @Test
    void getCoordinate() {
        Userinput userinput = new Userinput();
        assertEquals(new Point(1,0), userinput.getCoordinate("1 0"));
        assertEquals(new Point(0,0), userinput.getCoordinate("0 0"));
        assertEquals(null, userinput.getCoordinate("0 -1"));
        assertEquals(null, userinput.getCoordinate("-1 0"));
        assertEquals(null, userinput.getCoordinate(""));
        assertEquals(null, userinput.getCoordinate("A B"));
    }

    @Test
    void getLocationDirection() {
        Userinput userinput = new Userinput();
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0), new Point(5,5));
        Rover expectedRover = new Rover(new Point(1,2), Direction.North, rectanglePlateau);
        assertEquals(expectedRover.toString(),
                (userinput.getLocationDirection("1 2 N", rectanglePlateau)).toString());
        assertEquals(null,
                userinput.getLocationDirection("a 2 N", rectanglePlateau));
        assertEquals(null,
                userinput.getLocationDirection("0 -1 N", rectanglePlateau));
        assertEquals(null,
                userinput.getLocationDirection("abc", rectanglePlateau));
    }

    @Test
    void getInstruction() {
        Userinput userinput = new Userinput();
        assertEquals("LLMM", userinput.getInstruction("LLMM"));
        assertEquals(null, userinput.getInstruction("LLxxMM"));
        assertEquals(null, userinput.getInstruction("LM22M"));
        assertEquals(null, userinput.getInstruction(""));
        assertEquals(null, userinput.getInstruction("234325"));
        assertEquals(null, userinput.getInstruction("abcdefdf"));
    }
}