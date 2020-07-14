package Chess_1vs1;

import Piece_each.*;

class Piece_Set{
	King king;
	Queen queen;
	Knight[] knight = new Knight[2];
	Bishop[] bishop = new Bishop[2];
	Rook[] rook = new Rook[2];
	Pawn[] pawn = new Pawn[8];
}

public class Player_Piece {
	
	public final static String WHITE = "white";
	public final static String BLACK = "black";
	
	Piece_Set[] player = new Piece_Set[2];
	
	public void initialize(){
		
		player[0] = new Piece_Set();
		player[1] = new Piece_Set();
		
		player[0].king = new King(true, WHITE, 4, 7);
		player[0].queen = new Queen(true, WHITE, 3, 7);
		player[0].knight[0] = new Knight(true, WHITE, 1, 7);
		player[0].knight[1] = new Knight(true, WHITE, 6, 7);
		player[0].bishop[0] = new Bishop(true, WHITE, 2, 7);
		player[0].bishop[1] = new Bishop(true, WHITE, 5, 7);
		player[0].rook[0] = new Rook(true, WHITE, 0, 7);
		player[0].rook[1] = new Rook(true, WHITE, 7, 7);
		for(int i=0; i<8; i++) {
			player[0].pawn[i] = new Pawn(true, WHITE, i, 6);
		}
		
		player[1].king = new King(true, BLACK, 4, 0);
		player[1].queen = new Queen(true, BLACK, 3, 0);
		player[1].knight[0] = new Knight(true, BLACK, 1, 0);
		player[1].knight[1] = new Knight(true, BLACK, 6, 0);
		player[1].bishop[0] = new Bishop(true, BLACK, 2, 0);
		player[1].bishop[1] = new Bishop(true, BLACK, 5, 0);
		player[1].rook[0] = new Rook(true, BLACK, 0, 0);
		player[1].rook[1] = new Rook(true, BLACK, 7, 0);
		for(int i=0; i<8; i++) {
			player[1].pawn[i] = new Pawn(true, BLACK, i, 1);
		}
	}
	
}
