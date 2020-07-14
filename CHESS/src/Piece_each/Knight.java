package Piece_each;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;

public class Knight extends Piece {

	public Piece IsAvailable;

	public Knight() {
		super();
	}

	public Knight(boolean valid, String color, int x, int y) {
		super(valid, color, x, y);
	}

	public boolean validMove(boolean canMove) {

		boolean move = false;
		if(canMove != true) Game.change_background("Pink", x, y);
		
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if (x + i < 8 && y + j < 8 && (i + j == 3)) {
					if (isavailable(x + i, y + j) == "enemy" || isavailable(x + i, y + j) == "empty") {
						if(canMove != true) Game.change_background("Yellow", x + i, y + j);
						if (MakeCheck.makecheck(x, y, x + i, y + j)) {
							if ((x + y + i + j) % 2 == 0) {
								Game.change_background("White", x + i, y + j);
							} else {
								Game.change_background("Purple", x + i, y + j);
							}
						}
						else move = true;
					}
				}

				if (x - i >= 0 && y - j >= 0 && (i + j == 3)) {
					if (isavailable(x - i, y - j) == "enemy" || isavailable(x - i, y - j) == "empty") {
						if(canMove != true) Game.change_background("Yellow", x - i, y - j);
						if (MakeCheck.makecheck(x, y, x - i, y - j)) {
							if ((x + y - i - j) % 2 == 0) {
								Game.change_background("White", x - i, y - j);
							} else {
								Game.change_background("Purple", x - i, y - j);
							}
						}
						else move = true;
					}
				}
				if ( x + i < 8 && y - j >= 0 && (i + j == 3)) {
					if (isavailable(x + i, y - j) == "enemy" || isavailable(x + i, y - j) == "empty") {
						if(canMove != true) Game.change_background("Yellow", x + i, y - j);
						if (MakeCheck.makecheck(x, y, x + i, y - j)) {
							if ((x + y + i - j) % 2 == 0) {
								Game.change_background("White", x + i, y - j);
							} else {
								Game.change_background("Purple", x + i, y - j);
							}
						}
						else move = true;
					}
				}
				if (x - i >= 0 &&  y + j < 8 && (i + j == 3)) {
					if (isavailable(x - i, y + j) == "enemy" || isavailable(x - i, y + j) == "empty") {
						if(canMove != true) Game.change_background("Yellow", x - i, y + j);
						if (MakeCheck.makecheck(x, y, x - i, y + j)) {
							if ((x + y - i - j) % 2 == 0) {
								Game.change_background("White", x - i, y + j);
							} else {
								Game.change_background("Purple", x - i, y + j);
							}
						}
						else move = true;
					}
				}
			}
		}
		
		return move;
	}

	public boolean kingCheck(King king) {
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if ( x + i < 8 &&  y + j < 8 && (i + j == 3)) {
					if (isavailable(x + i, y + j) == "enemy" || isavailable(x + i, y + j) == "empty") {
						if (king.getX() == x + i && king.getY() == y + j) {
							return true;
						}
					}
				}
				if (x - i >= 0 && y - j >= 0 && (i + j == 3)) {
					if (isavailable(x - i, y - j) == "enemy" || isavailable(x - i, y - j) == "empty") {
						if (king.getX() == x - i && king.getY() == y - j) {
							return true;
						}
					}
				}
				if ( x + i < 8 && y - j >= 0 && (i + j == 3)) {
					if (isavailable(x + i, y - j) == "enemy" || isavailable(x + i, y - j) == "empty") {
						if (king.getX() == x + i && king.getY() == y - j) {
							return true;
						}
					}
				}
				if (x - i >= 0  &&  y + j < 8 && (i + j == 3)) {
					if (isavailable(x - i, y + j) == "enemy" || isavailable(x - i, y + j) == "empty") {
						if (king.getX() == x - i && king.getY() == y + j) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}