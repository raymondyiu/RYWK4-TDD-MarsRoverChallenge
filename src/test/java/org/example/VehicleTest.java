package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void moveForwardCheckN() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(1,2), Direction.North, rectanglePlateau);
        assertEquals(new Point(1,3), rover.moveForward());
    }
    @Test
    void moveForwardCheckS() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(1,2), Direction.South, rectanglePlateau);
        assertEquals(new Point(1,1), rover.moveForward());
    }
    @Test
    void moveForwardCheckE() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(1,2), Direction.East, rectanglePlateau);
        assertEquals(new Point(2,2), rover.moveForward());
    }
    @Test
    void moveForwardCheckW() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(1,2), Direction.West, rectanglePlateau);
        assertEquals(new Point(0,2), rover.moveForward());
    }

    @Test
    void turnLeftTest() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(1,2), Direction.North, rectanglePlateau);
        assertEquals(Direction.West, rover.turnLeft());
        assertEquals(Direction.South, rover.turnLeft());
        assertEquals(Direction.East, rover.turnLeft());
        assertEquals(Direction.North, rover.turnLeft());
    }

    @Test
    void trunRightTest() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(1,2), Direction.North, rectanglePlateau);
        assertEquals(Direction.East, rover.turnRight());
        assertEquals(Direction.South, rover.turnRight());
        assertEquals(Direction.West, rover.turnRight());
        assertEquals(Direction.North, rover.turnRight());
    }
    @Test
    void BoundaryTest1() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(0,0), Direction.West, rectanglePlateau);
        assertEquals(new Point(0,0), rover.moveForward());
        assertEquals(Direction.South, rover.turnLeft());
        assertEquals(new Point(0,0), rover.moveForward());
    }

    @Test
    void BoundaryTest2() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(5,5));
        Rover rover = new Rover(new Point(5,5), Direction.North, rectanglePlateau);
        assertEquals(new Point(0,0), rover.moveForward());
        assertEquals(Direction.South, rover.turnLeft());
        assertEquals(new Point(0,0), rover.moveForward());
    }
}