package Piece_each;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;

public class Pawn extends Piece {

   public Pawn() {
      super();
   }

   public Pawn(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
      // TODO Auto-generated constructor stub
   }

   public boolean validMove(boolean canMove) {
      boolean move = false;
      int a;
      if(canMove != true)Game.change_background("Pink", x, y);

      if(canMove != true) if (color == "white") {
         if (y == 6) {
            for (a = 1; a < 3; a++) {
               if (isavailable(x, y - a) == "empty") {
                  if(canMove != true) Game.change_background("Yellow", x, y - a);
                  if (MakeCheck.makecheck(x, y, x, y - a)) {
                     if ((x + (y - a)) % 2 == 0) {
                        Game.change_background("White", x, y - a);
                     } else {
                        Game.change_background("Purple", x, y - a);
                     }
                  } else
                     move = true;
                  continue;
               } else {
                  break;
               }
            }
         } else if (y - 1 >= 0 && isavailable(x, y - 1) == "empty") {
            if(canMove != true) Game.change_background("Yellow", x, y - 1);
            if (MakeCheck.makecheck(x, y, x, y - 1)) {
               if ((x + (y - 1)) % 2 == 0) {
                  Game.change_background("White", x, y - 1);
               } else {
                  Game.change_background("Purple", x, y - 1);
               }
            }
            else move = true;
         }

         if (x - 1 >= 0 && y - 1 >= 0 && isavailable(x - 1, y - 1) == "enemy") {
            if(canMove != true) Game.change_background("Yellow", x - 1, y - 1);
            if (MakeCheck.makecheck(x, y, x - 1, y - 1)) {
               if (((x - 1) + (y - 1)) % 2 == 0) {
                  Game.change_background("White", x - 1, y - 1);
               } else {
                  Game.change_background("Purple", x - 1, y - 1);
               }
            }
            else move = true;
         }
         if (x + 1 < 8 && y - 1 >= 0 && isavailable(x + 1, y - 1) == "enemy") {
            if(canMove != true) Game.change_background("Yellow", x + 1, y - 1);
            if (MakeCheck.makecheck(x, y, x + 1, y - 1)) {
               if (((x + 1) + (y - 1)) % 2 == 0) {
                  Game.change_background("White", x + 1, y - 1);
               } else {
                  Game.change_background("Purple", x + 1, y - 1);
               }
            }
            else move = true;
         }
      }

      if (color == "black") {
         if (y == 1) {
            for (a = 1; a < 3; a++) {
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
               } else {
                  break;
               }
            }
         } else if (y + 1 < 8 && isavailable(x, y + 1) == "empty") {
            if(canMove != true) Game.change_background("Yellow", x, y + 1);
            if (MakeCheck.makecheck(x, y, x, y + 1)) {
               if ((x + (y + 1)) % 2 == 0) {
                  Game.change_background("White", x, y + 1);
               } else {
                  Game.change_background("Purple", x, y + 1);
               }
            }
            else move = true;
         }
         if (x - 1 >= 0 && y + 1 < 8 && isavailable(x - 1, y + 1) == "enemy") {
            if(canMove != true) Game.change_background("Yellow", x - 1, y + 1);
            if (MakeCheck.makecheck(x, y, x - 1, y + 1)) {
               if (((x - 1) + (y + 1)) % 2 == 0) {
                  Game.change_background("White", x - 1, y + 1);
               } else {
                  Game.change_background("Purple", x - 1, y + 1);
               }
            }
            else move = true;
         }
         if (x + 1 < 8 && y + 1 < 8 && isavailable(x + 1, y + 1) == "enemy") {
            if(canMove != true) Game.change_background("Yellow", x + 1, y + 1);
            if (MakeCheck.makecheck(x, y, x + 1, y + 1)) {
               if (((x + 1) + (y + 1)) % 2 == 0) {
                  Game.change_background("White", x + 1, y + 1);
               } else {
                  Game.change_background("Purple", x + 1, y + 1);
               }
            }
            else move = true;
         }
      }
      return move;
   }

   public boolean kingCheck(King king) {

      if (color == "white") {
         if (x - 1 == king.getX() && y - 1 == king.getY()) {
            return true;
         }
         if (x + 1 == king.getX() && y - 1 == king.getY()) {
            return true;
         }
      }

      if (color == "black") {
         if (x - 1 == king.getX() && y + 1 == king.getY()) {
            return true;
         }
         if (x + 1 == king.getX() && y + 1 == king.getY()) {
            return true;
         }
      }
      return false;
   }
}