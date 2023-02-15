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
        Rover rover=null;
        Point rightCorner=null;
        Userinput userinput = new Userinput();
        rightCorner = userinput.getCoordinate(sc.nextLine());
        while (rightCorner == null) {
            System.out.println("Invalid input! Please input eg 5 5 for create a Plateau");
            rightCorner = userinput.getCoordinate(sc.nextLine());
        }
        rectanglePlateau = new RectanglePlateau(new Point(0, 0), rightCorner);

        while (true) {
            rover = userinput.getLocationDirection(sc.nextLine(), rectanglePlateau);
            while (rover == null) {
                System.out.println("Invalid input! Please input eg 1 2 N for rover location and direction");
                rover = userinput.getLocationDirection(sc.nextLine(), rectanglePlateau);
            }

            line = userinput.getInstruction(sc.nextLine());
            while (line == null) {
                System.out.println("Invalid input! Please input eg LMLM for rover moving intructions");
                line = userinput.getInstruction(sc.nextLine());
            }
            for (int i = 0; i < line.length(); i++) {
                Movements move = Movements.valueOfLabel((new Character(line.charAt(i))).toString());
                switch (move) {
                    case TurnLeft -> rover.turnLeft();
                    case TurnRight -> rover.turnRight();
                    case MoveForward -> rover.moveForward();
                    default -> System.out.println("Action not defined");
                }
                ;

            }
            System.out.println(rover.toString());
        }
    }
}