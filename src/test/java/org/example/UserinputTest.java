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
        Rover expectedRover = new Rover(new Point(0,0), Direction.North, rectanglePlateau);
        assertEquals(expectedRover.toString(),
                (userinput.getLocationDirection("1 2 N", rectanglePlateau).toString()));
    }

    @Test
    void getInstruction() {
    }
}