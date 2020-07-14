package Piece_each;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;

public class Bishop extends Piece {

	public Bishop(boolean valid, String color, int x, int y) {
		super(valid, color, x, y);
		// TODO Auto-generated constructor stub
	}

	public Bishop() {
		super();
	}

	@Override
	public boolean validMove(boolean canMove) {
		// TODO Auto-generated method stub
		// 이동가능한 칸을 노란색으로 바꾸기
		boolean move = false;
		if(canMove != true) Game.change_background("Pink", x, y);

		for (int a = 1; a < 8; a++) {
			if (x + a < 8 && y + a < 8) {

				if (isavailable(x + a, y + a) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x + a, y + a);
					if (MakeCheck.makecheck(x, y, x + a, y + a)) {
						if (((x + a) + (y + a)) % 2 == 0) {
							Game.change_background("White", x + a, y + a);
						} else {
							Game.change_background("Purple", x + a, y + a);
						}
					}
					else move = true;

				} else if (isavailable(x + a, y + a) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x + a, y + a);
					if (MakeCheck.makecheck(x, y, x + a, y + a)) {
						if (((x + a) + (y + a)) % 2 == 0) {
							Game.change_background("White", x + a, y + a);
						} else {
							Game.change_background("Purple", x + a, y + a);
						}
					}
					else move = true;
					break;
				} else
					break;
			}
		}

		for (int a = 1; a < 8; a++) {
			if (x + a < 8 && y - a >= 0) {
				if (isavailable(x + a, y - a) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x + a, y - a);
					if (MakeCheck.makecheck(x, y, x + a, y - a)) {
						if (((x + a) + (y - a)) % 2 == 0) {
							Game.change_background("White", x + a, y - a);
						} else {
							Game.change_background("Purple", x + a, y - a);
						}
					}
					else move = true;
				} else if (isavailable(x + a, y - a) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x + a, y - a);
					if (MakeCheck.makecheck(x, y, x + a, y - a)) {
						if (((x + a) + (y - a)) % 2 == 0) {
							Game.change_background("White", x + a, y - a);
						} else {
							Game.change_background("Purple", x + a, y - a);
						}
					}
					else move = true;
					break;
				} else
					break;
			}
		}

		for (int a = 1; a < 8; a++) {
			if (x - a >= 0 && y + a < 8) {
				if (isavailable(x - a, y + a) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x - a, y + a);
					if (MakeCheck.makecheck(x, y, x - a, y + a)) {
						if (((x - a) + (y + a)) % 2 == 0) {
							Game.change_background("White", x - a, y + a);
						} else {
							Game.change_background("Purple", x - a, y + a);
						}
					}
					else move = true;
				} else if (isavailable(x - a, y + a) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x - a, y + a);
					if (MakeCheck.makecheck(x, y, x - a, y + a)) {
						if (((x - a) + (y + a)) % 2 == 0) {
							Game.change_background("White", x - a, y + a);
						} else {
							Game.change_background("Purple", x - a, y + a);
						}
					}
					else move = true;
					break;
				} else
					break;
			}
		}

		for (int a = 1; a < 8; a++) {
			if (x - a >= 0 && y - a >= 0) {
				if (isavailable(x - a, y - a) == "empty") {
					if(canMove != true) Game.change_background("Yellow", x - a, y - a);
					if (MakeCheck.makecheck(x, y, x - a, y - a)) {
						if (((x - a) + (y - a)) % 2 == 0) {
							Game.change_background("White", x - a, y - a);
						} else {
							Game.change_background("Purple", x - a, y - a);
						}
					}
					else move = true;
				} else if (isavailable(x - a, y - a) == "enemy") {
					if(canMove != true) Game.change_background("Yellow", x - a, y - a);
					if (MakeCheck.makecheck(x, y, x - a, y - a)) {
						if (((x - a) + (y - a)) % 2 == 0) {
							Game.change_background("White", x - a, y - a);
						} else {
							Game.change_background("Purple", x - a, y - a);
						}
					}
					else move = true;
					break;
				} else
					break;
			}
		}
		return move;
	}

	@Override
	public boolean kingCheck(King king) {
		// TODO Auto-generated method stub
		// white = true, black = false

		for (int a = 1; a < 8; a++) {
			if (x + a < 8 && y + a < 8) {

				if (isavailable(x + a, y + a) == "empty") {
					if (king.getX() == x + a && king.getY() == y + a) {
						return true;
					}
				} else if (isavailable(x + a, y + a) == "enemy") {
					if (king.getX() == x + a && king.getY() == y + a) {
						return true;
					}
					break;
				} else
					break;
			}
		}

		for (int a = 1; a < 8; a++) {
			if (x + a < 8 && y - a >= 0) {
				if (isavailable(x + a, y - a) == "empty") {
					if (king.getX() == x + a && king.getY() == y - a) {
						return true;
					}
				} else if (isavailable(x + a, y - a) == "enemy") {
					if (king.getX() == x + a && king.getY() == y - a) {
						return true;
					}
					break;
				} else
					break;
			}
		}

		for (int a = 1; a < 8; a++) {
			if (x - a >= 0 && y + a < 8) {
				if (isavailable(x - a, y + a) == "empty") {
					if (king.getX() == x - a && king.getY() == y + a) {
						return true;
					}
				} else if (isavailable(x - a, y + a) == "enemy") {
					if (king.getX() == x - a && king.getY() == y + a) {
						return true;
					}
					break;
				} else
					break;
			}
		}

		for (int a = 1; a < 8; a++) {
			if (x - a >= 0 && y - a >= 0) {
				if (isavailable(x - a, y - a) == "empty") {
					if (king.getX() == x - a && king.getY() == y - a) {
						return true;
					}
				} else if (isavailable(x - a, y - a) == "enemy") {
					if (king.getX() == x - a && king.getY() == y - a) {
						return true;
					}
					break;
				} else
					break;
			}
		}
		return false;
	}
}