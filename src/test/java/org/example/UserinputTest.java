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
    }

    @Test
    void getInstruction() {
    }
}