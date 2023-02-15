package org.example;

import java.awt.*;
import java.util.Scanner;

public class Userinput {
    public Point getCoordinate(String line){
        return (new Point(1,0));
    }

    public Rover getLocationDirection(String line, RectanglePlateau rectanglePlateau){
        return (new Rover(new Point(1,1), Direction.North, rectanglePlateau));
    }

    public String getInstruction(String line){
        return("LMLM");
    }
}
