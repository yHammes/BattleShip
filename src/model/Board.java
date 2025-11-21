package model;

public class Board {

    private Cell[][] grid;

    public Board() {
        grid = new Cell[10][10];

        for (int col = 0; col < 10; col++) {
            for (int line = 0; line < 10; line++) {
                grid[col][line] = new Cell();
            }
        }
    }

    public Cell getCell(int row, int col) {
        return grid[row][col];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                sb.append(grid[row][col].toString()).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
