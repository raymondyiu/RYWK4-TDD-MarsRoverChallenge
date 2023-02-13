package org.example;

import java.awt.*;

public class RectanglePlateau implements Plateau{
    private Point lowerLeftCorner;
    private Point upperRightCorner;
    private Point[] rectangle = { lowerLeftCorner, upperRightCorner};
    private Point[] obstacle=null;

    public RectanglePlateau(Point lowerLeftCorner, Point upperRightCorner) {
        this.lowerLeftCorner = lowerLeftCorner;
        this.upperRightCorner = upperRightCorner;
    }

    public Point[] getRectangle(){
        return rectangle;
    }

    public boolean isInsidePlateau(Point currentLocation){
        return false;
    }
    public boolean isObstacle(Point p){
        if ( obstacle == null ) { return false;}
        return true;
    }
}
