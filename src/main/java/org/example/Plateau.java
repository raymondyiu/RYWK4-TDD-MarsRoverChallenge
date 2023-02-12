package org.example;

import java.awt.*;

public class Plateau {
    private Point lowerLeftCorner;
    private Point upperRightCorner;
    private Point[] plateau = { lowerLeftCorner, upperRightCorner};

    public Plateau(Point lowerLeftCorner, Point upperRightCorner) {
        this.lowerLeftCorner = lowerLeftCorner;
        this.upperRightCorner = upperRightCorner;
    }

    public boolean isInsidePlateau(Point currentLocation){
        return false;
    }
}
