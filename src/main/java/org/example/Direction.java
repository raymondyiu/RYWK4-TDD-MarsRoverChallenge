package org.example;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
    North("N"), East("E"), South("S"), West("W");
    public final String label;
    private static final Map<String, Direction> BY_LABEL = new HashMap<>();
    static {
        for (Direction direction : values()) {
            BY_LABEL.put(direction.label, direction);
        }
    }
    public static Direction valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    private Direction(String label){
        this.label = label;
    }
    String value(){
        return label;
    }
}
