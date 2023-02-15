package org.example;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        Scanner plateauScanner;
        RectanglePlateau rectanglePlateau;
        Scanner locationScanner;
        Scanner moveScanner;
        Rover rover;
        Point rightCorner=null;

        //while (rightCorner == null) {

        //}
            plateauScanner = new Scanner(sc.nextLine());
            plateauScanner.useDelimiter(" ");
            rectanglePlateau = new RectanglePlateau(new Point(0, 0),
                    new Point(plateauScanner.nextInt(), plateauScanner.nextInt()));


        while(sc.hasNextLine()){
            locationScanner = new Scanner(sc.nextLine());
            locationScanner.useDelimiter(" ");

            rover = new Rover(new Point(locationScanner.nextInt(), locationScanner.nextInt()),
                    Direction.valueOfLabel(locationScanner.nextLine().trim().toUpperCase()),
                    rectanglePlateau);

            line = sc.nextLine().trim().toUpperCase();
            for (int i=0; i<line.length(); i++){
                Movements move = Movements.valueOfLabel((new Character(line.charAt(i))).toString());
                switch (move){
                    case TurnLeft -> rover.turnLeft();
                    case TurnRight -> rover.turnRight();
                    case MoveForward -> rover.moveForward();
                    default -> System.out.println("Action not defined");
                };

            }
            System.out.println(String.format("%.0f %.0f %s", rover.getCurrentLocation().getX(),
                    rover.getCurrentLocation().getY(), rover.getDirection().value()));
        }
    }
}