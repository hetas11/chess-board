package com.chessboard.move;

import com.chessboard.constants.SimpleConstants;

public class King implements Move{

    @Override
    public String possibleMoves(String[] rows, String[] columns, int rowsIndex, int colIndex) {
        return rows[rowsIndex] + columns[colIndex + 1] + SimpleConstants.DELIMITER +
                rows[rowsIndex] + columns[colIndex - 1] + SimpleConstants.DELIMITER +
                rows[rowsIndex - 1] + columns[colIndex] + SimpleConstants.DELIMITER +
                rows[rowsIndex + 1] + columns[colIndex] + SimpleConstants.DELIMITER +
                rows[rowsIndex - 1] + columns[colIndex + 1] + SimpleConstants.DELIMITER +
                rows[rowsIndex - 1] + columns[colIndex - 1] + SimpleConstants.DELIMITER +
                rows[rowsIndex + 1] + columns[colIndex + 1] + SimpleConstants.DELIMITER +
                rows[rowsIndex + 1] + columns[colIndex - 1];
    }
}
