package Chess_2vs2;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import Chess_1vs1.Game;
import Chess_1vs1.MouseClick;
import GameScreen.ChessPieceSprite;
import GameScreen.ChessPieceSprite.ChessPieceSpriteType;
import GameScreen.ImagePanel;

public class Game2 extends JFrame {

	// Yellow, Skyblue, Purple Game에서 갖다 쓰기
	// Game.Yellow -> 이런식으로 사용해야 함

	public static Player_Piece2 player_piece = new Player_Piece2();
	Container screen2 = getContentPane();
	public static ImagePanel[][] imagepanel2 = new ImagePanel[14][14];
	static BufferedImage[] green = new BufferedImage[16];
	static BufferedImage[] purple = new BufferedImage[16];
	static BufferedImage[] orange = new BufferedImage[16];
	static BufferedImage[] blue = new BufferedImage[16];
	public static JPanel fullpanel2 = new JPanel();
	public static ImagePanel diegreen = new ImagePanel();
	public static ImagePanel diepurple = new ImagePanel();
	public static ImagePanel dieorange = new ImagePanel();
	public static ImagePanel dieblue = new ImagePanel();
	public static ImagePanel[][] diepiece = new ImagePanel[4][20];
	// 0 = orange, 1 = blue, 2 = green, 3 = purple
	public static int turn = 0;
	public static boolean move = false;
	public static boolean Click = false;
	public static int dieorangenum = 4, diebluenum = 4, diegreennum = 4, diepurplenum = 4;

	public Game2() {
		setTitle("2 VS 2 CHESS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		player_piece.initialize();
		set_Style2();
		setImagepanel_Image2();

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int) screen.getWidth(), (int) screen.getHeight());
		setVisible(true);
	}

	/*
	 * PopUp(String); get_Whatpiece(); change_pieceXY();는 Game꺼 가져와서 씀
	 */

	public void setImagepanel_Image2() {
		imagepanel2[7][13]
				.setImage(orange[0] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_KING));
		imagepanel2[6][13]
				.setImage(orange[1] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_QUEEN));
		imagepanel2[4][13]
				.setImage(orange[2] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_KNIGHT));
		imagepanel2[9][13]
				.setImage(orange[3] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_KNIGHT));
		imagepanel2[5][13]
				.setImage(orange[4] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_BISHOP));
		imagepanel2[8][13].setImage(orange[5] = orange[4]);
		imagepanel2[3][13]
				.setImage(orange[6] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_LOOK));
		imagepanel2[10][13].setImage(orange[7] = orange[6]);
		orange[8] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.ORANGE_PAWN);
		for (int i = 3; i < 11; i++) {
			imagepanel2[i][12].setImage(orange[i + 5] = orange[8]);
		}

		imagepanel2[6][0]
				.setImage(green[0] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KING));
		imagepanel2[7][0]
				.setImage(green[1] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_QUEEN));
		imagepanel2[4][0]
				.setImage(green[2] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_KNIGHT));
		imagepanel2[9][0].setImage(green[3] = green[2]);
		imagepanel2[5][0]
				.setImage(green[4] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_BISHOP));
		imagepanel2[8][0].setImage(green[5] = green[4]);
		imagepanel2[3][0]
				.setImage(green[6] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_LOOK));
		imagepanel2[10][0].setImage(green[7] = green[6]);
		green[8] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.GREEN_PAWN);
		for (int i = 3; i < 11; i++) {
			imagepanel2[i][1].setImage(green[i + 5] = green[8]);
		}

		imagepanel2[13][7]
				.setImage(purple[0] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_KING));
		imagepanel2[13][6]
				.setImage(purple[1] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_QUEEN));
		imagepanel2[13][4]
				.setImage(purple[2] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_KNIGHT));
		imagepanel2[13][9]
				.setImage(purple[3] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_KNIGHT));
		imagepanel2[13][5]
				.setImage(purple[4] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_BISHOP));
		imagepanel2[13][8]
				.setImage(purple[5] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_BISHOP));
		imagepanel2[13][3]
				.setImage(purple[6] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_LOOK));
		imagepanel2[13][10]
				.setImage(purple[7] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_LOOK));
		for (int i = 3; i < 11; i++) {
			imagepanel2[12][i].setImage(
					purple[i + 5] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.PURPLE_PAWN));
		}

		imagepanel2[0][6]
				.setImage(blue[0] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_KING));
		imagepanel2[0][7]
				.setImage(blue[1] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_QUEEN));
		imagepanel2[0][4]
				.setImage(blue[2] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_KNIGHT));
		imagepanel2[0][9]
				.setImage(blue[3] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_KNIGHT));
		imagepanel2[0][5]
				.setImage(blue[4] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_BISHOP));
		imagepanel2[0][8]
				.setImage(blue[5] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_BISHOP));
		imagepanel2[0][3]
				.setImage(blue[6] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_LOOK));
		imagepanel2[0][10]
				.setImage(blue[7] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_LOOK));
		for (int i = 3; i < 11; i++) {
			imagepanel2[1][i].setImage(
					blue[i + 5] = ChessPieceSprite.getInstace().getChessPiece(ChessPieceSpriteType.BLUE_PAWN));
		}
	}

	public void set_Style2() {

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 14; j++) {
				if ((i <= 2 && j <= 2) || (i <= 2 && j > 10) || (i > 10 && j <= 2) || (i > 10 && j > 10)) {
				} else {
					screen2.add(imagepanel2[i][j] = new ImagePanel());
					imagepanel2[i][j].setVisible(true);
					imagepanel2[i][j].setSize(70, 70);
					imagepanel2[i][j].setLocation((70 * i) + 470, (70 * j) + 30);
					if ((i + j) % 2 == 0) {
						imagepanel2[i][j].setBackground(Color.white);
					} else {
						imagepanel2[i][j].setBackground(Game.Purple);
					}
					imagepanel2[i][j].setBorder(BorderFactory.createLineBorder(new Color(194, 124, 211), 1));
					imagepanel2[i][j].setOpaque(true);
					imagepanel2[i][j].addMouseListener(new MouseClick2());
				}
			}
		}

		// 전체 패널 세팅
		screen2.add(fullpanel2);
		fullpanel2.setLayout(null);
		fullpanel2.setSize(1920, 1800);
		fullpanel2.setLocation(0, 0);
		fullpanel2.setBackground(new Color(250, 245, 247));

		// 죽은 말
		fullpanel2.add(diegreen);
		fullpanel2.add(diepurple);
		fullpanel2.add(dieorange);
		fullpanel2.add(dieblue);
		diegreen.setSize(400, 400);
		diepurple.setSize(400, 400);
		dieorange.setSize(400, 400);
		dieblue.setSize(400, 400);
		diegreen.setLocation(30, 40);
		diepurple.setLocation(1480, 40);
		dieorange.setLocation(30, 600);
		dieblue.setLocation(1480, 600);
		diegreen.setLayout(new GridLayout(5, 4));
		for (int i = 0; i < 20; i++) {
			diepiece[0][i] = new ImagePanel();
			dieorange.add(diepiece[0][i]);
		}
		diepurple.setLayout(new GridLayout(5, 4));
		for (int i = 0; i < 20; i++) {
			diepiece[1][i] = new ImagePanel();
			dieblue.add(diepiece[1][i]);
		}
		dieorange.setLayout(new GridLayout(5, 4));
		for (int i = 0; i < 20; i++) {
			diepiece[2][i] = new ImagePanel();
			diegreen.add(diepiece[2][i]);
		}
		dieblue.setLayout(new GridLayout(5, 4));
		for (int i = 0; i < 20; i++) {
			diepiece[3][i] = new ImagePanel();
			diepurple.add(diepiece[3][i]);
		}

		BufferedImage[] img = new BufferedImage[4];
		try {
			img[0] = ImageIO.read(new File("green.png"));
			img[1] = ImageIO.read(new File("purple.png"));
			img[2] = ImageIO.read(new File("orange.png"));
			img[3] = ImageIO.read(new File("blue.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		diegreen.setImage(img[0]);
		diepurple.setImage(img[1]);
		dieorange.setImage(img[2]);
		dieblue.setImage(img[3]);

		// 팀1
		JLabel teamword = new JLabel("TEAM 1", JLabel.CENTER);
		teamword.setSize(400, 40);
		teamword.setLocation(30, 500);
		fullpanel2.add(teamword);
		teamword.setFont(new Font("휴먼고딕", Font.BOLD, 50));
		teamword.setForeground(new Color(194, 124, 211));
		teamword.setOpaque(false);

		// 팀2
		JLabel teamword2 = new JLabel("TEAM 2", JLabel.CENTER);
		teamword2.setSize(400, 40);
		teamword2.setLocation(1480, 500);
		fullpanel2.add(teamword2);
		teamword2.setFont(new Font("휴먼고딕", Font.BOLD, 50));
		teamword2.setForeground(new Color(194, 124, 211));
		teamword2.setOpaque(false);

		/*
		 * //턴 라벨 셋팅 fullpanel.add(turn_label); turn_label.setFont(new
		 * Font("휴먼고딕",Font.BOLD, 40)); turn_label.setSize(500, 60);
		 * turn_label.setLocation(925, 40); turn_label.setForeground(new Color(213, 165,
		 * 226)); turn_label.setBackground(Color.WHITE);
		 * turn_label.setBorder(BorderFactory.createLineBorder((new
		 * Color(232,190,248)),4)); turn_label.setOpaque(false);
		 */
	}

	public static void changeImagePanel2(int fromX, int fromY, int toX, int toY) {

		BufferedImage tempimg = imagepanel2[fromX][fromY].getImage();
		imagepanel2[toX][toY].setImage(tempimg);
		imagepanel2[fromX][fromY].setImage(null);
		if ((fromX + fromY) % 2 == 0) {
			imagepanel2[fromX][fromY].setBackground(Color.WHITE);
		} else {
			imagepanel2[fromX][fromY].setBackground(Game.Purple);
		}
	}

	// 각 말 객체들 좌표값 바꾸기
	public static void change_pieceXY2(int fromX, int fromY, int toX, int toY) {

		for (int i = 0; i < 4; i++) {
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
	public static boolean existImage2(int x, int y) {
		if (imagepanel2[x][y].getImage() == null)
			return false;
		else
			return true;
	}

	// color가 뭔지 확인
	// color이름 문자열 반환
	public static String colorImage2(int x, int y) {

		BufferedImage img = imagepanel2[x][y].getImage();
		for (int i = 0; i < 15; i++) {
			if (img == green[i])
				return "green";
			else if (img == purple[i])
				return "purple";
			else if (img == orange[i])
				return "orange";
			else if (img == blue[i])
				return "blue";
		}
		return null;
	}

	// 판 색 바꿔주는 메소드
	public static void change_background2(String color, int x, int y) {

		if (color == "Yellow") {
			imagepanel2[x][y].setBackground(Game.Yellow);
		}

		else if (color == "Skyblue") {
			imagepanel2[x][y].setBackground(Game.Skyblue);
		}

		else if (color == "Pink") {
			imagepanel2[x][y].setBackground(Game.Pink);
		}

		else if (color == "White") {
			imagepanel2[x][y].setBackground(Color.white);
		}

		else if (color == "Purple") {
			imagepanel2[x][y].setBackground(Game.Purple);
		}

	}

	// 노란색 타일이면 원상복귀해주는 메소드
	public static void reset_background2() {
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 14; j++) {
				if ((i <= 2 && j <= 2) || (i <= 2 && j > 10) || (i > 10 && j <= 2) || (i > 10 && j > 10)) {
				} else {
					if (imagepanel2[i][j].getBackground() == Game.Yellow
							|| imagepanel2[i][j].getBackground() == Game.Pink) {
						if ((i + j) % 2 == 0) {
							imagepanel2[i][j].setBackground(Color.white);
						} else {
							imagepanel2[i][j].setBackground(Game.Purple);
						}
					}
				}
			}
		}
	}

	// 죽은 말 옮기고 체스판에서 이미지 지우는 메소드
	public static void move_diepiece2(int x, int y) {
		// x, y에 죽은 말 좌표 입력
		// i는 번호 8-23까지

		BufferedImage tempimg = imagepanel2[x][y].getImage();
		ImagePanel temp = new ImagePanel();

		if (colorImage2(x, y) == "orange") {			
			diepiece[0][dieorangenum].setImage(tempimg);
			imagepanel2[x][y].setImage(null);
			diepiece[0][dieorangenum].repaint();
			dieorangenum++;
		}
		else if (colorImage2(x, y) == "blue") {
			imagepanel2[x][y].setImage(null);
			diepiece[1][diebluenum].setImage(tempimg);
			diepiece[1][diebluenum].repaint();
			diebluenum++;
		}

		else if (colorImage2(x, y) == "green") {
			imagepanel2[x][y].setImage(null);
			diepiece[2][diegreennum].setImage(tempimg);
			diepiece[2][diegreennum].repaint();
			diegreennum++;
		}

		else if (colorImage2(x, y) == "purple") {	
			imagepanel2[x][y].setImage(null);
			diepiece[3][diepurplenum].setImage(tempimg);
			diepiece[3][diepurplenum].repaint();
			diepurplenum++;
		}
	}

	public static String get_Whatpiece2(int x, int y) {

		// 오렌지
		if (player_piece.player[0].king.getX() == x && player_piece.player[0].king.getY() == y) {
			return "OrangeKing";
		}
		if (player_piece.player[0].queen.getX() == x && player_piece.player[0].queen.getY() == y) {
			return "OrangeQueen";
		}
		if (player_piece.player[0].knight[0].getX() == x && player_piece.player[0].knight[0].getY() == y) {
			return "OrangeKnight0";
		}
		if (player_piece.player[0].knight[1].getX() == x && player_piece.player[0].knight[1].getY() == y) {
			return "OrangeKnight1";
		}
		if (player_piece.player[0].bishop[0].getX() == x && player_piece.player[0].bishop[0].getY() == y) {
			return "OrangeBishop0";
		}
		if (player_piece.player[0].bishop[1].getX() == x && player_piece.player[0].bishop[1].getY() == y) {
			return "OrangeBishop1";
		}
		if (player_piece.player[0].rook[0].getX() == x && player_piece.player[0].rook[0].getY() == y) {
			return "OrangeRook0";
		}
		if (player_piece.player[0].rook[1].getX() == x && player_piece.player[0].rook[1].getY() == y) {
			return "OrangeRook1";
		}
		if (player_piece.player[0].pawn[0].getX() == x && player_piece.player[0].pawn[0].getY() == y) {
			return "OrangePawn0";
		}
		if (player_piece.player[0].pawn[1].getX() == x && player_piece.player[0].pawn[1].getY() == y) {
			return "OrangePawn1";
		}
		if (player_piece.player[0].pawn[2].getX() == x && player_piece.player[0].pawn[2].getY() == y) {
			return "OrangePawn2";
		}
		if (player_piece.player[0].pawn[3].getX() == x && player_piece.player[0].pawn[3].getY() == y) {
			return "OrangePawn3";
		}
		if (player_piece.player[0].pawn[4].getX() == x && player_piece.player[0].pawn[4].getY() == y) {
			return "OrangePawn4";
		}
		if (player_piece.player[0].pawn[5].getX() == x && player_piece.player[0].pawn[5].getY() == y) {
			return "OrangePawn5";
		}
		if (player_piece.player[0].pawn[6].getX() == x && player_piece.player[0].pawn[6].getY() == y) {
			return "OrangePawn6";
		}
		if (player_piece.player[0].pawn[7].getX() == x && player_piece.player[0].pawn[7].getY() == y) {
			return "OrangePawn7";
		}

		// 블루
		if (player_piece.player[1].king.getX() == x && player_piece.player[1].king.getY() == y) {
			return "BlueKing";
		}
		if (player_piece.player[1].queen.getX() == x && player_piece.player[1].queen.getY() == y) {
			return "BlueQueen";
		}
		if (player_piece.player[1].knight[0].getX() == x && player_piece.player[1].knight[0].getY() == y) {
			return "BlueKnight0";
		}
		if (player_piece.player[1].knight[1].getX() == x && player_piece.player[1].knight[1].getY() == y) {
			return "BlueKnight1";
		}
		if (player_piece.player[1].bishop[0].getX() == x && player_piece.player[1].bishop[0].getY() == y) {
			return "BlueBishop0";
		}
		if (player_piece.player[1].bishop[1].getX() == x && player_piece.player[1].bishop[1].getY() == y) {
			return "BlueBishop1";
		}
		if (player_piece.player[1].rook[0].getX() == x && player_piece.player[1].rook[0].getY() == y) {
			return "BlueRook0";
		}
		if (player_piece.player[1].rook[1].getX() == x && player_piece.player[1].rook[1].getY() == y) {
			return "BlueRook1";
		}
		if (player_piece.player[1].pawn[0].getX() == x && player_piece.player[1].pawn[0].getY() == y) {
			return "BluePawn0";
		}
		if (player_piece.player[1].pawn[1].getX() == x && player_piece.player[1].pawn[1].getY() == y) {
			return "BluePawn1";
		}
		if (player_piece.player[1].pawn[2].getX() == x && player_piece.player[1].pawn[2].getY() == y) {
			return "BluePawn2";
		}
		if (player_piece.player[1].pawn[3].getX() == x && player_piece.player[1].pawn[3].getY() == y) {
			return "BluePawn3";
		}
		if (player_piece.player[1].pawn[4].getX() == x && player_piece.player[1].pawn[4].getY() == y) {
			return "BluePawn4";
		}
		if (player_piece.player[1].pawn[5].getX() == x && player_piece.player[1].pawn[5].getY() == y) {
			return "BluePawn5";
		}
		if (player_piece.player[1].pawn[6].getX() == x && player_piece.player[1].pawn[6].getY() == y) {
			return "BluePawn6";
		}
		if (player_piece.player[1].pawn[7].getX() == x && player_piece.player[1].pawn[7].getY() == y) {
			return "BluePawn7";
		}

		// 그린
		if (player_piece.player[2].king.getX() == x && player_piece.player[2].king.getY() == y) {
			return "GreenKing";
		}
		if (player_piece.player[2].queen.getX() == x && player_piece.player[2].queen.getY() == y) {
			return "GreenQueen";
		}
		if (player_piece.player[2].knight[0].getX() == x && player_piece.player[2].knight[0].getY() == y) {
			return "GreenKnight0";
		}
		if (player_piece.player[2].knight[1].getX() == x && player_piece.player[2].knight[1].getY() == y) {
			return "GreenKnight1";
		}
		if (player_piece.player[2].bishop[0].getX() == x && player_piece.player[2].bishop[0].getY() == y) {
			return "GreenBishop0";
		}
		if (player_piece.player[2].bishop[1].getX() == x && player_piece.player[2].bishop[1].getY() == y) {
			return "GreenBishop1";
		}
		if (player_piece.player[2].rook[0].getX() == x && player_piece.player[2].rook[0].getY() == y) {
			return "GreenRook0";
		}
		if (player_piece.player[2].rook[1].getX() == x && player_piece.player[2].rook[1].getY() == y) {
			return "GreenRook1";
		}
		if (player_piece.player[2].pawn[0].getX() == x && player_piece.player[2].pawn[0].getY() == y) {
			return "GreenPawn0";
		}
		if (player_piece.player[2].pawn[1].getX() == x && player_piece.player[2].pawn[1].getY() == y) {
			return "GreenPawn1";
		}
		if (player_piece.player[2].pawn[2].getX() == x && player_piece.player[2].pawn[2].getY() == y) {
			return "GreenPawn2";
		}
		if (player_piece.player[2].pawn[3].getX() == x && player_piece.player[2].pawn[3].getY() == y) {
			return "GreenPawn3";
		}
		if (player_piece.player[2].pawn[4].getX() == x && player_piece.player[2].pawn[4].getY() == y) {
			return "GreenPawn4";
		}
		if (player_piece.player[2].pawn[5].getX() == x && player_piece.player[2].pawn[5].getY() == y) {
			return "GreenPawn5";
		}
		if (player_piece.player[2].pawn[6].getX() == x && player_piece.player[2].pawn[6].getY() == y) {
			return "GreenPawn6";
		}
		if (player_piece.player[2].pawn[7].getX() == x && player_piece.player[2].pawn[7].getY() == y) {
			return "GreenPawn7";
		}

		// 보라
		if (player_piece.player[3].king.getX() == x && player_piece.player[3].king.getY() == y) {
			return "PurpleKing";
		}
		if (player_piece.player[3].queen.getX() == x && player_piece.player[3].queen.getY() == y) {
			return "PurpleQueen";
		}
		if (player_piece.player[3].knight[0].getX() == x && player_piece.player[3].knight[0].getY() == y) {
			return "PurpleKnight0";
		}
		if (player_piece.player[3].knight[1].getX() == x && player_piece.player[3].knight[1].getY() == y) {
			return "PurpleKnight1";
		}
		if (player_piece.player[3].bishop[0].getX() == x && player_piece.player[3].bishop[0].getY() == y) {
			return "PurpleBishop0";
		}
		if (player_piece.player[3].bishop[1].getX() == x && player_piece.player[3].bishop[1].getY() == y) {
			return "PurpleBishop1";
		}
		if (player_piece.player[3].rook[0].getX() == x && player_piece.player[3].rook[0].getY() == y) {
			return "PurpleRook0";
		}
		if (player_piece.player[3].rook[1].getX() == x && player_piece.player[3].rook[1].getY() == y) {
			return "PurpleRook1";
		}
		if (player_piece.player[3].pawn[0].getX() == x && player_piece.player[3].pawn[0].getY() == y) {
			return "PurplePawn0";
		}
		if (player_piece.player[3].pawn[1].getX() == x && player_piece.player[3].pawn[1].getY() == y) {
			return "PurplePawn1";
		}
		if (player_piece.player[3].pawn[2].getX() == x && player_piece.player[3].pawn[2].getY() == y) {
			return "PurplePawn2";
		}
		if (player_piece.player[3].pawn[3].getX() == x && player_piece.player[3].pawn[3].getY() == y) {
			return "PurplePawn3";
		}
		if (player_piece.player[3].pawn[4].getX() == x && player_piece.player[3].pawn[4].getY() == y) {
			return "PurplePawn4";
		}
		if (player_piece.player[3].pawn[5].getX() == x && player_piece.player[3].pawn[5].getY() == y) {
			return "PurplePawn5";
		}
		if (player_piece.player[3].pawn[6].getX() == x && player_piece.player[3].pawn[6].getY() == y) {
			return "PurplePawn6";
		}
		if (player_piece.player[3].pawn[7].getX() == x && player_piece.player[3].pawn[7].getY() == y) {
			return "PurplePawn7";
		}

		return "";
	}

	public static void change_valid2(int x, int y) {

		String piece = get_Whatpiece2(x, y);
		change_pieceXY2(x, y, -1, -1);

		if (piece == "OrangeKing") {
			player_piece.player[0].king.valid = false;
		}
		if (piece == "OrangeQueen") {
			player_piece.player[0].queen.valid = false;
		}
		if (piece == "OrangeKnight0") {
			player_piece.player[0].knight[0].valid = false;
		}
		if (piece == "OrangeKnight1") {
			player_piece.player[0].knight[1].valid = false;
		}
		if (piece == "OrangeBishop0") {
			player_piece.player[0].bishop[0].valid = false;
		}
		if (piece == "OrangeBishop1") {
			player_piece.player[0].bishop[1].valid = false;
		}
		if (piece == "OrangeRook0") {
			player_piece.player[0].rook[0].valid = false;
		}
		if (piece == "OrangeRook0") {
			player_piece.player[0].rook[1].valid = false;
		}
		if (piece == "OrangePawn0") {
			player_piece.player[0].pawn[0].valid = false;
		}
		if (piece == "OrangePawn1") {
			player_piece.player[0].pawn[1].valid = false;
		}
		if (piece == "OrangePawn2") {
			player_piece.player[0].pawn[2].valid = false;
		}
		if (piece == "OrangePawn3") {
			player_piece.player[0].pawn[3].valid = false;
		}
		if (piece == "OrangePawn4") {
			player_piece.player[0].pawn[4].valid = false;
		}
		if (piece == "OrangePawn5") {
			player_piece.player[0].pawn[5].valid = false;
		}
		if (piece == "OrangePawn6") {
			player_piece.player[0].pawn[6].valid = false;
		}
		if (piece == "OrangePawn7") {
			player_piece.player[0].pawn[7].valid = false;
		}

		// blue
		if (piece == "BlueKing") {
			player_piece.player[1].king.valid = false;
		}
		if (piece == "BlueQueen") {
			player_piece.player[1].queen.valid = false;
		}
		if (piece == "BlueKnight0") {
			player_piece.player[1].knight[0].valid = false;
		}
		if (piece == "BlueKnight1") {
			player_piece.player[1].knight[1].valid = false;
		}
		if (piece == "BlueBishop0") {
			player_piece.player[1].bishop[0].valid = false;
		}
		if (piece == "BlueBishop1") {
			player_piece.player[1].bishop[1].valid = false;
		}
		if (piece == "BlueRook0") {
			player_piece.player[1].rook[0].valid = false;
		}
		if (piece == "BlueRook0") {
			player_piece.player[1].rook[1].valid = false;
		}
		if (piece == "BluePawn0") {
			player_piece.player[1].pawn[0].valid = false;
		}
		if (piece == "BluePawn1") {
			player_piece.player[1].pawn[1].valid = false;
		}
		if (piece == "BluePawn2") {
			player_piece.player[1].pawn[2].valid = false;
		}
		if (piece == "BluePawn3") {
			player_piece.player[1].pawn[3].valid = false;
		}
		if (piece == "BluePawn4") {
			player_piece.player[1].pawn[4].valid = false;
		}
		if (piece == "BluePawn5") {
			player_piece.player[1].pawn[5].valid = false;
		}
		if (piece == "BluePawn6") {
			player_piece.player[1].pawn[6].valid = false;
		}
		if (piece == "BluePawn7") {
			player_piece.player[1].pawn[7].valid = false;
		}

		// Green
		if (piece == "GreenKing") {
			player_piece.player[2].king.valid = false;
		}
		if (piece == "GreenQueen") {
			player_piece.player[2].queen.valid = false;
		}
		if (piece == "GreenKnight0") {
			player_piece.player[2].knight[0].valid = false;
		}
		if (piece == "GreenKnight1") {
			player_piece.player[2].knight[1].valid = false;
		}
		if (piece == "GreenBishop0") {
			player_piece.player[2].bishop[0].valid = false;
		}
		if (piece == "GreenBishop1") {
			player_piece.player[2].bishop[1].valid = false;
		}
		if (piece == "GreenRook0") {
			player_piece.player[2].rook[0].valid = false;
		}
		if (piece == "GreenRook0") {
			player_piece.player[2].rook[1].valid = false;
		}
		if (piece == "GreenPawn0") {
			player_piece.player[2].pawn[0].valid = false;
		}
		if (piece == "GreenPawn1") {
			player_piece.player[2].pawn[1].valid = false;
		}
		if (piece == "GreenPawn2") {
			player_piece.player[2].pawn[2].valid = false;
		}
		if (piece == "GreenPawn3") {
			player_piece.player[2].pawn[3].valid = false;
		}
		if (piece == "GreenPawn4") {
			player_piece.player[2].pawn[4].valid = false;
		}
		if (piece == "GreenPawn5") {
			player_piece.player[2].pawn[5].valid = false;
		}
		if (piece == "GreenPawn6") {
			player_piece.player[2].pawn[6].valid = false;
		}
		if (piece == "GreenPawn7") {
			player_piece.player[2].pawn[7].valid = false;
		}

		// Purple
		if (piece == "PurpleKing") {
			player_piece.player[3].king.valid = false;
		}
		if (piece == "PurpleQueen") {
			player_piece.player[3].queen.valid = false;
		}
		if (piece == "PurpleKnight0") {
			player_piece.player[3].knight[0].valid = false;
		}
		if (piece == "PurpleKnight1") {
			player_piece.player[3].knight[1].valid = false;
		}
		if (piece == "PurpleBishop0") {
			player_piece.player[3].bishop[0].valid = false;
		}
		if (piece == "PurpleBishop1") {
			player_piece.player[3].bishop[1].valid = false;
		}
		if (piece == "PurpleRook0") {
			player_piece.player[3].rook[0].valid = false;
		}
		if (piece == "PurpleRook0") {
			player_piece.player[3].rook[1].valid = false;
		}
		if (piece == "PurplePawn0") {
			player_piece.player[3].pawn[0].valid = false;
		}
		if (piece == "PurplePawn1") {
			player_piece.player[3].pawn[1].valid = false;
		}
		if (piece == "PurplePawn2") {
			player_piece.player[3].pawn[2].valid = false;
		}
		if (piece == "PurplePawn3") {
			player_piece.player[3].pawn[3].valid = false;
		}
		if (piece == "PurplePawn4") {
			player_piece.player[3].pawn[4].valid = false;
		}
		if (piece == "PurplePawn5") {
			player_piece.player[3].pawn[5].valid = false;
		}
		if (piece == "PurplePawn6") {
			player_piece.player[3].pawn[6].valid = false;
		}
		if (piece == "PurplePawn7") {
			player_piece.player[3].pawn[7].valid = false;
		}

	}
}
