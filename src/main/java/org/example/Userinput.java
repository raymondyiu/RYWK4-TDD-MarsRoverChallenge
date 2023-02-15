package org.example;

import java.awt.*;
import java.util.Scanner;

public class Userinput {
    public Point getCoordinate(String line){
        Point point = null;
        try {
            Scanner scanner = new Scanner(line);
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
        return (new Rover(new Point(1,1), Direction.North, rectanglePlateau));
    }

    public String getInstruction(String line){
        return("LMLM");
    }
}
