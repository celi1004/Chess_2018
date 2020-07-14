package Chess_2vs2;

import Piece_each2.*;

class Piece_Set{
	King2 king;
	Queen2 queen;
	Knight2[] knight = new Knight2[2];
	Bishop2[] bishop = new Bishop2[2];
	Rook2[] rook = new Rook2[2];
	Pawn2[] pawn = new Pawn2[8];
}

public class Player_Piece2 {
	
	public final static String ORANGE = "orange";
	public final static String BLUE = "blue";
	public final static String GREEN = "green";
	public final static String PURPLE = "purple";
	
	Piece_Set[] player = new Piece_Set[4];
	
	public void initialize(){
		
		player[0] = new Piece_Set();
		player[1] = new Piece_Set();
		player[2] = new Piece_Set();
		player[3] = new Piece_Set();
		
		player[0].king = new King2(true, ORANGE, 7, 13);
		player[0].queen = new Queen2(true, ORANGE, 6, 13);
		player[0].knight[0] = new Knight2(true, ORANGE, 4, 13);
		player[0].knight[1] = new Knight2(true, ORANGE, 9, 13);
		player[0].bishop[0] = new Bishop2(true, ORANGE, 5, 13);
		player[0].bishop[1] = new Bishop2(true, ORANGE, 8, 13);
		player[0].rook[0] = new Rook2(true, ORANGE, 3, 13);
		player[0].rook[1] = new Rook2(true, ORANGE, 10, 13);
		for(int i=0; i<8; i++) {
			player[0].pawn[i] = new Pawn2(true, ORANGE, i+3, 12);
		}
		
		player[1].king = new King2(true, BLUE, 0, 6);
		player[1].queen = new Queen2(true, BLUE, 0, 7);
		player[1].knight[0] = new Knight2(true, BLUE, 0, 4);
		player[1].knight[1] = new Knight2(true, BLUE, 0, 9);
		player[1].bishop[0] = new Bishop2(true, BLUE, 0, 5);
		player[1].bishop[1] = new Bishop2(true, BLUE, 0, 8);
		player[1].rook[0] = new Rook2(true, BLUE, 0, 3);
		player[1].rook[1] = new Rook2(true, BLUE, 0, 10);
		for(int i=0; i<8; i++) {
			player[1].pawn[i] = new Pawn2(true, BLUE, 1, i+3);
		}
		
		player[2].king = new King2(true, GREEN, 6, 0);
		player[2].queen = new Queen2(true, GREEN, 7, 0);
		player[2].knight[0] = new Knight2(true, GREEN, 4, 0);
		player[2].knight[1] = new Knight2(true, GREEN, 9, 0);
		player[2].bishop[0] = new Bishop2(true, GREEN, 5, 0);
		player[2].bishop[1] = new Bishop2(true, GREEN, 8, 0);
		player[2].rook[0] = new Rook2(true, GREEN, 3, 0);
		player[2].rook[1] = new Rook2(true, GREEN, 10, 0);
		for(int i=0; i<8; i++) {
			player[2].pawn[i] = new Pawn2(true, GREEN, i+3, 1);
		}
		
		player[3].king = new King2(true, PURPLE, 13, 7);
		player[3].queen = new Queen2(true, PURPLE, 13, 6);
		player[3].knight[0] = new Knight2(true, PURPLE, 13, 4);
		player[3].knight[1] = new Knight2(true, PURPLE, 13, 9);
		player[3].bishop[0] = new Bishop2(true, PURPLE, 13, 5);
		player[3].bishop[1] = new Bishop2(true, PURPLE, 13, 8);
		player[3].rook[0] = new Rook2(true, PURPLE, 13, 3);
		player[3].rook[1] = new Rook2(true, PURPLE, 13, 10);
		for(int i=0; i<8; i++) {
			player[3].pawn[i] = new Pawn2(true, PURPLE, 12, i+3);
		}
	}
	
}
