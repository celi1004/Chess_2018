package Chess_1vs1;

import Piece_each.King;

public class GameManager {
	
	public static boolean check() {
		
		boolean[] check = new boolean[32];
		
		check[0] = false;
		check[1] = ( Game.player_piece.player[0].queen.valid && Game.player_piece.player[0].queen.kingCheck(Game.player_piece.player[1].king));
		check[2] = ( Game.player_piece.player[0].knight[0].valid && Game.player_piece.player[0].knight[0].kingCheck(Game.player_piece.player[1].king));
		check[3] = ( Game.player_piece.player[0].knight[1].valid && Game.player_piece.player[0].knight[1].kingCheck(Game.player_piece.player[1].king));
		check[4] = ( Game.player_piece.player[0].bishop[0].valid && Game.player_piece.player[0].bishop[0].kingCheck(Game.player_piece.player[1].king));
		check[5] = ( Game.player_piece.player[0].bishop[1].valid && Game.player_piece.player[0].bishop[1].kingCheck(Game.player_piece.player[1].king));
		check[6] = ( Game.player_piece.player[0].rook[0].valid && Game.player_piece.player[0].rook[0].kingCheck(Game.player_piece.player[1].king));
		check[7] = ( Game.player_piece.player[0].rook[1].valid && Game.player_piece.player[0].rook[1].kingCheck(Game.player_piece.player[1].king));
		for(int i=0; i<8; i++) {
			check[i+8] = ( Game.player_piece.player[0].pawn[i].valid && Game.player_piece.player[0].pawn[i].kingCheck(Game.player_piece.player[1].king));
		}
		
		check[16] = false;
		check[17] = ( Game.player_piece.player[1].queen.valid && Game.player_piece.player[1].queen.kingCheck(Game.player_piece.player[0].king));
		check[18] = ( Game.player_piece.player[1].knight[0].valid && Game.player_piece.player[1].knight[0].kingCheck(Game.player_piece.player[0].king));
		check[19] = ( Game.player_piece.player[1].knight[1].valid && Game.player_piece.player[1].knight[1].kingCheck(Game.player_piece.player[0].king));
		check[20] = ( Game.player_piece.player[1].bishop[0].valid && Game.player_piece.player[1].bishop[0].kingCheck(Game.player_piece.player[0].king));
		check[21] = ( Game.player_piece.player[1].bishop[1].valid && Game.player_piece.player[1].bishop[1].kingCheck(Game.player_piece.player[0].king));
		check[23] = ( Game.player_piece.player[1].rook[0].valid && Game.player_piece.player[1].rook[0].kingCheck(Game.player_piece.player[0].king));
		check[24] = ( Game.player_piece.player[1].rook[1].valid && Game.player_piece.player[1].rook[1].kingCheck(Game.player_piece.player[0].king));
		for(int i=0; i<8; i++) {
			check[i+24] = ( Game.player_piece.player[1].pawn[i].valid && Game.player_piece.player[1].pawn[i].kingCheck(Game.player_piece.player[0].king));
		}
		
		for(int i=0; i<16; i++) {
			if(check[i] == true) {
				new PopUp("Check", "White Check!!");
				return true;
			}
		}
		for(int i=16; i<32; i++) {
			if(check[i] == true) {
				new PopUp("Check", "Black Check!");
				return true;
			}
		}
		return false;
	}
	
	 public static boolean canMove(Piece_Set player) {
	      // cm 살아있고&&움직일수있으면 true
	      // 하나라도 움직일수있으면 true 반환

	      boolean[] cm = new boolean[16];
	      boolean value=false;

	      cm[0] = player.king.validMove(true);
	      cm[1] = player.queen.valid && player.queen.validMove(true);
	      cm[2] = player.knight[0].valid && player.knight[0].validMove(true);
	      cm[3] = player.knight[1].valid && player.knight[1].validMove(true);
	      cm[4] = player.bishop[0].valid && player.bishop[0].validMove(true);
	      cm[5] = player.bishop[1].valid && player.bishop[1].validMove(true);
	      cm[6] = player.rook[0].valid && player.rook[0].validMove(true);
	      cm[7] = player.rook[1].valid && player.rook[1].validMove(true);
	      for (int i = 8; i < 16; i++) {
	         cm[i] = player.pawn[i - 8].valid && !player.pawn[i - 8].validMove(true);
	      }
	      for (int i = 0; i < 16; i++) {
	         if (cm[i] == true) {
	            value=true;
	         }
	      }
	      return value;
	   }

	   public static String rule(boolean turn) {

		      int n;
		      if (turn == true)
		         n = 1; // 까만색이면 1
		      else
		         n = 0; // 하얀색이면 0
		      
		      if (check()) {
		          if (canMove(Game.player_piece.player[n])) {
		             return "Check";
		          } else {
		        	 if(n == 1) new PopUp("CheckMate", "CheckMate!! White Win!!");
		        	 else new PopUp("CheckMate", "CheckMate!! Black Win!!");
		             return "CheckMate";
		          }
		       } else {
		          if (canMove(Game.player_piece.player[n])) {
		             return null;
		          } else {
		        	  new PopUp("StaleMate", "Draw");
		             return "StaleMate";
		          }
		       }
	   }
	   
	   public static boolean kingrule(King king) {
		   
		   
		   
		   return false;
	   }
}