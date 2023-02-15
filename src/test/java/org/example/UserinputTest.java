package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class UserinputTest {

    @Test
    void getCoordinate() {
        Userinput userinput = new Userinput();
        assertEquals(new Point(0,0), userinput.getCoordinate("5 5"));
    }

    @Test
    void getLocationDirection() {
    }

    @Test
    void getInstruction() {
    }
}