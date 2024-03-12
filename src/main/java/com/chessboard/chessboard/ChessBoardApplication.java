package com.chessboard.chessboard;

import com.chessboard.constants.SimpleConstants;
import com.chessboard.move.King;
import com.chessboard.move.Pawn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ChessBoardApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Piece and Position:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		if(input.isEmpty() || input.split(",").length < 2) {
			System.out.println("Please enter valid Piece name and Position");
			return;
		}
		String piece = input.split(SimpleConstants.DELIMITER)[0].trim();
		String position = input.split(SimpleConstants.DELIMITER)[1].trim();
		System.out.println("Piece :" +piece +"\n" +"Position :" +position);

		String[] rows = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] columns = new String[] {"1","2","3","4","5","6","7","8"};

		int rowsIndex = Arrays.asList(rows).indexOf(String.valueOf(position.charAt(0)));
		int colIndex = Arrays.asList(columns).indexOf(String.valueOf(position.charAt(1)));

		if(piece.equalsIgnoreCase(SimpleConstants.PIECE_PAWN)) {
			Pawn pawnMovement = new Pawn();
			System.out.println("Possible moves for Pawn: "
					+ pawnMovement.possibleMoves(rows,columns,rowsIndex,colIndex));
		} else if(piece.equalsIgnoreCase(SimpleConstants.PIECE_KING)){
			King kingMovement = new King();
			System.out.println("Possible moves for King: "
					+ kingMovement.possibleMoves(rows,columns,rowsIndex,colIndex));
		} else {
			System.out.println("Incorrect piece entered:" +piece);
		}
	}

}
