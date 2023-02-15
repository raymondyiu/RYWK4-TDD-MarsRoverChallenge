package org.example;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Userinput {
    public Point getCoordinate(String line){
        Point point = null;
        try {
            Scanner scanner = new Scanner(line.trim().toUpperCase());
            scanner.useDelimiter(" ");
            int x = scanner.nextInt();
            if (x < 0) return null;
            int y = scanner.nextInt();
            if (y < 0) return null;
            point = new Point(x, y);
        } catch (Exception e) {
            return null;
        }
        return (point);
    }

    public Rover getLocationDirection(String line, RectanglePlateau rectanglePlateau){
        Point point = null;
        Direction direction = null;
        Rover rover = null;
        try {
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(" ");
            int x = scanner.nextInt();
            if (x < 0) return null;
            int y = scanner.nextInt();
            if (y < 0) return null;

            direction = Direction.valueOfLabel(scanner.nextLine().trim().toUpperCase());
            if (direction == null) return null;
            rover = new Rover(new Point(x,y), direction, rectanglePlateau);

        } catch (Exception e) {
            return null;
        }
        return (rover);
    }

    public String getInstruction(String line){
        return (Pattern.matches("[LRM]+", line.trim().toUpperCase())) ? line : null;
    }
}
