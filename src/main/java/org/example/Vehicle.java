package org.example;

import java.awt.*;

public abstract class Vehicle {

    Point currentLocation;
    Direction direction=Direction.North;
    RectanglePlateau rectanglePlateau;

    public Vehicle(Point currentLocation, Direction direction, RectanglePlateau rectanglePlateau) {
        this.currentLocation = currentLocation;
        this.direction = direction;
        this.rectanglePlateau = rectanglePlateau;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public Direction getDirection() {
        return direction;
    }

    public Point moveForward(){
        Point nextPoint = new Point(0,0);
        switch(direction) {
            case North -> {
                nextPoint.setLocation(currentLocation.getX(), currentLocation.getY()+1);
            }
            case East -> {
                nextPoint.setLocation(currentLocation.getX()+1, currentLocation.getY());
            }
            case South -> {
                nextPoint.setLocation(currentLocation.getX(), currentLocation.getY()-1);
            }
            case West -> {
                nextPoint.setLocation(currentLocation.getX()-1, currentLocation.getY());
            }
        };
        if (rectanglePlateau.isInsidePlateau(nextPoint)){
            currentLocation.setLocation(nextPoint);
        } else {
            System.out.println("Out of Boundary");
        }
        return (currentLocation);
    }
    public Direction turnLeft(){
        switch(direction) {
            case North -> {
                direction = Direction.West;
            }
            case East -> {
                direction = Direction.North;
            }
            case South -> {
                direction = Direction.East;
            }
            case West -> {
                direction = Direction.South;
            }
        };
        return (direction);
    }
    public Direction turnRight(){
        switch(direction) {
            case North -> {
                direction = Direction.East;
            }
            case East -> {
                direction = Direction.South;
            }
            case South -> {
                direction = Direction.West;
            }
            case West -> {
                direction = Direction.North;
            }
        };
        return (direction);
    }
    public String toString(){
        return (String.format("%.0f %.0f %s", currentLocation.getX(), currentLocation.getY(),
                direction.value()));
    }
}
