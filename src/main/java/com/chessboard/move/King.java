package com.chessboard.move;

import com.chessboard.constants.SimpleConstants;

public class King implements Move{

    @Override
    public String possibleMoves(String[] rows, String[] columns, int rowsIndex, int colIndex) {

        if(colIndex >= 7){

            return  rows[rowsIndex] + columns[colIndex - 1] + SimpleConstants.DELIMITER + //E7
                    rows[rowsIndex - 1] + columns[colIndex] + SimpleConstants.DELIMITER + //D8
                    rows[rowsIndex + 1] + columns[colIndex] + SimpleConstants.DELIMITER + //
                    rows[rowsIndex - 1] + columns[colIndex - 1] + SimpleConstants.DELIMITER +
                    rows[rowsIndex + 1] + columns[colIndex - 1];
        } else if (colIndex == 7 && rowsIndex == 0) {

            return  rows[rowsIndex - 1] + columns[colIndex - 1] + SimpleConstants.DELIMITER +
                    rows[rowsIndex] + columns[colIndex - 1] + SimpleConstants.DELIMITER +
                    rows[rowsIndex - 1] + columns[colIndex - 1] + SimpleConstants.DELIMITER;
        }else if (colIndex == 0 && rowsIndex == 0) {

            return  rows[rowsIndex + 1] + columns[colIndex + 1] + SimpleConstants.DELIMITER +
                    rows[rowsIndex + 1] + columns[colIndex] + SimpleConstants.DELIMITER +
                    rows[rowsIndex + 1] + columns[colIndex + 1] + SimpleConstants.DELIMITER;
        }
        else {
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
}
