package com.chessboard.move;

public interface Move {

    public String possibleMoves(String[] rows, String[] columns, int rowIndex, int colIndex);
}
