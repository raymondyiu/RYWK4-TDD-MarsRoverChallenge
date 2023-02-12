package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void moveForwardCheckN() {
        Rover rover = new Rover(new Point(1,2), Direction.North);
        assertEquals(new Point(1,3), rover.moveForward());
    }
    @Test
    void moveForwardCheckS() {
        Rover rover = new Rover(new Point(1,2), Direction.South);
        assertEquals(new Point(1,1), rover.moveForward());
    }
    @Test
    void moveForwardCheckE() {
        Rover rover = new Rover(new Point(1,2), Direction.East);
        assertEquals(new Point(2,2), rover.moveForward());
    }
    @Test
    void moveForwardCheckW() {
        Rover rover = new Rover(new Point(1,2), Direction.West);
        assertEquals(new Point(0,2), rover.moveForward());
    }

    void turnLeftTestN() {
        Rover rover = new Rover(new Point(1,2), Direction.North);
        assertEquals(Direction.West, rover.turnLeft());
    }
}