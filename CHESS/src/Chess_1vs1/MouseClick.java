package Chess_1vs1;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;

import GameScreen.ImagePanel;
import Piece_each.*;

public class MouseClick implements MouseListener {

	// Click이 false이면 한번도 클릭 X, true이면 한번 클릭
	static String temp;
	static int i;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		ImagePanel ip = (ImagePanel) e.getSource();

		int x = (ip.getX() - 50) / 100, y = (ip.getY() - 50) / 100;
		Color ipcolor = ip.getBackground();
		
		// WHITE TEAM TURN
		if (Game.turn == false) {
			Game.reset_background();
			if (Game.Click == false) { // Click이 첫번째일때(말을 눌러야함)
				if (Game.get_Whatpiece(x, y) == "WhiteKing") {
					if (Game.player_piece.player[0].king.valid == true) {
						temp = "WhiteKing";
						Game.Click = true;
						Game.player_piece.player[0].king.validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteQueen") {
					if (Game.player_piece.player[0].queen.valid == true) {
						temp = "WhiteQueen";
						Game.Click = true;
						Game.player_piece.player[0].queen.validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteKnight0") {
					if (Game.player_piece.player[0].knight[0].valid == true) {
						temp = "WhiteKnight0";
						Game.Click = true;
						Game.player_piece.player[0].knight[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteKnight1") {
					if (Game.player_piece.player[0].knight[1].valid == true) {
						temp = "WhiteKnight1";
						Game.Click = true;
						Game.player_piece.player[0].knight[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteBishop0") {
					if (Game.player_piece.player[0].bishop[0].valid == true) {
						temp = "WhiteBishop0";
						Game.Click = true;
						Game.player_piece.player[0].bishop[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteBishop1") {
					if (Game.player_piece.player[0].bishop[1].valid == true) {
						temp = "WhiteBishop1";
						Game.Click = true;
						Game.player_piece.player[0].bishop[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteRook0") {
					if (Game.player_piece.player[0].rook[0].valid == true) {
						temp = "WhiteRook0";
						Game.Click = true;
						Game.player_piece.player[0].rook[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhiteRook1") {
					if (Game.player_piece.player[0].rook[1].valid == true) {
						temp = "WhiteRook1";
						Game.Click = true;
						Game.player_piece.player[0].rook[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn0") {
					if (Game.player_piece.player[0].pawn[0].valid == true) {
						temp = "WhitePawn0";
						Game.Click = true;
						Game.player_piece.player[0].pawn[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn1") {
					if (Game.player_piece.player[0].pawn[1].valid == true) {
						temp = "WhitePawn1";
						Game.Click = true;
						Game.player_piece.player[0].pawn[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn2") {
					if (Game.player_piece.player[0].pawn[2].valid == true) {
						temp = "WhitePawn2";
						Game.Click = true;
						Game.player_piece.player[0].pawn[2].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn3") {
					if (Game.player_piece.player[0].pawn[3].valid == true) {
						temp = "WhitePawn3";
						Game.Click = true;
						Game.player_piece.player[0].pawn[3].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn4") {
					if (Game.player_piece.player[0].pawn[4].valid == true) {
						temp = "WhitePawn4";
						Game.Click = true;
						Game.player_piece.player[0].pawn[4].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn5") {
					if (Game.player_piece.player[0].pawn[5].valid == true) {
						temp = "WhitePawn5";
						Game.Click = true;
						Game.player_piece.player[0].pawn[5].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn6") {
					if (Game.player_piece.player[0].pawn[6].valid == true) {
						temp = "WhitePawn6";
						Game.Click = true;
						Game.player_piece.player[0].pawn[6].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "WhitePawn7") {
					if (Game.player_piece.player[0].pawn[7].valid == true) {
						temp = "WhitePawn7";
						Game.Click = true;
						Game.player_piece.player[0].pawn[7].validMove(false);
					}
				}
			}

			else { // Click이 두번째일때(노란색칸을 눌러야함)
				if (temp == "WhiteKing") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].king.getX(),
									Game.player_piece.player[0].king.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].king.getX(),
									Game.player_piece.player[0].king.getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].king.getX(),
									Game.player_piece.player[0].king.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].king.getX(),
									Game.player_piece.player[0].king.getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteQueen") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].queen.getX(),
									Game.player_piece.player[0].queen.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].queen.getX(),
									Game.player_piece.player[0].queen.getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].queen.getX(),
									Game.player_piece.player[0].queen.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].queen.getX(),
									Game.player_piece.player[0].queen.getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteKnight0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].knight[0].getX(),
									Game.player_piece.player[0].knight[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].knight[0].getX(),
									Game.player_piece.player[0].knight[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].knight[0].getX(),
									Game.player_piece.player[0].knight[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].knight[0].getX(),
									Game.player_piece.player[0].knight[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteKnight1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].knight[1].getX(),
									Game.player_piece.player[0].knight[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].knight[1].getX(),
									Game.player_piece.player[0].knight[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].knight[1].getX(),
									Game.player_piece.player[0].knight[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].knight[1].getX(),
									Game.player_piece.player[0].knight[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteBishop0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].bishop[0].getX(),
									Game.player_piece.player[0].bishop[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].bishop[0].getX(),
									Game.player_piece.player[0].bishop[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].bishop[0].getX(),
									Game.player_piece.player[0].bishop[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].bishop[0].getX(),
									Game.player_piece.player[0].bishop[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteBishop1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].bishop[1].getX(),
									Game.player_piece.player[0].bishop[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].bishop[1].getX(),
									Game.player_piece.player[0].bishop[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].bishop[1].getX(),
									Game.player_piece.player[0].bishop[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].bishop[1].getX(),
									Game.player_piece.player[0].bishop[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteRook0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].rook[0].getX(),
									Game.player_piece.player[0].rook[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].rook[0].getX(),
									Game.player_piece.player[0].rook[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].rook[0].getX(),
									Game.player_piece.player[0].rook[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].rook[0].getX(),
									Game.player_piece.player[0].rook[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhiteRook1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].rook[1].getX(),
									Game.player_piece.player[0].rook[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].rook[1].getX(),
									Game.player_piece.player[0].rook[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].rook[1].getX(),
									Game.player_piece.player[0].rook[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].rook[1].getX(),
									Game.player_piece.player[0].rook[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[0].getX(),
									Game.player_piece.player[0].pawn[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[0].getX(),
									Game.player_piece.player[0].pawn[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[0].getX(),
									Game.player_piece.player[0].pawn[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[0].getX(),
									Game.player_piece.player[0].pawn[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[1].getX(),
									Game.player_piece.player[0].pawn[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[1].getX(),
									Game.player_piece.player[0].pawn[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[1].getX(),
									Game.player_piece.player[0].pawn[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[1].getX(),
									Game.player_piece.player[0].pawn[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn2") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[2].getX(),
									Game.player_piece.player[0].pawn[2].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[2].getX(),
									Game.player_piece.player[0].pawn[2].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[2].getX(),
									Game.player_piece.player[0].pawn[2].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[2].getX(),
									Game.player_piece.player[0].pawn[2].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn3") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[3].getX(),
									Game.player_piece.player[0].pawn[3].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[3].getX(),
									Game.player_piece.player[0].pawn[3].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[3].getX(),
									Game.player_piece.player[0].pawn[3].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[3].getX(),
									Game.player_piece.player[0].pawn[3].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn4") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[4].getX(),
									Game.player_piece.player[0].pawn[4].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[4].getX(),
									Game.player_piece.player[0].pawn[4].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[4].getX(),
									Game.player_piece.player[0].pawn[4].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[4].getX(),
									Game.player_piece.player[0].pawn[4].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn5") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[5].getX(),
									Game.player_piece.player[0].pawn[5].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[5].getX(),
									Game.player_piece.player[0].pawn[5].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[5].getX(),
									Game.player_piece.player[0].pawn[5].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[5].getX(),
									Game.player_piece.player[0].pawn[5].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn6") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[6].getX(),
									Game.player_piece.player[0].pawn[6].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[6].getX(),
									Game.player_piece.player[0].pawn[6].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[6].getX(),
									Game.player_piece.player[0].pawn[6].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[6].getX(),
									Game.player_piece.player[0].pawn[6].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

				else if (temp == "WhitePawn7") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[0].pawn[7].getX(),
									Game.player_piece.player[0].pawn[7].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[7].getX(),
									Game.player_piece.player[0].pawn[7].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.dieblacknum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[0].pawn[7].getX(),
									Game.player_piece.player[0].pawn[7].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[0].pawn[7].getX(),
									Game.player_piece.player[0].pawn[7].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = true;
					}
					Game.Click = false;
				}

			}
		}

		// BLACK TURN
		else if (Game.turn == true) {
			Game.reset_background();
			if (Game.Click == false) { // Click이 첫번째일때(말을 눌러야함)
				if (Game.get_Whatpiece(x, y) == "BlackKing") {
					if (Game.player_piece.player[1].king.valid == true) {
						temp = "BlackKing";
						Game.Click = true;
						Game.player_piece.player[1].king.validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackQueen") {
					if (Game.player_piece.player[1].queen.valid == true) {
						temp = "BlackQueen";
						Game.Click = true;
						Game.player_piece.player[1].queen.validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackKnight0") {
					if (Game.player_piece.player[1].knight[0].valid == true) {
						temp = "BlackKnight0";
						Game.Click = true;
						Game.player_piece.player[1].knight[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackKnight1") {
					if (Game.player_piece.player[1].knight[1].valid == true) {
						temp = "BlackKnight1";
						Game.Click = true;
						Game.player_piece.player[1].knight[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackBishop0") {
					if (Game.player_piece.player[1].bishop[0].valid == true) {
						temp = "BlackBishop0";
						Game.Click = true;
						Game.player_piece.player[1].bishop[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackBishop1") {
					if (Game.player_piece.player[1].bishop[1].valid == true) {
						temp = "BlackBishop1";
						Game.Click = true;
						Game.player_piece.player[1].bishop[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackRook0") {
					if (Game.player_piece.player[1].rook[0].valid == true) {
						temp = "BlackRook0";
						Game.Click = true;
						Game.player_piece.player[1].rook[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackRook1") {
					if (Game.player_piece.player[1].rook[1].valid == true) {
						temp = "BlackRook1";
						Game.Click = true;
						Game.player_piece.player[1].rook[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn0") {
					if (Game.player_piece.player[1].pawn[0].valid == true) {
						temp = "BlackPawn0";
						Game.Click = true;
						Game.player_piece.player[1].pawn[0].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn1") {
					if (Game.player_piece.player[1].pawn[1].valid == true) {
						temp = "BlackPawn1";
						Game.Click = true;
						Game.player_piece.player[1].pawn[1].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn2") {
					if (Game.player_piece.player[1].pawn[2].valid == true) {
						temp = "BlackPawn2";
						Game.Click = true;
						Game.player_piece.player[1].pawn[2].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn3") {
					if (Game.player_piece.player[1].pawn[3].valid == true) {
						temp = "BlackPawn3";
						Game.Click = true;
						Game.player_piece.player[1].pawn[3].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn4") {
					if (Game.player_piece.player[1].pawn[4].valid == true) {
						temp = "BlackPawn4";
						Game.Click = true;
						Game.player_piece.player[1].pawn[4].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn5") {
					if (Game.player_piece.player[1].pawn[5].valid == true) {
						temp = "BlackPawn5";
						Game.Click = true;
						Game.player_piece.player[1].pawn[5].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn6") {
					if (Game.player_piece.player[1].pawn[6].valid == true) {
						temp = "BlackPawn6";
						Game.Click = true;
						Game.player_piece.player[1].pawn[6].validMove(false);
					}
				} else if (Game.get_Whatpiece(x, y) == "BlackPawn7") {
					if (Game.player_piece.player[1].pawn[7].valid == true) {
						temp = "BlackPawn7";
						Game.Click = true;
						Game.player_piece.player[1].pawn[7].validMove(false);
					}
				}
			}

			else { // Click이 두번째일때(노란색칸을 눌러야함)
				if (temp == "BlackKing") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].king.getX(),
									Game.player_piece.player[1].king.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].king.getX(),
									Game.player_piece.player[1].king.getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].king.getX(),
									Game.player_piece.player[1].king.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].king.getX(),
									Game.player_piece.player[1].king.getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackQueen") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].queen.getX(),
									Game.player_piece.player[1].queen.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].queen.getX(),
									Game.player_piece.player[1].queen.getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].queen.getX(),
									Game.player_piece.player[1].queen.getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].queen.getX(),
									Game.player_piece.player[1].queen.getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackKnight0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].knight[0].getX(),
									Game.player_piece.player[1].knight[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].knight[0].getX(),
									Game.player_piece.player[1].knight[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].knight[0].getX(),
									Game.player_piece.player[1].knight[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].knight[0].getX(),
									Game.player_piece.player[1].knight[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackKnight1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].knight[1].getX(),
									Game.player_piece.player[1].knight[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].knight[1].getX(),
									Game.player_piece.player[1].knight[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].knight[1].getX(),
									Game.player_piece.player[1].knight[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].knight[1].getX(),
									Game.player_piece.player[1].knight[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackBishop0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].bishop[0].getX(),
									Game.player_piece.player[1].bishop[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].bishop[0].getX(),
									Game.player_piece.player[1].bishop[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].bishop[0].getX(),
									Game.player_piece.player[1].bishop[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].bishop[0].getX(),
									Game.player_piece.player[1].bishop[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackBishop1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].bishop[1].getX(),
									Game.player_piece.player[1].bishop[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].bishop[1].getX(),
									Game.player_piece.player[1].bishop[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].bishop[1].getX(),
									Game.player_piece.player[1].bishop[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].bishop[1].getX(),
									Game.player_piece.player[1].bishop[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackRook0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].rook[0].getX(),
									Game.player_piece.player[1].rook[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].rook[0].getX(),
									Game.player_piece.player[1].rook[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].rook[0].getX(),
									Game.player_piece.player[1].rook[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].rook[0].getX(),
									Game.player_piece.player[1].rook[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackRook1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].rook[1].getX(),
									Game.player_piece.player[1].rook[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].rook[1].getX(),
									Game.player_piece.player[1].rook[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].rook[1].getX(),
									Game.player_piece.player[1].rook[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].rook[1].getX(),
									Game.player_piece.player[1].rook[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn0") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[0].getX(),
									Game.player_piece.player[1].pawn[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[0].getX(),
									Game.player_piece.player[1].pawn[0].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[0].getX(),
									Game.player_piece.player[1].pawn[0].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[0].getX(),
									Game.player_piece.player[1].pawn[0].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn1") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[1].getX(),
									Game.player_piece.player[1].pawn[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[1].getX(),
									Game.player_piece.player[1].pawn[1].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[1].getX(),
									Game.player_piece.player[1].pawn[1].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[1].getX(),
									Game.player_piece.player[1].pawn[1].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn2") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[2].getX(),
									Game.player_piece.player[1].pawn[2].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[2].getX(),
									Game.player_piece.player[1].pawn[2].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[2].getX(),
									Game.player_piece.player[1].pawn[2].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[2].getX(),
									Game.player_piece.player[1].pawn[2].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn3") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[3].getX(),
									Game.player_piece.player[1].pawn[3].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[3].getX(),
									Game.player_piece.player[1].pawn[3].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[3].getX(),
									Game.player_piece.player[1].pawn[3].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[3].getX(),
									Game.player_piece.player[1].pawn[3].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn4") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[4].getX(),
									Game.player_piece.player[1].pawn[4].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[4].getX(),
									Game.player_piece.player[1].pawn[4].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[4].getX(),
									Game.player_piece.player[1].pawn[4].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[4].getX(),
									Game.player_piece.player[1].pawn[4].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn5") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[5].getX(),
									Game.player_piece.player[1].pawn[5].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[5].getX(),
									Game.player_piece.player[1].pawn[5].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[5].getX(),
									Game.player_piece.player[1].pawn[5].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[5].getX(),
									Game.player_piece.player[1].pawn[5].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn6") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[6].getX(),
									Game.player_piece.player[1].pawn[6].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[6].getX(),
									Game.player_piece.player[1].pawn[6].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[6].getX(),
									Game.player_piece.player[1].pawn[6].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[6].getX(),
									Game.player_piece.player[1].pawn[6].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}

				else if (temp == "BlackPawn7") {
					if (ipcolor == Game.Yellow) {
						if (Game.existImage(x, y) == false) {
							Game.changeImagePanel(Game.player_piece.player[1].pawn[7].getX(),
									Game.player_piece.player[1].pawn[7].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[7].getX(),
									Game.player_piece.player[1].pawn[7].getY(), x, y);
						} else {
							Game.move_diepiece(x, y, Game.diewhitenum++);
							Game.change_valid(x, y);
							Game.changeImagePanel(Game.player_piece.player[1].pawn[7].getX(),
									Game.player_piece.player[1].pawn[7].getY(), x, y);
							Game.change_pieceXY(Game.player_piece.player[1].pawn[7].getX(),
									Game.player_piece.player[1].pawn[7].getY(), x, y);
						}
						GameManager.rule(Game.turn);
						Game.turn = false;
					}
					Game.Click = false;
				}
			}
		}
		
		if (Game.turn == false) {
			Game.turn_label.setText("''IT'S WHITE TURN''");
		} else {
			Game.turn_label.setText("''IT'S BLACK TURN''");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		ImagePanel imgpn = (ImagePanel) e.getSource();
		int x = (imgpn.getX() - 50) / 100;
		int y = (imgpn.getY() - 50) / 100;

		if (imgpn.getBackground() != Game.Yellow && imgpn.getBackground() != Game.Pink) {
			Game.change_background("Skyblue", x, y);
		} else {
			imgpn.setBorder(BorderFactory.createLineBorder(Game.Skyblue, 1));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ImagePanel imgpn = (ImagePanel) e.getSource();
		int x = (imgpn.getX() - 50) / 100;
		int y = (imgpn.getY() - 50) / 100;

		if (imgpn.getBackground() == Game.Skyblue) {
			if ((x + y) % 2 == 0)
				Game.change_background("White", x, y);
			else
				Game.change_background("Purple", x, y);
		} else {
			imgpn.setBorder(BorderFactory.createLineBorder(new Color(194, 124, 211), 1));
		}
	}

}
