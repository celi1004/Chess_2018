package Piece_each2;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;
import Chess_2vs2.Game2;
import Piece_each2.Piece2;

public class Bishop2 extends Piece2 {

   public Bishop2(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
      // TODO Auto-generated constructor stub
   }

   public Bishop2() {
      super();
   }

   public boolean validMove(boolean canMove) {
      // TODO Auto-generated method stub
      // 이동가능한 칸을 노란색으로 바꾸기
      boolean move = false;
      if(canMove != true) Game2.change_background2("Pink", x, y);

      for (int a = 1; a < 8; a++) {
         if (boundary2(x+a, y+a)) {
            if (isavailable_2(x, y, x + a, y + a) == "empty") {
               if(canMove != true) Game2.change_background2("Yellow", x + a, y + a);
               if (MakeCheck.makecheck(x, y, x + a, y + a)) {
                  if (((x + a) + (y + a)) % 2 == 0) {
                     Game2.change_background2("White", x + a, y + a);
                  } else {
                     Game2.change_background2("Purple", x + a, y + a);
                  }
               }
               else move = true;

            } else if (isavailable_2(x, y, x + a, y + a) == "enemy") {
               if(canMove != true) Game2.change_background2("Yellow", x + a, y + a);
               if (MakeCheck.makecheck(x, y, x + a, y + a)) {
                  if (((x + a) + (y + a)) % 2 == 0) {
                     Game2.change_background2("White", x + a, y + a);
                  } else {
                     Game2.change_background2("Purple", x + a, y + a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (boundary2(x+a, y-a)) {
            if (isavailable_2(x, y,x + a, y - a) == "empty") {
               if(canMove != true) Game2.change_background2("Yellow", x + a, y - a);
               if (MakeCheck.makecheck(x, y, x + a, y - a)) {
                  if (((x + a) + (y - a)) % 2 == 0) {
                     Game2.change_background2("White", x + a, y - a);
                  } else {
                     Game2.change_background2("Purple", x + a, y - a);
                  }
               }
               else move = true;
            } else if (isavailable_2(x, y, x + a, y - a) == "enemy") {
               if(canMove != true) Game2.change_background2("Yellow", x + a, y - a);
               if (MakeCheck.makecheck(x, y, x + a, y - a)) {
                  if (((x + a) + (y - a)) % 2 == 0) {
                     Game2.change_background2("White", x + a, y - a);
                  } else {
                     Game2.change_background2("Purple", x + a, y - a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (boundary2(x-a, y+a)) {
            if (isavailable_2(x, y, x - a, y + a) == "empty") {
               if(canMove != true) Game2.change_background2("Yellow", x - a, y + a);
               if (MakeCheck.makecheck(x, y, x - a, y + a)) {
                  if (((x - a) + (y + a)) % 2 == 0) {
                     Game2.change_background2("White", x - a, y + a);
                  } else {
                     Game2.change_background2("Purple", x - a, y + a);
                  }
               }
               else move = true;
            } else if (isavailable_2(x, y, x - a, y + a) == "enemy") {
               if(canMove != true) Game2.change_background2("Yellow", x - a, y + a);
               if (MakeCheck.makecheck(x, y, x - a, y + a)) {
                  if (((x - a) + (y + a)) % 2 == 0) {
                     Game2.change_background2("White", x - a, y + a);
                  } else {
                     Game2.change_background2("Purple", x - a, y + a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (boundary2(x-a, y-a)) {
            if (isavailable_2(x, y, x - a, y - a) == "empty") {
               if(canMove != true) Game2.change_background2("Yellow", x - a, y - a);
               if (MakeCheck.makecheck(x, y, x - a, y - a)) {
                  if (((x - a) + (y - a)) % 2 == 0) {
                     Game2.change_background2("White", x - a, y - a);
                  } else {
                     Game2.change_background2("Purple", x - a, y - a);
                  }
               }
               else move = true;
            } else if (isavailable_2(x, y, x - a, y - a) == "enemy") {
               if(canMove != true) Game2.change_background2("Yellow", x - a, y - a);
               if (MakeCheck.makecheck(x, y, x - a, y - a)) {
                  if (((x - a) + (y - a)) % 2 == 0) {
                     Game2.change_background2("White", x - a, y - a);
                  } else {
                     Game2.change_background2("Purple", x - a, y - a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }
      return move;
   }

   public boolean kingCheck(King2 king) {
      // TODO Auto-generated method stub
      // white = true, black = false

      for (int a = 1; a < 8; a++) {
         if (boundary2(x+a,y+a)) {

            if (isavailable_2(x, y, x + a, y + a) == "empty") {
               if (king.getX() == x + a && king.getY() == y + a) {
                  return true;
               }
            } else if (isavailable_2(x, y, x + a, y + a) == "enemy") {
               if (king.getX() == x + a && king.getY() == y + a) {
                  return true;
               }
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (boundary2(x+a,y-a)) {
            if (isavailable_2(x, y, x + a, y - a) == "empty") {
               if (king.getX() == x + a && king.getY() == y - a) {
                  return true;
               }
            } else if (isavailable_2(x, y, x + a, y - a) == "enemy") {
               if (king.getX() == x + a && king.getY() == y - a) {
                  return true;
               }
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (boundary2(x-a, y+a)) {
            if (isavailable_2(x, y, x - a, y + a) == "empty") {
               if (king.getX() == x - a && king.getY() == y + a) {
                  return true;
               }
            } else if (isavailable_2(x, y, x - a, y + a) == "enemy") {
               if (king.getX() == x - a && king.getY() == y + a) {
                  return true;
               }
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (boundary2(x-a,y-a)) {
            if (isavailable_2(x, y, x - a, y - a) == "empty") {
               if (king.getX() == x - a && king.getY() == y - a) {
                  return true;
               }
            } else if (isavailable_2(x, y, x - a, y - a) == "enemy") {
               if (king.getX() == x - a && king.getY() == y - a) {
                  return true;
               }
               break;
            } else
               break;
         }
      }
      return false;
   }
}
