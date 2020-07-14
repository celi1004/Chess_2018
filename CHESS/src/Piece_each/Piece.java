package Piece_each;

import Chess_1vs1.Game;

public class Piece extends Piece_value {
	// 인자값 좌표에 king이 있으면 true

	public Piece(boolean valid, String color, int x, int y) {
		super();
		this.valid = valid;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public Piece() {
		super();
	}

	public String isavailable(int x, int y) {

		if (Game.existImage(x, y)) {
			if (Game.colorImage(x, y) == color) {
				return "nochange";
			} else {
				return "enemy";
			}
		} else {
			return "empty";

		}
	}

	public boolean validMove(boolean canMove) {
		// TODO Auto-generated method stub
		return false;
	}
}

class Piece_value implements coordi {
	public boolean valid = true; // 말이 있냐
	public int x, y;
	public String color;

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean validMove(boolean canMove) {
		return false;
	}

	// 이동가능하면 판을 노란색으로 바꾸기
	public boolean kingCheck(King king) {

		return true;
	}
}

interface coordi {
	public int getX();

	public int getY();

	public void setX(int x);

	public void setY(int y);
}