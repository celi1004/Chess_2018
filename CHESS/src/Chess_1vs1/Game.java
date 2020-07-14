package Chess_1vs1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import GameScreen.ChessPieceSprite;
import GameScreen.ChessPieceSprite.ChessPieceSpriteType;
import GameScreen.ImagePanel;

public class Game extends JFrame {

	public static ImagePanel[][] imagepanel = new ImagePanel[8][8];;
	Container screen1 = getContentPane();
	static BufferedImage[] white = new BufferedImage[16];
	static BufferedImage[] black = new BufferedImage[16];
	public static Player_Piece player_piece = new Player_Piece();
	public static JPanel fullpanel = new JPanel();
	public static JPanel chesspanel = new JPanel();
	public static JLabel turn_label = new JLabel(new String("''IT'S WHITE TURN''"), JLabel.CENTER);
	public static ImagePanel diewhite = new ImagePanel();
	public static ImagePanel dieblack = new ImagePanel();
	public static ImagePanel[][] diepiece = new ImagePanel[2][32];
	public static Color Yellow = new Color(253, 226, 176);
	public static Color Skyblue = new Color(153, 217, 234);
	public static Color Purple = new Color(213, 165, 226);
	public static Color Pink = new Color(255, 193, 211);
	public static boolean turn = false;
	public static boolean move = true;
	public static boolean Click = false;
	public static int diewhitenum = 8;
	public static int dieblacknum = 8;

	public Game() {
		setTitle("1 VS 1 CHESS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		player_piece.initialize();

		set_Style();
		setImagePanel_Image();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				imagepanel[i][j].addMouseListener(new MouseClick());
			}
		}

		/*
		 * TEST!!!!
		 * 
		 * 
		 * String rulestate;
		 * 
		 * player_piece.player[1].queen.valid = false; for(int i=0; i<2; i++) {
		 * player_piece.player[1].knight[i].valid = false;
		 * player_piece.player[1].bishop[i].valid = false;
		 * player_piece.player[1].rook[i].valid = false; } move_diepiece(4,0,8);
		 * move_diepiece(1,0,9); move_diepiece(6,0,10); move_diepiece(2,0,11);
		 * move_diepiece(5,0,12); move_diepiece(0,0,13); move_diepiece(7,0,14); for(int
		 * j=0; j<7; j++) { player_piece.player[1].pawn[j].valid = false;
		 * move_diepiece(j,1,j+15); }
		 * 
		 * 
		 * player_piece.player[0].queen.valid = false; for(int i=0; i<2; i++) {
		 * player_piece.player[0].knight[i].valid = false;
		 * player_piece.player[0].bishop[i].valid = false;
		 * player_piece.player[0].rook[i].valid = false; } move_diepiece(4,7,8);
		 * move_diepiece(1,7,9); move_diepiece(6,7,10); move_diepiece(2,7,11);
		 * move_diepiece(5,7,12); move_diepiece(0,7,13); move_diepiece(7,7,14); for(int
		 * j=0; j<8; j++) { player_piece.player[1].pawn[j].valid = false;
		 * move_diepiece(j,6,j+15); } changeImagePanel(7,1, 7,6);
		 * change_pieceXY(7,1,7,6); if(GameManager.rule(turn) == "StaleMate") { PopUp
		 * stalemate = new PopUp("stalemate", "draw"); }
		 */

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((int) (screen.getWidth() / 2 - 750), (int) (screen.getHeight() / 2 - 450));
		setSize(1500, 920);
		setVisible(true);

	}

	// 패널 처음 이미지 세팅
	// 이미지 값 배열 white[], black[] 선언
	public void setImagePanel_Image() {

		imagepanel[4][7]
				.setImage(white[0] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KING));
		imagepanel[3][7]
				.setImage(white[1] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_QUEEN));
		imagepanel[1][7]
				.setImage(white[2] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
		imagepanel[6][7]
				.setImage(white[3] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_KNIGHT));
		imagepanel[2][7]
				.setImage(white[4] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_BISHOP));
		imagepanel[5][7].setImage(white[5] = white[4]);
		imagepanel[0][7]
				.setImage(white[6] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_LOOK));
		imagepanel[7][7].setImage(white[7] = white[6]);
		white[8] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.WHITE_PAWN);
		for (int i = 0; i < 8; i++) {
			imagepanel[i][6].setImage(white[i + 8] = white[8]);
		}

		imagepanel[4][0]
				.setImage(black[0] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KING));
		imagepanel[3][0]
				.setImage(black[1] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_QUEEN));
		imagepanel[1][0]
				.setImage(black[2] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_KNIGHT));
		imagepanel[6][0].setImage(black[3] = black[2]);
		imagepanel[2][0]
				.setImage(black[4] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_BISHOP));
		imagepanel[5][0].setImage(black[5] = black[4]);
		imagepanel[0][0]
				.setImage(black[6] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_LOOK));
		imagepanel[7][0].setImage(black[7] = black[6]);
		black[8] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLACK_PAWN);
		for (int i = 0; i < 8; i++) {
			imagepanel[i][1].setImage(black[i + 8] = black[8]);
		}

	}

	// 패널 처음 스타일 세팅
	public void set_Style() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				screen1.add(imagepanel[i][j] = new ImagePanel());
				imagepanel[i][j].setSize(100, 100);
				imagepanel[i][j].setLocation((100 * i) + 50, (100 * j) + 50);
				if ((i + j) % 2 == 0) {
					imagepanel[i][j].setBackground(Color.white);
				} else {
					imagepanel[i][j].setBackground(Purple);
				}
				imagepanel[i][j].setBorder(BorderFactory.createLineBorder(new Color(232, 190, 248), 2));
				imagepanel[i][j].setOpaque(true);
			}
		}

		/* 전체 패널 세팅 */
		screen1.add(fullpanel);
		fullpanel.setLayout(null);
		fullpanel.setSize(1500, 900);
		fullpanel.setLocation(0, 0);
		fullpanel.setBackground(new Color(250, 245, 247));

		/* 죽은 말 */
		fullpanel.add(diewhite);
		fullpanel.add(dieblack);
		diewhite.setSize(600, 330);
		dieblack.setSize(600, 330);
		diewhite.setLocation(870, 150);
		dieblack.setLocation(870, 500);
		diewhite.setBackground(Color.WHITE);
		dieblack.setBackground(Color.WHITE);
		diewhite.setLayout(new GridLayout(4, 8));
		dieblack.setLayout(new GridLayout(4, 8));
		for (int i = 0; i < 32; i++) {
			diepiece[0][i] = new ImagePanel();
			diewhite.add(diepiece[0][i], i);
			diepiece[1][i] = new ImagePanel();
			dieblack.add(diepiece[1][i], i);
		}

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("image1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		diewhite.setImage(img);
		try {
			img = ImageIO.read(new File("image2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		dieblack.setImage(img);

		/* 체스 판 패널 */
		fullpanel.add(chesspanel);
		chesspanel.setSize(800, 800);
		chesspanel.setLocation(50, 50);
		chesspanel.setBackground(Color.WHITE);
		chesspanel.setOpaque(true);

		/* 턴 라벨 셋팅 */
		fullpanel.add(turn_label);
		turn_label.setFont(new Font("휴먼고딕", Font.BOLD, 40));
		turn_label.setSize(500, 60);
		turn_label.setLocation(925, 40);
		turn_label.setForeground(new Color(190, 116, 210));
		turn_label.setBackground(Color.WHITE);
		turn_label.setBorder(BorderFactory.createLineBorder((new Color(232, 190, 248)), 4));
		turn_label.setOpaque(false);
	}

	// 패널 이미지값 바꾸기
	public static void changeImagePanel(int fromX, int fromY, int toX, int toY) {

		BufferedImage tempimg = imagepanel[fromX][fromY].getImage();
		imagepanel[toX][toY].setImage(tempimg);
		imagepanel[fromX][fromY].setImage(null);
		if ((fromX + fromY) % 2 == 0) {
			imagepanel[fromX][fromY].setBackground(Color.WHITE);
		} else {
			imagepanel[fromX][fromY].setBackground(Purple);
		}
	}

	// 각 말 객체들 좌표값 바꾸기
	public static void change_pieceXY(int fromX, int fromY, int toX, int toY) {

		for (int i = 0; i < 2; i++) {
			if (player_piece.player[i].king.getX() == fromX && player_piece.player[i].king.getY() == fromY) {
				player_piece.player[i].king.setX(toX);
				player_piece.player[i].king.setY(toY);
			}
			if (player_piece.player[i].queen.getX() == fromX && player_piece.player[i].queen.getY() == fromY) {
				player_piece.player[i].queen.setX(toX);
				player_piece.player[i].queen.setY(toY);
			}
			for (int j = 0; j < 2; j++) {
				if (player_piece.player[i].knight[j].getX() == fromX
						&& player_piece.player[i].knight[j].getY() == fromY) {
					player_piece.player[i].knight[j].setX(toX);
					player_piece.player[i].knight[j].setY(toY);
				}
				if (player_piece.player[i].bishop[j].getX() == fromX
						&& player_piece.player[i].bishop[j].getY() == fromY) {
					player_piece.player[i].bishop[j].setX(toX);
					player_piece.player[i].bishop[j].setY(toY);
				}

				if (player_piece.player[i].rook[j].getX() == fromX && player_piece.player[i].rook[j].getY() == fromY) {
					player_piece.player[i].rook[j].setX(toX);
					player_piece.player[i].rook[j].setY(toY);
				}
			}
			for (int k = 0; k < 8; k++) {
				if (player_piece.player[i].pawn[k].getX() == fromX && player_piece.player[i].pawn[k].getY() == fromY) {
					player_piece.player[i].pawn[k].setX(toX);
					player_piece.player[i].pawn[k].setY(toY);
				}
			}
		}
	}

	// 이미지가 존재하는지 확인
	// 존재하면 true 반환
	public static boolean existImage(int x, int y) {
		if (imagepanel[x][y].getImage() == null)
			return false;
		else
			return true;
	}

	// color가 뭔지 확인
	// color이름 문자열 반환
	public static String colorImage(int x, int y) {

		BufferedImage img = imagepanel[x][y].getImage();
		for (int i = 0; i < 15; i++) {
			if (img == white[i])
				return "white";
			else if (img == black[i])
				return "black";
		}
		return null;
	}

	// 판 색 바꿔주는 메소드
	public static void change_background(String color, int x, int y) {

		if (color == "Yellow") {
			imagepanel[x][y].setBackground(Yellow);
		}

		else if (color == "Skyblue") {
			imagepanel[x][y].setBackground(Skyblue);
		}

		else if (color == "Pink") {
			imagepanel[x][y].setBackground(Pink);
		}

		else if (color == "White") {
			imagepanel[x][y].setBackground(Color.white);
		}

		else if (color == "Purple") {
			imagepanel[x][y].setBackground(Purple);
		}

	}

	// 노란색 타일이면 원상복귀해주는 메소드
	public static void reset_background() {

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (imagepanel[i][j].getBackground() == Yellow || imagepanel[i][j].getBackground() == Pink) {
					if ((i + j) % 2 == 0) {
						imagepanel[i][j].setBackground(Color.white);
					} else {
						imagepanel[i][j].setBackground(Purple);
					}
				}
			}
		}
	}

	// 죽은 말 옮기고 체스판에서 이미지 지우는 메소드
	public static void move_diepiece(int x, int y, int i) {
		// x, y에 죽은 말 좌표 입력
		// i는 번호 8-23까지
		BufferedImage tempimg = imagepanel[x][y].getImage();

		if (colorImage(x, y) == "white") {
			imagepanel[x][y].setImage(null);
			diepiece[0][i].setImage(tempimg);
			diepiece[0][i].repaint();
		} else if (colorImage(x, y) == "black") {
			diepiece[1][i].setImage(tempimg);
			imagepanel[x][y].setImage(null);
			diepiece[1][i].repaint();
		}
	}

	public static String get_Whatpiece(int x, int y) {

		if (player_piece.player[0].king.getX() == x && player_piece.player[0].king.getY() == y) {
			return "WhiteKing";
		}
		if (player_piece.player[0].queen.getX() == x && player_piece.player[0].queen.getY() == y) {
			return "WhiteQueen";
		}
		if (player_piece.player[0].knight[0].getX() == x && player_piece.player[0].knight[0].getY() == y) {
			return "WhiteKnight0";
		}
		if (player_piece.player[0].knight[1].getX() == x && player_piece.player[0].knight[1].getY() == y) {
			return "WhiteKnight1";
		}
		if (player_piece.player[0].bishop[0].getX() == x && player_piece.player[0].bishop[0].getY() == y) {
			return "WhiteBishop0";
		}
		if (player_piece.player[0].bishop[1].getX() == x && player_piece.player[0].bishop[1].getY() == y) {
			return "WhiteBishop1";
		}
		if (player_piece.player[0].rook[0].getX() == x && player_piece.player[0].rook[0].getY() == y) {
			return "WhiteRook0";
		}
		if (player_piece.player[0].rook[1].getX() == x && player_piece.player[0].rook[1].getY() == y) {
			return "WhiteRook1";
		}
		if (player_piece.player[0].pawn[0].getX() == x && player_piece.player[0].pawn[0].getY() == y) {
			return "WhitePawn0";
		}
		if (player_piece.player[0].pawn[1].getX() == x && player_piece.player[0].pawn[1].getY() == y) {
			return "WhitePawn1";
		}
		if (player_piece.player[0].pawn[2].getX() == x && player_piece.player[0].pawn[2].getY() == y) {
			return "WhitePawn2";
		}
		if (player_piece.player[0].pawn[3].getX() == x && player_piece.player[0].pawn[3].getY() == y) {
			return "WhitePawn3";
		}
		if (player_piece.player[0].pawn[4].getX() == x && player_piece.player[0].pawn[4].getY() == y) {
			return "WhitePawn4";
		}
		if (player_piece.player[0].pawn[5].getX() == x && player_piece.player[0].pawn[5].getY() == y) {
			return "WhitePawn5";
		}
		if (player_piece.player[0].pawn[6].getX() == x && player_piece.player[0].pawn[6].getY() == y) {
			return "WhitePawn6";
		}
		if (player_piece.player[0].pawn[7].getX() == x && player_piece.player[0].pawn[7].getY() == y) {
			return "WhitePawn7";
		}

		// 블랙
		if (player_piece.player[1].king.getX() == x && player_piece.player[1].king.getY() == y) {
			return "BlackKing";
		}
		if (player_piece.player[1].queen.getX() == x && player_piece.player[1].queen.getY() == y) {
			return "BlackQueen";
		}
		if (player_piece.player[1].knight[0].getX() == x && player_piece.player[1].knight[0].getY() == y) {
			return "BlackKnight0";
		}
		if (player_piece.player[1].knight[1].getX() == x && player_piece.player[1].knight[1].getY() == y) {
			return "BlackKnight1";
		}
		if (player_piece.player[1].bishop[0].getX() == x && player_piece.player[1].bishop[0].getY() == y) {
			return "BlackBishop0";
		}
		if (player_piece.player[1].bishop[1].getX() == x && player_piece.player[1].bishop[1].getY() == y) {
			return "BlackBishop1";
		}
		if (player_piece.player[1].rook[0].getX() == x && player_piece.player[1].rook[0].getY() == y) {
			return "BlackRook0";
		}
		if (player_piece.player[1].rook[1].getX() == x && player_piece.player[1].rook[1].getY() == y) {
			return "BlackRook1";
		}
		if (player_piece.player[1].pawn[0].getX() == x && player_piece.player[1].pawn[0].getY() == y) {
			return "BlackPawn0";
		}
		if (player_piece.player[1].pawn[1].getX() == x && player_piece.player[1].pawn[1].getY() == y) {
			return "BlackPawn1";
		}
		if (player_piece.player[1].pawn[2].getX() == x && player_piece.player[1].pawn[2].getY() == y) {
			return "BlackPawn2";
		}
		if (player_piece.player[1].pawn[3].getX() == x && player_piece.player[1].pawn[3].getY() == y) {
			return "BlackPawn3";
		}
		if (player_piece.player[1].pawn[4].getX() == x && player_piece.player[1].pawn[4].getY() == y) {
			return "BlackPawn4";
		}
		if (player_piece.player[1].pawn[5].getX() == x && player_piece.player[1].pawn[5].getY() == y) {
			return "BlackPawn5";
		}
		if (player_piece.player[1].pawn[6].getX() == x && player_piece.player[1].pawn[6].getY() == y) {
			return "BlackPawn6";
		}
		if (player_piece.player[1].pawn[7].getX() == x && player_piece.player[1].pawn[7].getY() == y) {
			return "BlackPawn7";
		}

		return "";
	}

	public static void change_valid(int x, int y) {

		String piece = get_Whatpiece(x, y);

		if (piece == "WhiteKing") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].king.valid = false;
		}
		if (piece == "WhiteQueen") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].queen.valid = false;
		}
		if (piece == "WhiteKnight0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].knight[0].valid = false;
		}
		if (piece == "WhiteKnight1") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].knight[1].valid = false;
		}
		if (piece == "WhiteBishop0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].bishop[0].valid = false;
		}
		if (piece == "WhiteBishop1") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].bishop[1].valid = false;
		}
		if (piece == "WhiteRook0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].rook[0].valid = false;
		}
		if (piece == "WhiteRook0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].rook[1].valid = false;
		}
		if (piece == "WhitePawn0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[0].valid = false;
		}
		if (piece == "WhitePawn1") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[1].valid = false;
		}
		if (piece == "WhitePawn2") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[2].valid = false;
		}
		if (piece == "WhitePawn3") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[3].valid = false;
		}
		if (piece == "WhitePawn4") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[4].valid = false;
		}
		if (piece == "WhitePawn5") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[5].valid = false;
		}
		if (piece == "WhitePawn6") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[6].valid = false;
		}
		if (piece == "WhitePawn7") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[0].pawn[7].valid = false;
		}

		if (piece == "BlackKing") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].king.valid = false;
		}
		if (piece == "BlackQueen") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].queen.valid = false;
		}
		if (piece == "BlackKnight0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].knight[0].valid = false;
		}
		if (piece == "BlackKnight1") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].knight[1].valid = false;
		}
		if (piece == "BlackBishop0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].bishop[0].valid = false;
		}
		if (piece == "BlackBishop1") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].bishop[1].valid = false;
		}
		if (piece == "BlackRook0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].rook[0].valid = false;
		}
		if (piece == "BlackRook0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].rook[1].valid = false;
		}
		if (piece == "BlackPawn0") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[0].valid = false;
		}
		if (piece == "BlackPawn1") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[1].valid = false;
		}
		if (piece == "BlackPawn2") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[2].valid = false;
		}
		if (piece == "BlackPawn3") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[3].valid = false;
		}
		if (piece == "BlackPawn4") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[4].valid = false;
		}
		if (piece == "BlackPawn5") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[5].valid = false;
		}
		if (piece == "BlackPawn6") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[6].valid = false;
		}
		if (piece == "BlackPawn7") {
			change_pieceXY(x, y, 9, 9);
			player_piece.player[1].pawn[7].valid = false;
		}
	}
}

class PopUp extends JFrame {
	PopUp(String text, String text1) {
		
		if(text == "Check") {
			
		}
		setTitle(text);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(230, 230, 230));
		contentPane.setLayout(null);

		JLabel pop = new JLabel(text1, JLabel.CENTER);
		pop.setSize(300, 50);
		pop.setLocation(50, 15);
		contentPane.add(pop);
		pop.setFont(new Font("휴먼고딕", Font.BOLD, 20));

		JButton clickButton = new JButton();


		if(text == "Check") {
			contentPane.add(clickButton = new JButton("OK"));
		}
		else contentPane.add(clickButton = new JButton("EXIT"));
		
		clickButton.setSize(100, 50);
		clickButton.setLocation(150, 80);
		clickButton.setBackground(new Color(255, 170, 170));
		clickButton.setFocusPainted(false);
		clickButton.setFont(new Font("휴먼고딕", Font.BOLD, 20));
		clickButton.setForeground(new Color(255, 255, 255));
		clickButton.addActionListener(new EndActionListener());

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((int) (screen.getWidth() / 2 - 300), (int) (screen.getHeight() / 2 - 150));
		setSize(400, 200);
		setVisible(true);
	}

	private class EndActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("EXIT")) {
				System.exit(0);
			}
			else {
				dispose();
			}
		}

	}
}