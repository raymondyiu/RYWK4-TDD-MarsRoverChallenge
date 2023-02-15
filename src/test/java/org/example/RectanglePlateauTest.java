package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectanglePlateauTest {

    @Test
    void isInsidePlateau() {
        RectanglePlateau rectanglePlateau = new RectanglePlateau(new Point(0,0),new Point(5,5));
        assertTrue(rectanglePlateau.isInsidePlateau(new Point(1,1)));
        assertFalse(rectanglePlateau.isInsidePlateau(new Point(-1,1)));
        assertFalse(rectanglePlateau.isInsidePlateau(new Point(1,-1)));
    }

}