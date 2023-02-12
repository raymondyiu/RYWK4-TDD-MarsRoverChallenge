package org.example;

import java.awt.*;

public interface Plateau {
    public boolean isInsidePlateau(Point currentLocation);
    public boolean isObstacle(Point p);
}
