package Piece_each2;

import Chess_1vs1.Game;
import Chess_2vs2.Game2;

public class Piece2 extends Piece_value {
	// 인자값 좌표에 king이 있으면 true

	public Piece2(boolean valid, String color, int x, int y) {
		super();
		this.valid = valid;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public Piece2() {
		super();
	}


	public String isavailable_2(int x1, int y1, int x2, int y2) {
		if (Game2.existImage2(x2, y2)) {
			if ((Game2.colorImage2(x1, y1) == "green" || Game2.colorImage2(x1, y1) == "orange") && (Game2.colorImage2(x2, y2) == "orange" || Game2.colorImage2(x2, y2) == "green")){
				return "nochange";
			}
			else if (((Game2.colorImage2(x1, y1) == "blue"|| Game2.colorImage2(x1, y1) == "purple") && (Game2.colorImage2(x2, y2) == "purple" || Game2.colorImage2(x2, y2) == "blue"))){
				return "nochange";
			}
			else {
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

	public boolean boundary2(int x, int y) {
		if(x<0 || y<0 || x>13 || y>13) return false;
		else if(x<=2 && y<=2) return false;
		else if(x<=2 && y>10) return false;
		else if(x>10 && y<=2) return false;
		else if(x>10 && y>10) return false;
		else return true;
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
	public boolean kingCheck(King2 king) {

		return true;
	}
}

interface coordi {
	public int getX();

	public int getY();

	public void setX(int x);

	public void setY(int y);
}