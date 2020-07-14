package Piece_each;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;

public class Rook extends Piece {

	public Rook() {
		super();
	}

	public Rook(boolean valid, String color, int x, int y) {
		super(valid, color, x, y);
	}

	public boolean validMove(boolean canMove) { // true 내 말이 갈 수 있는 곳 색칠 false 상대말이 내 말을 볼 수있는지 다 봐줄거야
		boolean move = false;
		int a;
		if(canMove != true) Game.change_background("Pink", x, y);

		for (a = 1; a < 8; a++) {
			if (x + a < 8) {
				if (isavailable(x + a, y) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x + a, y);
					if (MakeCheck.makecheck(x, y, x + a, y)) {
						if (((x + a) + y) % 2 == 0) {
							Game.change_background("White", x + a, y);
						} else {
							Game.change_background("Purple", x + a, y);
						}
					}
					else move = true;
					continue;
				} else if (isavailable(x + a, y) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x + a, y);
					if (MakeCheck.makecheck(x, y, x + a, y)) {
						if (((x + a) + y) % 2 == 0) {
							Game.change_background("White", x + a, y);
						} else {
							Game.change_background("Purple", x + a, y);
						}
					}
					else move = true;
					break;
				} else {
					break;
				}
			}
		}

		for (a = 1; a < 8; a++) {
			if (x - a >= 0) {
				if (isavailable(x - a, y) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x - a, y);
					if (MakeCheck.makecheck(x, y, x - a, y)) {
						if (((x - a) + y) % 2 == 0) {
							Game.change_background("White", x - a, y);
						} else {
							Game.change_background("Purple", x - a, y);
						}
					}
					else move = true;
					continue;
				} else if (isavailable(x - a, y) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x - a, y);
					if (MakeCheck.makecheck(x, y, x - a, y)) {
						if (((x - a) + y) % 2 == 0) {
							Game.change_background("White", x - a, y);
						} else {
							Game.change_background("Purple", x - a, y);
						}
					}
					else move = true;
					break;
				} else {
					break;
				}
			}
		}

		for (a = 1; a < 8; a++) {
			if (y + a < 8) {
				if (isavailable(x, y + a) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x, y + a);
					if (MakeCheck.makecheck(x, y, x, y + a)) {
						if ((x + (y + a)) % 2 == 0) {
							Game.change_background("White", x, y + a);
						} else {
							Game.change_background("Purple", x, y + a);
						}
					}
					else move = true;
					continue;
				} else if (isavailable(x, y + a) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x, y + a);
					if (MakeCheck.makecheck(x, y, x, y + a)) {
						if ((x + (y + a)) % 2 == 0) {
							Game.change_background("White", x, y + a);
						} else {
							Game.change_background("Purple", x, y + a);
						}
					}
					else move = true;
					break;
				} else {
					break;
				}
			}
		}

		for (a = 1; a < 8; a++) {
			if (y - a >= 0) {
				if (isavailable(x, y - a) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x, y - a);
					if (MakeCheck.makecheck(x, y, x, y - a)) {
						if ((x + (y - a)) % 2 == 0) {
							Game.change_background("White", x, y - a);
						} else {
							Game.change_background("Purple", x, y - a);
						}
					}
					else move = true;
					continue;
				} else if (isavailable(x, y - a) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x, y - a);
					if (MakeCheck.makecheck(x, y, x, y - a)) {
						if ((x + (y - a)) % 2 == 0) {
							Game.change_background("White", x, y - a);
						} else {
							Game.change_background("Purple", x, y - a);
						}
					}
					else move = true;
					break;
				} else {
					break;
				}
			}
		}
		return move;
	}

	public boolean kingCheck(King king) { // true 내 말이 갈 수 있는 곳 색칠 false 상대말이 내 말을 볼 수있는지 다 봐줄거야
		int a;

		for (a = 1; a < 8; a++) {
			if (x + a < 8) {
				if (isavailable(x + a, y) == "empty") {
					if (x + a == king.getX() && y == king.getY()) {
						return true;
					}
				} else if (isavailable(x + a, y) == "enemy") {
					if (x + a == king.getX() && y == king.getY()) {
						return true;
					}
					break;
				} else {
					break;
				}
			}
		}

		for (a = 1; a < 8; a++) {
			if (x - a >= 0) {
				if (isavailable(x - a, y) == "empty") {
					if (x - a == king.getX() && y == king.getY()) {
						return true;
					}
				} else if (isavailable(x - a, y) == "enemy") {
					if (x - a == king.getX() && y == king.getY()) {
						return true;
					}
					break;
				} else {
					break;
				}
			}
		}

		for (a = 1; a < 8; a++) {
			if (y + a < 8) {
				if (isavailable(x, y + a) == "empty") {
					if (x == king.getX() && y + a == king.getY()) {
						return true;
					}
				} else if (isavailable(x, y + a) == "enemy") {
					if (x == king.getX() && y + a == king.getY()) {
						return true;
					}
					break;
				} else {
					break;
				}
			}
		}

		for (a = 1; a < 8; a++) {
			if (y - a >= 0) {
				if (isavailable(x, y - a) == "empty") {
					if (x == king.getX() && y - a == king.getY()) {
						return true;
					}
				} else if (isavailable(x, y - a) == "enemy") {
					if (x == king.getX() && y - a == king.getY()) {
						return true;
					}
					break;
				} else {
					break;
				}
			}
		}

		return false;
	}

}