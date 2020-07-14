package Piece_each2;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;
import Chess_2vs2.Game2;
import Piece_each2.Piece2;

public class Rook2 extends Piece2 {

   public Rook2() {
      super();
   }

   public Rook2(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
   }

   public boolean validMove(boolean canMove) { // true 내 말이 갈 수 있는 곳 색칠 false 상대말이 내 말을 볼 수있는지 다 봐줄거야
      boolean move = false;
      int a;
      if (canMove != true)
         Game2.change_background2("Pink", x, y);

      for (a = 1; a < 8; a++) {
         if (boundary2(x+a, y)) {
            if (isavailable_2(x, y, x + a, y) == "empty") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x + a, y);
               if (MakeCheck.makecheck(x, y, x + a, y)) {
                  if (((x + a) + y) % 2 == 0) {
                     Game2.change_background2("White", x + a, y);
                  } else {
                     Game2.change_background2("Purple", x + a, y);
                  }
               } else
                  move = true;
               continue;
            } else if (isavailable_2(x, y, x + a, y) == "enemy") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x + a, y);
               if (MakeCheck.makecheck(x, y, x + a, y)) {
                  if (((x + a) + y) % 2 == 0) {
                     Game2.change_background2("White", x + a, y);
                  } else {
                     Game2.change_background2("Purple", x + a, y);
                  }
               } else
                  move = true;
               break;
            } else {
               break;
            }
         }
      }

      for (a = 1; a < 8; a++) {
         if (boundary2(x-1, y)) {
            if (isavailable_2(x, y, x - a, y) == "empty") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x - a, y);
               if (MakeCheck.makecheck(x, y, x - a, y)) {
                  if (((x - a) + y) % 2 == 0) {
                     Game2.change_background2("White", x - a, y);
                  } else {
                     Game2.change_background2("Purple", x - a, y);
                  }
               } else
                  move = true;
               continue;
            } else if (isavailable_2(x, y, x - a, y) == "enemy") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x - a, y);
               if (MakeCheck.makecheck(x, y, x - a, y)) {
                  if (((x - a) + y) % 2 == 0) {
                     Game2.change_background2("White", x - a, y);
                  } else {
                     Game2.change_background2("Purple", x - a, y);
                  }
               } else
                  move = true;
               break;
            } else {
               break;
            }
         }
      }

      for (a = 1; a < 8; a++) {
         if (boundary2(x, y+a)) {
            if (isavailable_2(x, y, x, y + a) == "empty") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x, y + a);
               if (MakeCheck.makecheck(x, y, x, y + a)) {
                  if ((x + (y + a)) % 2 == 0) {
                     Game2.change_background2("White", x, y + a);
                  } else {
                     Game2.change_background2("Purple", x, y + a);
                  }
               } else
                  move = true;
               continue;
            } else if (isavailable_2(x, y, x, y + a) == "enemy") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x, y + a);
               if (MakeCheck.makecheck(x, y, x, y + a)) {
                  if ((x + (y + a)) % 2 == 0) {
                     Game2.change_background2("White", x, y + a);
                  } else {
                     Game2.change_background2("Purple", x, y + a);
                  }
               } else
                  move = true;
               break;
            } else {
               break;
            }
         }
      }

      for (a = 1; a < 8; a++) {
         if (boundary2(x, y-a)) {
            if (isavailable_2(x, y, x, y - a) == "empty") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x, y - a);
               if (MakeCheck.makecheck(x, y, x, y - a)) {
                  if ((x + (y - a)) % 2 == 0) {
                     Game2.change_background2("White", x, y - a);
                  } else {
                     Game2.change_background2("Purple", x, y - a);
                  }
               } else
                  move = true;
               continue;
            } else if (isavailable_2(x, y, x, y - a) == "enemy") {
               if (canMove != true)
                  Game2.change_background2("Yellow", x, y - a);
               if (MakeCheck.makecheck(x, y, x, y - a)) {
                  if ((x + (y - a)) % 2 == 0) {
                     Game2.change_background2("White", x, y - a);
                  } else {
                     Game2.change_background2("Purple", x, y - a);
                  }
               } else
                  move = true;
               break;
            } else {
               break;
            }
         }
      }
      return move;
   }

   public boolean kingCheck(King2 king) { // true 내 말이 갈 수 있는 곳 색칠 false 상대말이 내 말을 볼 수있는지 다 봐줄거야
      int a;

      for (a = 1; a < 8; a++) {
         if (boundary2(x+a, y)) {
            if (isavailable_2(x, y, x + a, y) == "empty") {
               if (x + a == king.getX() && y == king.getY()) {
                  return true;
               }
            } else if (isavailable_2(x, y, x + a, y) == "enemy") {
               if (x + a == king.getX() && y == king.getY()) {
                  return true;
               }
               break;
            } else {
               break;
            }
         }
      }

      for (a = 1; a < 8; a++) {
         if (boundary2(x-a, y)) {
            if (isavailable_2(x, y, x - a, y) == "empty") {
               if (x - a == king.getX() && y == king.getY()) {
                  return true;
               }
            } else if (isavailable_2(x, y, x - a, y) == "enemy") {
               if (x - a == king.getX() && y == king.getY()) {
                  return true;
               }
               break;
            } else {
               break;
            }
         }
      }

      for (a = 1; a < 8; a++) {
         if (boundary2(x, y+a)) {
            if (isavailable_2(x, y, x, y + a) == "empty") {
               if (x == king.getX() && y + a == king.getY()) {
                  return true;
               }
            } else if (isavailable_2(x, y, x, y + a) == "enemy") {
               if (x == king.getX() && y + a == king.getY()) {
                  return true;
               }
               break;
            } else {
               break;
            }
         }
      }

      for (a = 1; a < 8; a++) {
         if (boundary2(x, y-a)) {
            if (isavailable_2(x, y, x, y - a) == "empty") {
               if (x == king.getX() && y - a == king.getY()) {
                  return true;
               }
            } else if (isavailable_2(x, y, x, y - a) == "enemy") {
               if (x == king.getX() && y - a == king.getY()) {
                  return true;
               }
               break;
            } else {
               break;
            }
         }
      }

      return false;
   }
}