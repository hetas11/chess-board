package com.chessboard.chessboard;

import com.chessboard.move.King;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.mockito.Mockito.when;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ChessBoardApplicationTests {

	@Mock
	private King king;

	@Test
	public void testKingPiece() {


		String[] rows = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
		String[] columns = new String[] {"1","2","3","4","5","6","7","8"};

		when(king.possibleMoves(rows,columns,3,5)).thenReturn("D6");
	}

}
