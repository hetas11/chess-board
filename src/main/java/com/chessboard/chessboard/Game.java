package com.chessboard.chessboard;

import com.chessboard.constants.SimpleConstants;
import com.chessboard.move.King;
import com.chessboard.move.Pawn;

import java.util.Arrays;

public class Game {

    String[] rows = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
    String[] columns = new String[] {"1","2","3","4","5","6","7","8"};

    public String gamePiece(String piece, String position) {

        int rowsIndex = Arrays.asList(rows).indexOf(String.valueOf(position.charAt(0)));
        int colIndex = Arrays.asList(columns).indexOf(String.valueOf(position.charAt(1)));

        if(piece.equalsIgnoreCase(SimpleConstants.PIECE_PAWN)) {
            Pawn pawnMovement = new Pawn();
            return pawnMovement.possibleMoves(rows,columns,rowsIndex,colIndex);
        } else if(piece.equalsIgnoreCase(SimpleConstants.PIECE_KING)){
            King kingMovement = new King();
            return kingMovement.possibleMoves(rows,columns,rowsIndex,colIndex);
        } else {
            return "Incorrect piece entered:" +piece;
        }

    }

}
