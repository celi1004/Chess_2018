package Piece_each2;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;
import Chess_2vs2.Game2;
import Piece_each2.King2;
import Piece_each2.Piece2;

public class Knight2 extends Piece2{
   public Piece2 IsAvailable;

   public Knight2() {
      super();
   }

   public Knight2(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
   }

   public boolean validMove(boolean canMove) {

      boolean move = false;
      if(canMove != true) Game2.change_background2("Pink", x, y);
      
      for (int i = 1; i < 3; i++) {
         for (int j = 1; j < 3; j++) {
            if (boundary2(x+i, y+j) && (i + j == 3)) {
               if (isavailable_2(x, y, x+i, y+j) == "enemy" || isavailable_2(x, y, x+i, y+j) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x + i, y + j);
                  if (MakeCheck.makecheck(x, y, x + i, y + j)) {
                     if ((x + y + i + j) % 2 == 0) {
                        Game2.change_background2("White", x + i, y + j);
                     } else {
                        Game2.change_background2("Purple", x + i, y + j);
                     }
                  }
                  else move = true;
               }
            }

            if (boundary2(x-i, y-j)&& (i + j == 3)) {
               if (isavailable_2(x,y,x-i,y-j)== "enemy" || isavailable_2(x,y,x-i,y-j) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x - i, y - j);
                  if (MakeCheck.makecheck(x, y, x - i, y - j)) {
                     if ((x + y - i - j) % 2 == 0) {
                        Game2.change_background2("White", x - i, y - j);
                     } else {
                        Game2.change_background2("Purple", x - i, y - j);
                     }
                  }
                  else move = true;
               }
            }
            if ( boundary2(x+i, y-j) && (i + j == 3)) {
               if (isavailable_2(x,y,x+i,y-j) == "enemy" || isavailable_2(x,y,x+i,y-j) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x + i, y - j);
                  if (MakeCheck.makecheck(x, y, x + i, y - j)) {
                     if ((x + y + i - j) % 2 == 0) {
                        Game2.change_background2("White", x + i, y - j);
                     } else {
                        Game2.change_background2("Purple", x + i, y - j);
                     }
                  }
                  else move = true;
               }
            }
            if (boundary2(x-i, y+j)&& (i + j == 3)) {
               if (isavailable_2(x,y,x-i,y+j) == "enemy" || isavailable_2(x,y,x-i,y+j) == "empty") {
                  if(canMove != true) Game2.change_background2("Yellow", x - i, y + j);
                  if (MakeCheck.makecheck(x, y, x - i, y + j)) {
                     if ((x + y - i - j) % 2 == 0) {
                        Game2.change_background2("White", x - i, y + j);
                     } else {
                        Game2.change_background2("Purple", x - i, y + j);
                     }
                  }
                  else move = true;
               }
            }
         }
      }
      
      return move;
   }

   public boolean kingCheck(King2 king) {
      for (int i = 1; i < 3; i++) {
         for (int j = 1; j < 3; j++) {
            if ( x + i < 8 &&  y + j < 8 && (i + j == 3)) {
               if (isavailable_2(x,y,x+i,y+j) == "enemy" || isavailable_2(x,y,x+i,y+j) == "empty") {
                  if (king.getX() == x + i && king.getY() == y + j) {
                     return true;
                  }
               }
            }
            if (x - i >= 0 && y - j >= 0 && (i + j == 3)) {
               if (isavailable_2(x,y,x-i,y-j) == "enemy" || isavailable_2(x,y,x-i,y-j) == "empty") {
                  if (king.getX() == x - i && king.getY() == y - j) {
                     return true;
                  }
               }
            }
            if ( x + i < 8 && y - j >= 0 && (i + j == 3)) {
               if (isavailable_2(x,y,x+i,y-j) == "enemy" || isavailable_2(x,y,x+i,y-j)== "empty") {
                  if (king.getX() == x + i && king.getY() == y - j) {
                     return true;
                  }
               }
            }
            if (x - i >= 0  &&  y + j < 8 && (i + j == 3)) {
               if (isavailable_2(x,y,x-i,y+j) == "enemy" || isavailable_2(x,y,x-i,y+j) == "empty") {
                  if (king.getX() == x - i && king.getY() == y + j) {
                     return true;
                  }
               }
            }
         }
      }
      return false;
   }

}