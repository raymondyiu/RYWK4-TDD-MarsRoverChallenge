package org.example;

import java.awt.*;

public class rectanglarPlateau implements Plateau{
    private Point lowerLeftCorner;
    private Point upperRightCorner;
    private Point[] retangle = { lowerLeftCorner, upperRightCorner};
    private Point[] obstacle=null;

    public rectanglarPlateau(Point lowerLeftCorner, Point upperRightCorner) {
        this.lowerLeftCorner = lowerLeftCorner;
        this.upperRightCorner = upperRightCorner;
    }

    public boolean isInsidePlateau(Point currentLocation){
        return false;
    }
    public boolean isObstacle(Point p){
        if ( obstacle == null ) { return false;}
         return true;
    }
}
