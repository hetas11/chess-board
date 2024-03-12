package com.chessboard.move;

public class Pawn implements Move{
    @Override
    public String possibleMoves(String[] rows, String[] columns, int rowsIndex, int colIndex) {
        return rows[rowsIndex] + columns[colIndex + 1];
    }
}
