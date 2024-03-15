package com.chessboard.chessboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void test_possibleMovesforPawn() {
        String piece = "pawn";
        String position = "E6";

        Game gameTest = new Game();
        String response = gameTest.gamePiece(piece,position);

        assertEquals(response, "E7");

    }

    @Test
    public void test_possibleMovesforKingE7() {
        String piece = "King";
        String position = "E7";

        Game gameTest = new Game();
        String response = gameTest.gamePiece(piece,position);
        assertEquals(response, "E8,E6,D7,F7,D8,D6,F8,F6");

    }

    @Test
    public void test_possibleMovesforKingE8() {
        String piece = "King";
        String position = "A8";

        Game gameTest = new Game();
        String response = gameTest.gamePiece(piece,position);
        assertEquals(response, "E7,D8,F8,D7,F7");

    }

    @Test
    public void test_possibleMovesforKingA8() {
        String piece = "King";
        String position = "E8";

        Game gameTest = new Game();
        String response = gameTest.gamePiece(piece,position);
        assertEquals(response, "E7,D8,F8,D7,F7");

    }

    @Test
    public void test_possibleMovesforKingA0() {
        String piece = "King";
        String position = "A0";

        Game gameTest = new Game();
        String response = gameTest.gamePiece(piece,position);
        assertEquals(response, "E7,D8,F8,D7,F7");

    }


}
