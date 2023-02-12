package org.example;

import java.awt.*;

public abstract class Vehicle {

    Point currentLocation;
    Direction direction=Direction.North;

    public Vehicle(Point currentLocation, Direction direction) {
        this.currentLocation = currentLocation;
        this.direction = direction;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public Direction getDirection() {
        return direction;
    }

    public Point moveForward(){
        switch(direction) {
            case North -> {
                currentLocation.setLocation(currentLocation.getX(), currentLocation.getY()+1);
            }
            case East -> {
                currentLocation.setLocation(currentLocation.getX()+1, currentLocation.getY());
            }
            case South -> {
                currentLocation.setLocation(currentLocation.getX(), currentLocation.getY()-1);
            }
            case West -> {
                currentLocation.setLocation(currentLocation.getX()-1, currentLocation.getY());
            }
        };
        return (currentLocation);
    }
}
