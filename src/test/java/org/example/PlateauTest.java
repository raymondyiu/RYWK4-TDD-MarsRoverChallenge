package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PlateauTest {

    @Test
    void isInsidePlateau() {

        Plateau plateau = new rectanglarPlateau(new Point(0,0),new Point(5,5));
        assertTrue(plateau.isInsidePlateau(new Point(1,1)));

    }
}