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

		Game game = new Game();
		String response = game.gamePiece(piece,position);
		System.out.println("Possible Moves:" +response);

	}

}
