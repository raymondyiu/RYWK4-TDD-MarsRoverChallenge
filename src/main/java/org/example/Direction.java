package org.example;

public enum Direction {
    North('N'), East('E'), South('S'), West('W');
    public final char label;

    private Direction(char label){
        this.label = label;
    }
    char value(){
        return label;
    }
}
