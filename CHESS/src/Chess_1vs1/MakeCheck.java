package Chess_1vs1;

import Chess_1vs1.Game;
import Piece_each.Piece;

public class MakeCheck {

   public static boolean makecheck(int x1, int y1, int x2, int y2) {
       String piece = Game.get_Whatpiece(x2, y2);
      boolean temp = false;
      
      if (piece == "WhiteKing") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].king.valid = false;
      }
      if (piece == "WhiteQueen") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].queen.valid = false;
      }
      if (piece == "WhiteKnight0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].knight[0].valid = false;
      }
      if (piece == "WhiteKnight1") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].knight[1].valid = false;
      }
      if (piece == "WhiteBishop0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].bishop[0].valid = false;
      }
      if (piece == "WhiteBishop1") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].bishop[1].valid = false;
      }
      if (piece == "WhiteRook0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].rook[0].valid = false;
      }
      if (piece == "WhiteRook0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].rook[1].valid = false;
      }
      if (piece == "WhitePawn0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[0].valid = false;
      }
      if (piece == "WhitePawn1") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[1].valid = false;
      }
      if (piece == "WhitePawn2") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[2].valid = false;
      }
      if (piece == "WhitePawn3") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[3].valid = false;
      }
      if (piece == "WhitePawn4") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[4].valid = false;
      }
      if (piece == "WhitePawn5") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[5].valid = false;
      }
      if (piece == "WhitePawn6") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[6].valid = false;
      }
      if (piece == "WhitePawn7") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[0].pawn[7].valid = false;
      }

      if (piece == "BlackKing") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].king.valid = false;
      }
      if (piece == "BlackQueen") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].queen.valid = false;
      }
      if (piece == "BlackKnight0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].knight[0].valid = false;
      }
      if (piece == "BlackKnight1") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].knight[1].valid = false;
      }
      if (piece == "BlackBishop0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].bishop[0].valid = false;
      }
      if (piece == "BlackBishop1") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].bishop[1].valid = false;
      }
      if (piece == "BlackRook0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].rook[0].valid = false;
      }
      if (piece == "BlackRook0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].rook[1].valid = false;
      }
      if (piece == "BlackPawn0") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[0].valid = false;
      }
      if (piece == "BlackPawn1") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[1].valid = false;
      }
      if (piece == "BlackPawn2") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[2].valid = false;
      }
      if (piece == "BlackPawn3") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[3].valid = false;
      }
      if (piece == "BlackPawn4") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[4].valid = false;
      }
      if (piece == "BlackPawn5") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[5].valid = false;
      }
      if (piece == "BlackPawn6") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[6].valid = false;
      }
      if (piece == "BlackPawn7") {
         Game.change_pieceXY(x2, y2, 9, 9);
         Game.player_piece.player[1].pawn[7].valid = false;
      }

      Game.change_pieceXY(x1, y1, x2, y2);

      if (Game.existImage(x1, y1) && (Game.colorImage(x1, y1)).equals("black")) // 말이 검은색일때 움직이면 하얀색 말들이 우리 킹을
                                                               // 체크할수있는가? 메이크체크 트루이면 그 경우를
      {
         if (Game.player_piece.player[0].queen.valid
               && Game.player_piece.player[0].queen.kingCheck(Game.player_piece.player[1].king)) {
            temp = true;
            System.out.println("wqueen");
         }
         for (int h = 0; h < 2; h++) {
            if ((Game.player_piece.player[0].bishop[h].valid
                  && Game.player_piece.player[0].bishop[h].kingCheck(Game.player_piece.player[1].king))
                  || (Game.player_piece.player[0].knight[h].valid
                        && Game.player_piece.player[0].knight[h].kingCheck(Game.player_piece.player[1].king))
                  || (Game.player_piece.player[0].rook[h].valid
                        && Game.player_piece.player[0].rook[h].kingCheck(Game.player_piece.player[1].king))) {
               temp = true;
               System.out.println("wmany");
               break;
            }
         }

         for (int i = 0; i < 8; i++) {
            if (Game.player_piece.player[0].pawn[i].valid
                  && Game.player_piece.player[0].pawn[i].kingCheck(Game.player_piece.player[1].king)) {
               temp = true;
               System.out.println("wpawn");
               break;
            }
         }
      }

      if (Game.existImage(x1, y1) && (Game.colorImage(x1, y1)).equals("white")) {
         if (Game.player_piece.player[1].queen.valid
               && Game.player_piece.player[1].queen.kingCheck(Game.player_piece.player[0].king)) {
            temp = true;
            System.out.println("bqueen");
         }

         for (int h = 0; h < 2; h++) {
            if ((Game.player_piece.player[1].bishop[h].valid
                  && Game.player_piece.player[1].bishop[h].kingCheck(Game.player_piece.player[0].king))
                  || (Game.player_piece.player[1].knight[h].valid
                        && Game.player_piece.player[1].knight[h].kingCheck(Game.player_piece.player[0].king))
                  || (Game.player_piece.player[1].rook[h].valid
                        && Game.player_piece.player[1].rook[h].kingCheck(Game.player_piece.player[0].king))) {
               temp = true;
               System.out.println("bmany");
               break;
            }
         }

         for (int i = 0; i < 8; i++) {
            if ((Game.player_piece.player[1].pawn[i].valid
                  && Game.player_piece.player[0].pawn[i].kingCheck(Game.player_piece.player[1].king))) {
               temp = true;
               System.out.println("bpawn");
               break;
            }
         }

      }
      System.out.println(temp);
      Game.change_pieceXY(x2, y2, x1, y1);

      if (piece == "WhiteKing") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].king.valid = true;
      }
      if (piece == "WhiteQueen") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].queen.valid = true;
      }
      if (piece == "WhiteKnight0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].knight[0].valid = true;
      }
      if (piece == "WhiteKnight1") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].knight[1].valid = true;
      }
      if (piece == "WhiteBishop0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].bishop[0].valid = true;
      }
      if (piece == "WhiteBishop1") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].bishop[1].valid = true;
      }
      if (piece == "WhiteRook0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].rook[0].valid = true;
      }
      if (piece == "WhiteRook0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].rook[1].valid = true;
      }
      if (piece == "WhitePawn0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[0].valid = true;
      }
      if (piece == "WhitePawn1") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[1].valid = true;
      }
      if (piece == "WhitePawn2") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[2].valid = true;
      }
      if (piece == "WhitePawn3") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[3].valid = true;
      }
      if (piece == "WhitePawn4") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[4].valid = true;
      }
      if (piece == "WhitePawn5") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[5].valid = true;
      }
      if (piece == "WhitePawn6") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[6].valid = true;
      }
      if (piece == "WhitePawn7") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[0].pawn[7].valid = true;
      }

      if (piece == "BlackKing") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].king.valid = true;
      }
      if (piece == "BlackQueen") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].queen.valid = true;
      }
      if (piece == "BlackKnight0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].knight[0].valid = true;
      }
      if (piece == "BlackKnight1") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].knight[1].valid = true;
      }
      if (piece == "BlackBishop0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].bishop[0].valid = true;
      }
      if (piece == "BlackBishop1") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].bishop[1].valid = true;
      }
      if (piece == "BlackRook0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].rook[0].valid = true;
      }
      if (piece == "BlackRook0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].rook[1].valid = true;
      }
      if (piece == "BlackPawn0") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[0].valid = true;
      }
      if (piece == "BlackPawn1") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[1].valid = true;
      }
      if (piece == "BlackPawn2") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[2].valid = true;
      }
      if (piece == "BlackPawn3") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[3].valid = true;
      }
      if (piece == "BlackPawn4") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[4].valid = true;
      }
      if (piece == "BlackPawn5") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[5].valid = true;
      }
      if (piece == "BlackPawn6") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[6].valid = true;
      }
      if (piece == "BlackPawn7") {
         Game.change_pieceXY(9, 9, x2, y2);
         Game.player_piece.player[1].pawn[7].valid = true;
      }
      
      return temp;
      
   }
}