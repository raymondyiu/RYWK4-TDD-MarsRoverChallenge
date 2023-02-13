package org.example;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static Direction matchDirection(String directionStr){

        Direction out;
        switch (directionStr.charAt(0)) {
                    case 'N' -> out = Direction.North;
                    case 'E' -> out = Direction.East;
                    case 'S' -> out = Direction.South;
                    case 'W' -> out = Direction.West;
                    default -> out = Direction.North;
        };

        return out;
    }
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        Scanner plateauScanner;
        RectanglePlateau rectanglePlateau;
        Scanner locationScanner;
        Scanner moveScanner;
        Rover rover;

        plateauScanner = new Scanner(sc.nextLine());
        plateauScanner.useDelimiter(" ");
        rectanglePlateau = new RectanglePlateau(new Point(0,0),
                new Point(plateauScanner.nextInt(), plateauScanner.nextInt()));

        while(sc.hasNextLine()){
            locationScanner = new Scanner(sc.nextLine());
            locationScanner.useDelimiter(" ");

            rover = new Rover(new Point(locationScanner.nextInt(), locationScanner.nextInt()),
                    matchDirection(locationScanner.nextLine().trim()));

            line = sc.nextLine();
            for (int i=0; i<line.length(); i++){
                switch (line.charAt(i)){
                    case 'L' -> rover.turnLeft();
                    case 'R' -> rover.turnRight();
                    case 'M' -> rover.moveForward();
                    default -> System.out.println("Action not defined");
                };

            }
            System.out.println(String.format("%.0f %.0f %c", rover.getCurrentLocation().getX(),
                    rover.getCurrentLocation().getY(), rover.getDirection().value()));
        }
    }
}