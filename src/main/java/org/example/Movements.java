package org.example;

import javax.lang.model.element.Element;
import java.util.HashMap;
import java.util.Map;

public enum Movements {
    MoveForward("M"), TurnLeft("L"), TurnRight("R");
    private static final Map<String, Movements> BY_LABEL = new HashMap<>();

    static {
        for (Movements move : values()) {
            BY_LABEL.put(move.label, move);
        }
    }
    public final String label;

    public static Movements valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }


    Movements(String label) {
        this.label = label;
    }
}
