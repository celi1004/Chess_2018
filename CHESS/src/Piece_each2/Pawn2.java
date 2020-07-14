package Piece_each2;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;
import Chess_2vs2.Game2;
import Piece_each.King;
import Piece_each2.Piece2;

public class Pawn2 extends Piece2 {

   public Pawn2() {
      super();
   }

   public Pawn2(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
      // TODO Auto-generated constructor stub
   }

   public boolean validMove(boolean canMove) {
      boolean move = false;
      int a;
      if(canMove != true)Game2.change_background2("Pink", x, y);

      if (Game2.turn == 0) {
         if (y == 12) {
            for (a = 1; a < 3; a++) {
               if (isavailable_2(x, y, x, y - a) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x, y - a);
                  if (MakeCheck.makecheck(x, y, x, y - a)) {
                     if ((x + (y - a)) % 2 == 0) {
                        Game2.change_background2("White", x, y - a);
                     } else {
                        Game2.change_background2("Purple", x, y - a);
                     }
                  } else
                     move = true;
                  continue;
               } else {
                  break;
               }
            }
         } else if (boundary2(x, y-1) && isavailable_2(x, y, x, y - 1) == "empty") {
            if(canMove != true) Game2.change_background2("Yellow", x, y - 1);
            if (MakeCheck.makecheck(x, y, x, y - 1)) {
               if ((x + (y - 1)) % 2 == 0) {
                  Game2.change_background2("White", x, y - 1);
               } else {
                  Game2.change_background2("Purple", x, y - 1);
               }
            }
            else move = true;
         }

         if (boundary2(x-1, y-1) && isavailable_2(x, y, x - 1, y - 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x - 1, y - 1);
            if (MakeCheck.makecheck(x, y, x - 1, y - 1)) {
               if (((x - 1) + (y - 1)) % 2 == 0) {
                  Game2.change_background2("White", x - 1, y - 1);
               } else {
                  Game2.change_background2("Purple", x - 1, y - 1);
               }
            }
            else move = true;
         }
         if (boundary2(x+1, y-1) && isavailable_2(x, y, x + 1, y - 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x + 1, y - 1);
            if (MakeCheck.makecheck(x, y, x + 1, y - 1)) {
               if (((x + 1) + (y - 1)) % 2 == 0) {
                  Game2.change_background2("White", x + 1, y - 1);
               } else {
                  Game2.change_background2("Purple", x + 1, y - 1);
               }
            }
            else move = true;
         }
      }
      if (Game2.turn == 1) {
         if (x == 1) {
            for (a = 1; a < 3; a++) {
               if (isavailable_2(x, y, x+a, y) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x+a, y);
                  if (MakeCheck.makecheck(x, y, x+a, y)) {
                     if ((x+a + y) % 2 == 0) {
                        Game2.change_background2("White", x+a, y);
                     } else {
                        Game2.change_background2("Purple", x+a, y);
                     }
                  } else
                     move = true;
                  continue;
               } else {
                  break;
               }
            }
         } else if (boundary2(x+1, y) && isavailable_2(x, y, x+1, y) == "empty") {
            if(canMove != true) Game2.change_background2("Yellow", x+1, y);
            if (MakeCheck.makecheck(x, y, x+1, y)) {
               if (((x+1) + y) % 2 == 0) {
                  Game2.change_background2("White", x+1, y);
               } else {
                  Game2.change_background2("Purple", x+1, y);
               }
            }
            else move = true;
         }

         if (boundary2(x+1, y-1) && isavailable_2(x, y, x + 1, y - 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x + 1, y - 1);
            if (MakeCheck.makecheck(x, y, x + 1, y - 1)) {
               if (((x + 1) + (y - 1)) % 2 == 0) {
                  Game2.change_background2("White", x + 1, y - 1);
               } else {
                  Game2.change_background2("Purple", x + 1, y - 1);
               }
            }
            else move = true;
         }
         if (boundary2(x+1, y+1) && isavailable_2(x, y, x + 1, y + 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x + 1, y + 1);
            if (MakeCheck.makecheck(x, y, x + 1, y + 1)) {
               if (((x + 1) + (y + 1)) % 2 == 0) {
                  Game2.change_background2("White", x + 1, y + 1);
               } else {
                  Game2.change_background2("Purple", x + 1, y + 1);
               }
            }
            else move = true;
         }
      }
      if (Game2.turn == 2) {
         if (y == 1) {
            for (a = 1; a < 3; a++) {
               if (isavailable_2(x, y, x, y + a) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x, y + a);
                  if (MakeCheck.makecheck(x, y, x, y + a)) {
                     if ((x + (y + a)) % 2 == 0) {
                        Game2.change_background2("White", x, y + a);
                     } else {
                        Game2.change_background2("Purple", x, y + a);
                     }
                  } else
                     move = true;
                  continue;
               } else {
                  break;
               }
            }
         } else if (boundary2(x, y+1) && isavailable_2(x, y, x, y + 1) == "empty") {
            if(canMove != true) Game2.change_background2("Yellow", x, y + 1);
            if (MakeCheck.makecheck(x, y, x, y + 1)) {
               if ((x + (y + 1)) % 2 == 0) {
                  Game2.change_background2("White", x, y + 1);
               } else {
                  Game2.change_background2("Purple", x, y + 1);
               }
            }
            else move = true;
         }

         if (boundary2(x-1, y+1) && isavailable_2(x, y, x - 1, y + 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x - 1, y + 1);
            if (MakeCheck.makecheck(x, y, x - 1, y + 1)) {
               if (((x - 1) + (y + 1)) % 2 == 0) {
                  Game2.change_background2("White", x - 1, y + 1);
               } else {
                  Game2.change_background2("Purple", x - 1, y + 1);
               }
            }
            else move = true;
         }
         if (boundary2(x+1, y+1) && isavailable_2(x, y, x + 1, y + 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x + 1, y + 1);
            if (MakeCheck.makecheck(x, y, x + 1, y + 1)) {
               if (((x + 1) + (y + 1)) % 2 == 0) {
                  Game2.change_background2("White", x + 1, y + 1);
               } else {
                  Game2.change_background2("Purple", x + 1, y + 1);
               }
            }
            else move = true;
         }
      }
      if (Game2.turn == 3) {
         if (x == 12) {
            for (a = 1; a < 3; a++) {
               if (isavailable_2(x, y, x-a, y) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x-a, y);
                  if (MakeCheck.makecheck(x, y, x-a, y)) {
                     if ((x-a + y) % 2 == 0) {
                        Game2.change_background2("White", x-a, y);
                     } else {
                        Game2.change_background2("Purple", x-a, y);
                     }
                  } else
                     move = true;
                  continue;
               } else {
                  break;
               }
            }
         } else if (boundary2(x-1, y) && isavailable_2(x, y, x-1, y) == "empty") {
            if(canMove != true) Game2.change_background2("Yellow", x-1, y);
            if (MakeCheck.makecheck(x, y, x-1, y)) {
               if (((x-1) + y) % 2 == 0) {
                  Game2.change_background2("White", x-1, y);
               } else {
                  Game2.change_background2("Purple", x-1, y);
               }
            }
            else move = true;
         }

         if (boundary2(x-1, y-1) && isavailable_2(x, y, x - 1, y - 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x - 1, y - 1);
            if (MakeCheck.makecheck(x, y, x - 1, y - 1)) {
               if (((x - 1) + (y - 1)) % 2 == 0) {
                  Game2.change_background2("White", x - 1, y - 1);
               } else {
                  Game2.change_background2("Purple", x - 1, y - 1);
               }
            }
            else move = true;
         }
         if (boundary2(x-1, y+1) && isavailable_2(x, y, x - 1, y + 1) == "enemy") {
            if(canMove != true) Game2.change_background2("Yellow", x - 1, y + 1);
            if (MakeCheck.makecheck(x, y, x - 1, y + 1)) {
               if (((x - 1) + (y + 1)) % 2 == 0) {
                  Game2.change_background2("White", x - 1, y + 1);
               } else {
                  Game2.change_background2("Purple", x - 1, y + 1);
               }
            }
            else move = true;
         }
      }
      
      return move;
   }

   public boolean kingCheck(King king) {

      if (Game2.turn==0) {
         if (x - 1 == king.getX() && y - 1 == king.getY()) {
            return true;
         }
         if (x + 1 == king.getX() && y - 1 == king.getY()) {
            return true;
         }
      }

      if (Game2.turn==1) {
         if (x + 1 == king.getX() && y - 1 == king.getY()) {
            return true;
         }
         if (x + 1 == king.getX() && y + 1 == king.getY()) {
            return true;
         }
      }
      
      if (Game2.turn==2) {
          if (x - 1 == king.getX() && y + 1 == king.getY()) {
             return true;
          }
          if (x + 1 == king.getX() && y + 1 == king.getY()) {
             return true;
          }
       }

       if (Game2.turn==3) {
          if (x - 1 == king.getX() && y - 1 == king.getY()) {
             return true;
          }
          if (x - 1 == king.getX() && y + 1 == king.getY()) {
             return true;
          }
       }
      return false;
   }
}