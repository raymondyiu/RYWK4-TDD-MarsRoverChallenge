package org.example;

import java.awt.*;

public class RectanglePlateau implements Plateau{
    private Point lowerLeftCorner;
    private Point upperRightCorner;
    private Point[] rectangle;
    private Point[] obstacle=null;

    public RectanglePlateau(Point lowerLeftCorner, Point upperRightCorner) {
        this.lowerLeftCorner = lowerLeftCorner;
        this.upperRightCorner = upperRightCorner;
        rectangle = new Point[2];
        rectangle[0] = lowerLeftCorner;
        rectangle[1] = upperRightCorner;
    }

    public boolean isInsidePlateau(Point nextPoint){
        if ((nextPoint.getX() < rectangle[0].getX()) || (nextPoint.getX() > rectangle[1].getX())) {
            return false;
        }
        if ((nextPoint.getY() < rectangle[0].getY()) || (nextPoint.getY() > rectangle[1].getY())) {
            return false;
        }
        return true;
    }
}
