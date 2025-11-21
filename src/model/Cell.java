package model;

public class Cell {
    private int state;

    public Cell() {
        this.state = 0;
    }

    public int state() {
        return state;
    }

    public void placeShip() {
        state = 2;
    }

    public void hit() {
        state = 1;
    }

    public String toString() {
        return switch (state) {
            case 1 -> "X";
            case 2 -> "S";
            default -> "~";
        };
    }
}
