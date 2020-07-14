package Chess_2vs2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;

import Chess_1vs1.Game;
import GameScreen.ImagePanel;

public class MouseClick2 implements MouseListener {

	static String temp;

	@Override
	public void mouseClicked(MouseEvent e) {

		ImagePanel ip = (ImagePanel) e.getSource();

		int x = (ip.getX() - 470) / 70, y = (ip.getY() - 30) / 70;
		Color ipcolor = ip.getBackground();

		// Orange TURN
		if (Game2.turn == 0) {
			Game2.reset_background2();
			if (Game2.Click == false) { // Click이 첫번째일때(말을 눌러야함)
				if (Game2.get_Whatpiece2(x, y) == "OrangeKing") {
					if (Game2.player_piece.player[0].king.valid == true) {
						temp = "OrangeKing";
						Game2.Click = true;
						Game2.player_piece.player[0].king.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeQueen") {
					if (Game2.player_piece.player[0].queen.valid == true) {
						temp = "OrangeQueen";
						Game2.Click = true;
						Game2.player_piece.player[0].queen.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeKnight0") {
					if (Game2.player_piece.player[0].knight[0].valid == true) {
						temp = "OrangeKnight0";
						Game2.Click = true;
						Game2.player_piece.player[0].knight[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeKnight1") {
					if (Game2.player_piece.player[0].knight[1].valid == true) {
						temp = "OrangeKnight1";
						Game2.Click = true;
						Game2.player_piece.player[0].knight[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeBishop0") {
					if (Game2.player_piece.player[0].bishop[0].valid == true) {
						temp = "OrangeBishop0";
						Game2.Click = true;
						Game2.player_piece.player[0].bishop[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeBishop1") {
					if (Game2.player_piece.player[0].bishop[1].valid == true) {
						temp = "OrangeBishop1";
						Game2.Click = true;
						Game2.player_piece.player[0].bishop[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeRook0") {
					if (Game2.player_piece.player[0].rook[0].valid == true) {
						temp = "OrangeRook0";
						Game2.Click = true;
						Game2.player_piece.player[0].rook[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangeRook1") {
					if (Game2.player_piece.player[0].rook[1].valid == true) {
						temp = "OrangeRook1";
						Game2.Click = true;
						Game2.player_piece.player[0].rook[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn0") {
					if (Game2.player_piece.player[0].pawn[0].valid == true) {
						temp = "OrangePawn0";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn1") {
					if (Game2.player_piece.player[0].pawn[1].valid == true) {
						temp = "OrangePawn1";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn2") {
					if (Game2.player_piece.player[0].pawn[2].valid == true) {
						temp = "OrangePawn2";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[2].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn3") {
					if (Game2.player_piece.player[0].pawn[3].valid == true) {
						temp = "OrangePawn3";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[3].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn4") {
					if (Game2.player_piece.player[0].pawn[4].valid == true) {
						temp = "OrangePawn4";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[4].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn5") {
					if (Game2.player_piece.player[0].pawn[5].valid == true) {
						temp = "OrangePawn5";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[5].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn6") {
					if (Game2.player_piece.player[0].pawn[6].valid == true) {
						temp = "OrangePawn6";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[6].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn7") {
					if (Game2.player_piece.player[0].pawn[7].valid == true) {
						temp = "OrangePawn7";
						Game2.Click = true;
						Game2.player_piece.player[0].pawn[7].validMove(false);
					}
				}
			}

			else { // Click이 두번째일때(노란색칸을 눌러야함)
				if (temp == "OrangeKing") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].king.getX(),
									Game2.player_piece.player[0].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].king.getX(),
									Game2.player_piece.player[0].king.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].king.getX(),
									Game2.player_piece.player[0].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].king.getX(),
									Game2.player_piece.player[0].king.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangeQueen") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].queen.getX(),
									Game2.player_piece.player[0].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].queen.getX(),
									Game2.player_piece.player[0].queen.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].queen.getX(),
									Game2.player_piece.player[0].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].queen.getX(),
									Game2.player_piece.player[0].queen.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangeKnight0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].knight[0].getX(),
									Game2.player_piece.player[0].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].knight[0].getX(),
									Game2.player_piece.player[0].knight[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].knight[0].getX(),
									Game2.player_piece.player[0].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].knight[0].getX(),
									Game2.player_piece.player[0].knight[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangeKnight1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].knight[1].getX(),
									Game2.player_piece.player[0].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].knight[1].getX(),
									Game2.player_piece.player[0].knight[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].knight[1].getX(),
									Game2.player_piece.player[0].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].knight[1].getX(),
									Game2.player_piece.player[0].knight[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangeBishop0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].bishop[0].getX(),
									Game2.player_piece.player[0].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].bishop[0].getX(),
									Game2.player_piece.player[0].bishop[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].bishop[0].getX(),
									Game2.player_piece.player[0].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].bishop[0].getX(),
									Game2.player_piece.player[0].bishop[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangeBishop1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].bishop[1].getX(),
									Game2.player_piece.player[0].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].bishop[1].getX(),
									Game2.player_piece.player[0].bishop[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].bishop[1].getX(),
									Game2.player_piece.player[0].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].bishop[1].getX(),
									Game2.player_piece.player[0].bishop[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangeRook0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].rook[0].getX(),
									Game2.player_piece.player[0].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].rook[0].getX(),
									Game2.player_piece.player[0].rook[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].rook[0].getX(),
									Game2.player_piece.player[0].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].rook[0].getX(),
									Game2.player_piece.player[0].rook[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				} else if (temp == "OrangeRook1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].rook[1].getX(),
									Game2.player_piece.player[0].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].rook[1].getX(),
									Game2.player_piece.player[0].rook[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].rook[1].getX(),
									Game2.player_piece.player[0].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].rook[1].getX(),
									Game2.player_piece.player[0].rook[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[0].getX(),
									Game2.player_piece.player[0].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[0].getX(),
									Game2.player_piece.player[0].pawn[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[0].getX(),
									Game2.player_piece.player[0].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[0].getX(),
									Game2.player_piece.player[0].pawn[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[1].getX(),
									Game2.player_piece.player[0].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[1].getX(),
									Game2.player_piece.player[0].pawn[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[1].getX(),
									Game2.player_piece.player[0].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[1].getX(),
									Game2.player_piece.player[0].pawn[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn2") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[2].getX(),
									Game2.player_piece.player[0].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[2].getX(),
									Game2.player_piece.player[0].pawn[2].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[2].getX(),
									Game2.player_piece.player[0].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[2].getX(),
									Game2.player_piece.player[0].pawn[2].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn3") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[3].getX(),
									Game2.player_piece.player[0].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[3].getX(),
									Game2.player_piece.player[0].pawn[3].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[3].getX(),
									Game2.player_piece.player[0].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[3].getX(),
									Game2.player_piece.player[0].pawn[3].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn4") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[4].getX(),
									Game2.player_piece.player[0].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[4].getX(),
									Game2.player_piece.player[0].pawn[4].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[4].getX(),
									Game2.player_piece.player[0].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[4].getX(),
									Game2.player_piece.player[0].pawn[4].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn5") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[5].getX(),
									Game2.player_piece.player[0].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[5].getX(),
									Game2.player_piece.player[0].pawn[5].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[5].getX(),
									Game2.player_piece.player[0].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[5].getX(),
									Game2.player_piece.player[0].pawn[5].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn6") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[6].getX(),
									Game2.player_piece.player[0].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[6].getX(),
									Game2.player_piece.player[0].pawn[6].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[6].getX(),
									Game2.player_piece.player[0].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[6].getX(),
									Game2.player_piece.player[0].pawn[6].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "OrangePawn7") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[7].getX(),
									Game2.player_piece.player[0].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[7].getX(),
									Game2.player_piece.player[0].pawn[7].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[0].pawn[7].getX(),
									Game2.player_piece.player[0].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[0].pawn[7].getX(),
									Game2.player_piece.player[0].pawn[7].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}
			}
		}

		// BLUE TEAM TURN
		else if (Game2.turn == 1) {
			Game2.reset_background2();
			if (Game2.Click == false) { // Click이 첫번째일때(말을 눌러야함)
				if (Game2.get_Whatpiece2(x, y) == "BlueKing") {
					if (Game2.player_piece.player[1].king.valid == true) {
						temp = "BlueKing";
						Game2.Click = true;
						Game2.player_piece.player[1].king.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueQueen") {
					if (Game2.player_piece.player[1].queen.valid == true) {
						temp = "BlueQueen";
						Game2.Click = true;
						Game2.player_piece.player[1].queen.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueKnight0") {
					if (Game2.player_piece.player[1].knight[0].valid == true) {
						temp = "BlueKnight0";
						Game2.Click = true;
						Game2.player_piece.player[1].knight[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueKnight1") {
					if (Game2.player_piece.player[1].knight[1].valid == true) {
						temp = "BlueKnight1";
						Game2.Click = true;
						Game2.player_piece.player[1].knight[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueBishop0") {
					if (Game2.player_piece.player[1].bishop[0].valid == true) {
						temp = "BlueBishop0";
						Game2.Click = true;
						Game2.player_piece.player[1].bishop[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueBishop1") {
					if (Game2.player_piece.player[1].bishop[1].valid == true) {
						temp = "BlueBishop1";
						Game2.Click = true;
						Game2.player_piece.player[1].bishop[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueRook0") {
					if (Game2.player_piece.player[1].rook[0].valid == true) {
						temp = "BlueRook0";
						Game2.Click = true;
						Game2.player_piece.player[1].rook[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BlueRook1") {
					if (Game2.player_piece.player[1].rook[1].valid == true) {
						temp = "BlueRook1";
						Game2.Click = true;
						Game2.player_piece.player[1].rook[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn0") {
					if (Game2.player_piece.player[1].pawn[0].valid == true) {
						temp = "BluePawn0";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "OrangePawn1") {
					if (Game2.player_piece.player[1].pawn[1].valid == true) {
						temp = "BluePawn1";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn2") {
					if (Game2.player_piece.player[1].pawn[2].valid == true) {
						temp = "BluePawn2";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[2].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn3") {
					if (Game2.player_piece.player[1].pawn[3].valid == true) {
						temp = "BluePawn3";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[3].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn4") {
					if (Game2.player_piece.player[1].pawn[4].valid == true) {
						temp = "BluePawn4";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[4].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn5") {
					if (Game2.player_piece.player[1].pawn[5].valid == true) {
						temp = "BluePawn5";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[5].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn6") {
					if (Game2.player_piece.player[1].pawn[6].valid == true) {
						temp = "BluePawn6";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[6].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "BluePawn7") {
					if (Game2.player_piece.player[1].pawn[7].valid == true) {
						temp = "BluePawn7";
						Game2.Click = true;
						Game2.player_piece.player[1].pawn[7].validMove(false);
					}
				}
			}

			else { // Click이 두번째일때(노란색칸을 눌러야함)
				if (temp == "BlueKing") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].king.getX(),
									Game2.player_piece.player[1].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].king.getX(),
									Game2.player_piece.player[1].king.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].king.getX(),
									Game2.player_piece.player[1].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].king.getX(),
									Game2.player_piece.player[1].king.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BlueQueen") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].queen.getX(),
									Game2.player_piece.player[1].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].queen.getX(),
									Game2.player_piece.player[1].queen.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].queen.getX(),
									Game2.player_piece.player[1].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].queen.getX(),
									Game2.player_piece.player[1].queen.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BlueKnight0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].knight[0].getX(),
									Game2.player_piece.player[1].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].knight[0].getX(),
									Game2.player_piece.player[1].knight[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].knight[0].getX(),
									Game2.player_piece.player[1].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].knight[0].getX(),
									Game2.player_piece.player[1].knight[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BlueKnight1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].knight[1].getX(),
									Game2.player_piece.player[1].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].knight[1].getX(),
									Game2.player_piece.player[1].knight[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].knight[1].getX(),
									Game2.player_piece.player[1].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].knight[1].getX(),
									Game2.player_piece.player[1].knight[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BlueBishop0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].bishop[0].getX(),
									Game2.player_piece.player[1].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].bishop[0].getX(),
									Game2.player_piece.player[1].bishop[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].bishop[0].getX(),
									Game2.player_piece.player[1].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].bishop[0].getX(),
									Game2.player_piece.player[1].bishop[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BlueBishop1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].bishop[1].getX(),
									Game2.player_piece.player[1].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].bishop[1].getX(),
									Game2.player_piece.player[1].bishop[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].bishop[1].getX(),
									Game2.player_piece.player[1].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].bishop[1].getX(),
									Game2.player_piece.player[1].bishop[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BlueRook0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].rook[0].getX(),
									Game2.player_piece.player[1].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].rook[0].getX(),
									Game2.player_piece.player[1].rook[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].rook[0].getX(),
									Game2.player_piece.player[1].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].rook[0].getX(),
									Game2.player_piece.player[1].rook[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				} else if (temp == "BlueRook1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].rook[1].getX(),
									Game2.player_piece.player[1].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].rook[1].getX(),
									Game2.player_piece.player[1].rook[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].rook[1].getX(),
									Game2.player_piece.player[1].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].rook[1].getX(),
									Game2.player_piece.player[1].rook[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[0].getX(),
									Game2.player_piece.player[1].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[0].getX(),
									Game2.player_piece.player[1].pawn[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[0].getX(),
									Game2.player_piece.player[1].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[0].getX(),
									Game2.player_piece.player[1].pawn[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[1].getX(),
									Game2.player_piece.player[1].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[1].getX(),
									Game2.player_piece.player[1].pawn[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[1].getX(),
									Game2.player_piece.player[1].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[1].getX(),
									Game2.player_piece.player[1].pawn[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn2") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[2].getX(),
									Game2.player_piece.player[1].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[2].getX(),
									Game2.player_piece.player[1].pawn[2].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[2].getX(),
									Game2.player_piece.player[1].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[2].getX(),
									Game2.player_piece.player[1].pawn[2].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn3") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[3].getX(),
									Game2.player_piece.player[1].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[3].getX(),
									Game2.player_piece.player[1].pawn[3].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[3].getX(),
									Game2.player_piece.player[1].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[3].getX(),
									Game2.player_piece.player[1].pawn[3].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn4") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[4].getX(),
									Game2.player_piece.player[1].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[4].getX(),
									Game2.player_piece.player[1].pawn[4].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[4].getX(),
									Game2.player_piece.player[1].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[4].getX(),
									Game2.player_piece.player[1].pawn[4].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn5") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[5].getX(),
									Game2.player_piece.player[1].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[5].getX(),
									Game2.player_piece.player[1].pawn[5].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[5].getX(),
									Game2.player_piece.player[1].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[5].getX(),
									Game2.player_piece.player[1].pawn[5].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn6") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[6].getX(),
									Game2.player_piece.player[1].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[6].getX(),
									Game2.player_piece.player[1].pawn[6].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[6].getX(),
									Game2.player_piece.player[1].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[6].getX(),
									Game2.player_piece.player[1].pawn[6].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "BluePawn7") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[7].getX(),
									Game2.player_piece.player[1].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[7].getX(),
									Game2.player_piece.player[1].pawn[7].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[1].pawn[7].getX(),
									Game2.player_piece.player[1].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[1].pawn[7].getX(),
									Game2.player_piece.player[1].pawn[7].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}
			}
		}

		// GREEN TEAM TURN
		else if (Game2.turn == 2) {
			Game2.reset_background2();
			if (Game2.Click == false) { // Click이 첫번째일때(말을 눌러야함)
				if (Game2.get_Whatpiece2(x, y) == "GreenKing") {
					if (Game2.player_piece.player[2].king.valid == true) {
						temp = "GreenKing";
						Game2.Click = true;
						Game2.player_piece.player[2].king.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenQueen") {
					if (Game2.player_piece.player[2].queen.valid == true) {
						temp = "GreenQueen";
						Game2.Click = true;
						Game2.player_piece.player[2].queen.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenKnight0") {
					if (Game2.player_piece.player[2].knight[0].valid == true) {
						temp = "GreenKnight0";
						Game2.Click = true;
						Game2.player_piece.player[2].knight[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenKnight1") {
					if (Game2.player_piece.player[2].knight[1].valid == true) {
						temp = "GreenKnight1";
						Game2.Click = true;
						Game2.player_piece.player[2].knight[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenBishop0") {
					if (Game2.player_piece.player[2].bishop[0].valid == true) {
						temp = "GreenBishop0";
						Game2.Click = true;
						Game2.player_piece.player[2].bishop[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenBishop1") {
					if (Game2.player_piece.player[2].bishop[1].valid == true) {
						temp = "GreenBishop1";
						Game2.Click = true;
						Game2.player_piece.player[2].bishop[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenRook0") {
					if (Game2.player_piece.player[2].rook[0].valid == true) {
						temp = "GreenRook0";
						Game2.Click = true;
						Game2.player_piece.player[2].rook[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenRook1") {
					if (Game2.player_piece.player[2].rook[1].valid == true) {
						temp = "GreenRook1";
						Game2.Click = true;
						Game2.player_piece.player[2].rook[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn0") {
					if (Game2.player_piece.player[2].pawn[0].valid == true) {
						temp = "GreenPawn0";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn1") {
					if (Game2.player_piece.player[2].pawn[1].valid == true) {
						temp = "GreenPawn1";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn2") {
					if (Game2.player_piece.player[2].pawn[2].valid == true) {
						temp = "GreenPawn2";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[2].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn3") {
					if (Game2.player_piece.player[2].pawn[3].valid == true) {
						temp = "GreenPawn3";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[3].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn4") {
					if (Game2.player_piece.player[2].pawn[4].valid == true) {
						temp = "GreenPawn4";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[4].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn5") {
					if (Game2.player_piece.player[2].pawn[5].valid == true) {
						temp = "GreenPawn5";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[5].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn6") {
					if (Game2.player_piece.player[2].pawn[6].valid == true) {
						temp = "GreenPawn6";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[6].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "GreenPawn7") {
					if (Game2.player_piece.player[2].pawn[7].valid == true) {
						temp = "GreenPawn7";
						Game2.Click = true;
						Game2.player_piece.player[2].pawn[7].validMove(false);
					}
				}
			}

			else { // Click이 두번째일때(노란색칸을 눌러야함)
				if (temp == "GreenKing") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].king.getX(),
									Game2.player_piece.player[2].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].king.getX(),
									Game2.player_piece.player[2].king.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].king.getX(),
									Game2.player_piece.player[2].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].king.getX(),
									Game2.player_piece.player[2].king.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenQueen") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].queen.getX(),
									Game2.player_piece.player[2].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].queen.getX(),
									Game2.player_piece.player[2].queen.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].queen.getX(),
									Game2.player_piece.player[2].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].queen.getX(),
									Game2.player_piece.player[2].queen.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenKnight0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].knight[0].getX(),
									Game2.player_piece.player[2].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].knight[0].getX(),
									Game2.player_piece.player[2].knight[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].knight[0].getX(),
									Game2.player_piece.player[2].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].knight[0].getX(),
									Game2.player_piece.player[2].knight[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenKnight1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].knight[1].getX(),
									Game2.player_piece.player[2].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].knight[1].getX(),
									Game2.player_piece.player[2].knight[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].knight[1].getX(),
									Game2.player_piece.player[2].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].knight[1].getX(),
									Game2.player_piece.player[2].knight[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenBishop0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].bishop[0].getX(),
									Game2.player_piece.player[2].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].bishop[0].getX(),
									Game2.player_piece.player[2].bishop[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].bishop[0].getX(),
									Game2.player_piece.player[2].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].bishop[0].getX(),
									Game2.player_piece.player[2].bishop[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenBishop1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].bishop[1].getX(),
									Game2.player_piece.player[2].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].bishop[1].getX(),
									Game2.player_piece.player[2].bishop[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].bishop[1].getX(),
									Game2.player_piece.player[2].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].bishop[1].getX(),
									Game2.player_piece.player[2].bishop[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenRook0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].rook[0].getX(),
									Game2.player_piece.player[2].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].rook[0].getX(),
									Game2.player_piece.player[2].rook[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].rook[0].getX(),
									Game2.player_piece.player[2].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].rook[0].getX(),
									Game2.player_piece.player[2].rook[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				} else if (temp == "GreenRook1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].rook[1].getX(),
									Game2.player_piece.player[2].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].rook[1].getX(),
									Game2.player_piece.player[2].rook[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].rook[1].getX(),
									Game2.player_piece.player[2].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].rook[1].getX(),
									Game2.player_piece.player[2].rook[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[0].getX(),
									Game2.player_piece.player[2].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[0].getX(),
									Game2.player_piece.player[2].pawn[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[0].getX(),
									Game2.player_piece.player[2].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[0].getX(),
									Game2.player_piece.player[2].pawn[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[1].getX(),
									Game2.player_piece.player[2].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[1].getX(),
									Game2.player_piece.player[2].pawn[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[1].getX(),
									Game2.player_piece.player[2].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[1].getX(),
									Game2.player_piece.player[2].pawn[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn2") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[2].getX(),
									Game2.player_piece.player[2].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[2].getX(),
									Game2.player_piece.player[2].pawn[2].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[2].getX(),
									Game2.player_piece.player[2].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[2].getX(),
									Game2.player_piece.player[2].pawn[2].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn3") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[3].getX(),
									Game2.player_piece.player[2].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[3].getX(),
									Game2.player_piece.player[2].pawn[3].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[3].getX(),
									Game2.player_piece.player[2].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[3].getX(),
									Game2.player_piece.player[2].pawn[3].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn4") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[4].getX(),
									Game2.player_piece.player[2].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[4].getX(),
									Game2.player_piece.player[2].pawn[4].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[4].getX(),
									Game2.player_piece.player[2].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[4].getX(),
									Game2.player_piece.player[2].pawn[4].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn5") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[5].getX(),
									Game2.player_piece.player[2].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[5].getX(),
									Game2.player_piece.player[2].pawn[5].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[5].getX(),
									Game2.player_piece.player[2].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[5].getX(),
									Game2.player_piece.player[2].pawn[5].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn6") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[6].getX(),
									Game2.player_piece.player[2].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[6].getX(),
									Game2.player_piece.player[2].pawn[6].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[6].getX(),
									Game2.player_piece.player[2].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[6].getX(),
									Game2.player_piece.player[2].pawn[6].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "GreenPawn7") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[7].getX(),
									Game2.player_piece.player[2].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[7].getX(),
									Game2.player_piece.player[2].pawn[7].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[2].pawn[7].getX(),
									Game2.player_piece.player[2].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[2].pawn[7].getX(),
									Game2.player_piece.player[2].pawn[7].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}
			}
		}

		// GREEN TEAM TURN
		else if (Game2.turn == 3) {
			Game2.reset_background2();
			if (Game2.Click == false) { // Click이 첫번째일때(말을 눌러야함)
				if (Game2.get_Whatpiece2(x, y) == "PurpleKing") {
					if (Game2.player_piece.player[3].king.valid == true) {
						temp = "PurpleKing";
						Game2.Click = true;
						Game2.player_piece.player[3].king.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleQueen") {
					if (Game2.player_piece.player[3].queen.valid == true) {
						temp = "PurpleQueen";
						Game2.Click = true;
						Game2.player_piece.player[3].queen.validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleKnight0") {
					if (Game2.player_piece.player[3].knight[0].valid == true) {
						temp = "PurpleKnight0";
						Game2.Click = true;
						Game2.player_piece.player[3].knight[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleKnight1") {
					if (Game2.player_piece.player[3].knight[1].valid == true) {
						temp = "PurpleKnight1";
						Game2.Click = true;
						Game2.player_piece.player[3].knight[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleBishop0") {
					if (Game2.player_piece.player[3].bishop[0].valid == true) {
						temp = "PurpleBishop0";
						Game2.Click = true;
						Game2.player_piece.player[3].bishop[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleBishop1") {
					if (Game2.player_piece.player[3].bishop[1].valid == true) {
						temp = "PurpleBishop1";
						Game2.Click = true;
						Game2.player_piece.player[3].bishop[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleRook0") {
					if (Game2.player_piece.player[3].rook[0].valid == true) {
						temp = "PurpleRook0";
						Game2.Click = true;
						Game2.player_piece.player[3].rook[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurpleRook1") {
					if (Game2.player_piece.player[3].rook[1].valid == true) {
						temp = "PurpleRook1";
						Game2.Click = true;
						Game2.player_piece.player[3].rook[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn0") {
					if (Game2.player_piece.player[3].pawn[0].valid == true) {
						temp = "PurplePawn0";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[0].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn1") {
					if (Game2.player_piece.player[3].pawn[1].valid == true) {
						temp = "PurplePawn1";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[1].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn2") {
					if (Game2.player_piece.player[3].pawn[2].valid == true) {
						temp = "PurplePawn2";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[2].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn3") {
					if (Game2.player_piece.player[3].pawn[3].valid == true) {
						temp = "PurplePawn3";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[3].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn4") {
					if (Game2.player_piece.player[3].pawn[4].valid == true) {
						temp = "PurplePawn4";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[4].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn5") {
					if (Game2.player_piece.player[3].pawn[5].valid == true) {
						temp = "PurplePawn5";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[5].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn6") {
					if (Game2.player_piece.player[3].pawn[6].valid == true) {
						temp = "PurplePawn6";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[6].validMove(false);
					}
				} else if (Game2.get_Whatpiece2(x, y) == "PurplePawn7") {
					if (Game2.player_piece.player[3].pawn[7].valid == true) {
						temp = "PurplePawn7";
						Game2.Click = true;
						Game2.player_piece.player[3].pawn[7].validMove(false);
					}
				}
			}

			else { // Click이 두번째일때(노란색칸을 눌러야함)
				if (temp == "PurpleKing") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].king.getX(),
									Game2.player_piece.player[3].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].king.getX(),
									Game2.player_piece.player[3].king.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].king.getX(),
									Game2.player_piece.player[3].king.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].king.getX(),
									Game2.player_piece.player[3].king.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurpleQueen") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].queen.getX(),
									Game2.player_piece.player[3].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].queen.getX(),
									Game2.player_piece.player[3].queen.getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].queen.getX(),
									Game2.player_piece.player[3].queen.getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].queen.getX(),
									Game2.player_piece.player[3].queen.getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurpleKnight0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].knight[0].getX(),
									Game2.player_piece.player[3].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].knight[0].getX(),
									Game2.player_piece.player[3].knight[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].knight[0].getX(),
									Game2.player_piece.player[3].knight[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].knight[0].getX(),
									Game2.player_piece.player[3].knight[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurpleKnight1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].knight[1].getX(),
									Game2.player_piece.player[3].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].knight[1].getX(),
									Game2.player_piece.player[3].knight[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].knight[1].getX(),
									Game2.player_piece.player[3].knight[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].knight[1].getX(),
									Game2.player_piece.player[3].knight[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurpleBishop0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].bishop[0].getX(),
									Game2.player_piece.player[3].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].bishop[0].getX(),
									Game2.player_piece.player[3].bishop[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].bishop[0].getX(),
									Game2.player_piece.player[3].bishop[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].bishop[0].getX(),
									Game2.player_piece.player[3].bishop[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurpleBishop1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].bishop[1].getX(),
									Game2.player_piece.player[3].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].bishop[1].getX(),
									Game2.player_piece.player[3].bishop[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].bishop[1].getX(),
									Game2.player_piece.player[3].bishop[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].bishop[1].getX(),
									Game2.player_piece.player[3].bishop[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurpleRook0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].rook[0].getX(),
									Game2.player_piece.player[3].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].rook[0].getX(),
									Game2.player_piece.player[3].rook[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].rook[0].getX(),
									Game2.player_piece.player[3].rook[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].rook[0].getX(),
									Game2.player_piece.player[3].rook[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				} else if (temp == "PurpleRook1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].rook[1].getX(),
									Game2.player_piece.player[3].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].rook[1].getX(),
									Game2.player_piece.player[3].rook[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].rook[1].getX(),
									Game2.player_piece.player[3].rook[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].rook[1].getX(),
									Game2.player_piece.player[3].rook[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn0") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[0].getX(),
									Game2.player_piece.player[3].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[0].getX(),
									Game2.player_piece.player[3].pawn[0].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[0].getX(),
									Game2.player_piece.player[3].pawn[0].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[0].getX(),
									Game2.player_piece.player[3].pawn[0].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn1") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[1].getX(),
									Game2.player_piece.player[3].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[1].getX(),
									Game2.player_piece.player[3].pawn[1].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[1].getX(),
									Game2.player_piece.player[3].pawn[1].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[1].getX(),
									Game2.player_piece.player[3].pawn[1].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn2") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[2].getX(),
									Game2.player_piece.player[3].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[2].getX(),
									Game2.player_piece.player[3].pawn[2].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[2].getX(),
									Game2.player_piece.player[3].pawn[2].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[2].getX(),
									Game2.player_piece.player[3].pawn[2].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn3") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[3].getX(),
									Game2.player_piece.player[3].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[3].getX(),
									Game2.player_piece.player[3].pawn[3].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[3].getX(),
									Game2.player_piece.player[3].pawn[3].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[3].getX(),
									Game2.player_piece.player[3].pawn[3].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn4") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[4].getX(),
									Game2.player_piece.player[3].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[4].getX(),
									Game2.player_piece.player[3].pawn[4].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[4].getX(),
									Game2.player_piece.player[3].pawn[4].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[4].getX(),
									Game2.player_piece.player[3].pawn[4].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn5") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[5].getX(),
									Game2.player_piece.player[3].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[5].getX(),
									Game2.player_piece.player[3].pawn[5].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[5].getX(),
									Game2.player_piece.player[3].pawn[5].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[5].getX(),
									Game2.player_piece.player[3].pawn[5].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn6") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[6].getX(),
									Game2.player_piece.player[3].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[6].getX(),
									Game2.player_piece.player[3].pawn[6].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[6].getX(),
									Game2.player_piece.player[3].pawn[6].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[6].getX(),
									Game2.player_piece.player[3].pawn[6].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}

				else if (temp == "PurplePawn7") {
					if (ipcolor == Game.Yellow) {
						if (Game2.existImage2(x, y) == false) {
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[7].getX(),
									Game2.player_piece.player[3].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[7].getX(),
									Game2.player_piece.player[3].pawn[7].getY(), x, y);
						} else {
							Game2.move_diepiece2(x, y);
							Game2.change_valid2(x, y);
							Game2.changeImagePanel2(Game2.player_piece.player[3].pawn[7].getX(),
									Game2.player_piece.player[3].pawn[7].getY(), x, y);
							Game2.change_pieceXY2(Game2.player_piece.player[3].pawn[7].getX(),
									Game2.player_piece.player[3].pawn[7].getY(), x, y);
						}
						Game2.turn = (Game2.turn + 1) % 4;
					}
					Game2.Click = false;
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		ImagePanel imgpn = (ImagePanel) e.getSource();
		int x = (imgpn.getX() - 470) / 70;
		int y = (imgpn.getY() - 30) / 70;

		if (imgpn.getBackground() != Game.Yellow && imgpn.getBackground() != Game.Pink) {
			Game2.change_background2("Skyblue", x, y);
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
		int x = (imgpn.getX() - 470) / 70;
		int y = (imgpn.getY() - 30) / 70;

		if (imgpn.getBackground() == Game.Skyblue) {
			if ((x + y) % 2 == 0)
				Game2.change_background2("White", x, y);
			else
				Game2.change_background2("Purple", x, y);
		} else {
			imgpn.setBorder(BorderFactory.createLineBorder(new Color(194, 124, 211), 1));
		}
	}

}
