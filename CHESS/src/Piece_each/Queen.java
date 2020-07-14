package Piece_each;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;

public class Queen extends Piece {

   public Queen(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
      // TODO Auto-generated constructor stub
   }

   public Queen() {
      super();
   }

   public boolean validMove(boolean canMove) {

      boolean move = false;
      if(canMove != true) Game.change_background("Pink", x, y);

      for (int a = 1; a < 8; a++) {
         if (x + a < 8) {
            if (isavailable(x + a, y) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x + a, y);
               if (MakeCheck.makecheck(x, y, x + a, y)) {
                  if (((x + a) + y) % 2 == 0) {
                     Game.change_background("White", x + a, y);
                  } else {
                     Game.change_background("Purple", x + a, y);
                  }
               }
               else move = true;
            } else if (isavailable(x + a, y) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x + a, y);
               if (MakeCheck.makecheck(x, y, x + a, y)) {
                  if (((x + a) + y) % 2 == 0) {
                     Game.change_background("White", x + a, y);
                  } else {
                     Game.change_background("Purple", x + a, y);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x - a >= 0) {
            if (isavailable(x - a, y) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x - a, y);
               if (MakeCheck.makecheck(x, y, x - a, y)) {
                  if (((x - a) + y) % 2 == 0) {
                     Game.change_background("White", x - a, y);
                  } else {
                     Game.change_background("Purple", x - a, y);
                  }
               }
               else move = true;
            } else if (isavailable(x - a, y) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x - a, y);
               if (MakeCheck.makecheck(x, y, x - a, y)) {
                  if (((x - a) + y) % 2 == 0) {
                     Game.change_background("White", x - a, y);
                  } else {
                     Game.change_background("Purple", x - a, y);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (y + a < 8) {
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
            } else if (isavailable(x, y + a) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x, y + a);
               if (MakeCheck.makecheck(x, y, x, y + a)) {
                  if ((x + (y + a)) % 2 == 0) {
                     Game.change_background("White", x, y + a);
                  } else {
                     Game.change_background("Purple", x, y + a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (y - a >= 0) {
            if (isavailable(x, y - a) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x, y - a);
               if (MakeCheck.makecheck(x, y, x, y - a)) {
                  if ((x + (y - a)) % 2 == 0) {
                     Game.change_background("White", x, y - a);
                  } else {
                     Game.change_background("Purple", x, y - a);
                  }
               }
               else move = true;
            } else if (isavailable(x, y - a) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x, y - a);
               if (MakeCheck.makecheck(x, y, x, y - a)) {
                  if ((x + (y - a)) % 2 == 0) {
                     Game.change_background("White", x, y - a);
                  } else {
                     Game.change_background("Purple", x, y - a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x + a < 8 && y + a < 8) {
            if (isavailable(x + a, y + a) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x + a, y + a);
               if (MakeCheck.makecheck(x, y, x + a, y + a)) {
                  if (((x + a) + (y + a)) % 2 == 0) {
                     Game.change_background("White", x + a, y + a);
                  } else {
                     Game.change_background("Purple", x + a, y + a);
                  }
               }
               else move = true;
            } else if (isavailable(x + a, y + a) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x + a, y + a);
               if (MakeCheck.makecheck(x, y, x + a, y + a)) {
                  if (((x + a) + (y + a)) % 2 == 0) {
                     Game.change_background("White", x + a, y + a);
                  } else {
                     Game.change_background("Purple", x + a, y + a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x + a < 8 && y - a >= 0) {
            if (isavailable(x + a, y - a) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x + a, y - a);
               if (MakeCheck.makecheck(x, y, x + a, y - a)) {
                  if (((x + a) + (y - a)) % 2 == 0) {
                     Game.change_background("White", x + a, y - a);
                  } else {
                     Game.change_background("Purple", x + a, y - a);
                  }
               }
               else move = true;
            } else if (isavailable(x + a, y - a) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x + a, y - a);
               if (MakeCheck.makecheck(x, y, x + a, y - a)) {
                  if (((x + a) + (y - a)) % 2 == 0) {
                     Game.change_background("White", x + a, y - a);
                  } else {
                     Game.change_background("Purple", x + a, y - a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x - a >= 0 && y + a < 8) {
            if (isavailable(x - a, y + a) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x - a, y + a);
               if (MakeCheck.makecheck(x, y, x - a, y + a)) {
                  if (((x - a) + (y + a)) % 2 == 0) {
                     Game.change_background("White", x - a, y + a);
                  } else {
                     Game.change_background("Purple", x - a, y + a);
                  }
               }
               else move = true;
            } else if (isavailable(x - a, y + a) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x - a, y + a);
               if (MakeCheck.makecheck(x, y, x - a, y + a)) {
                  if (((x - a) + (y + a)) % 2 == 0) {
                     Game.change_background("White", x - a, y + a);
                  } else {
                     Game.change_background("Purple", x - a, y + a);
                  }
               }
               else move = true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x - a >= 0 && y - a >= 0) {
            if (isavailable(x - a, y - a) == "empty") {
               if(canMove != true) Game.change_background("Yellow", x - a, y - a);
               if (MakeCheck.makecheck(x, y, x - a, y - a)) {
                  if (((x - a) + (y - a)) % 2 == 0) {
                     Game.change_background("White", x - a, y - a);
                  } else {
                     Game.change_background("Purple", x - a, y - a);
                  }
               }
               else move = true;
            } else if (isavailable(x - a, y - a) == "enemy") {
               if(canMove != true) Game.change_background("Yellow", x - a, y - a);
               if (MakeCheck.makecheck(x, y, x - a, y - a)) {
                  if (((x - a) + (y - a)) % 2 == 0) {
                     Game.change_background("White", x - a, y - a);
                  } else {
                     Game.change_background("Purple", x - a, y - a);
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

   @Override
   public boolean kingCheck(King king) {
      // TODO Auto-generated method stub

      for (int a = 1; a < 8; a++) {
         if (x + a < 8) {
            if (isavailable(x + a, y) == "empty") {
               if (king.getX() == x + a && king.getY()==y)
                  return true;
            } else if (isavailable(x + a, y) == "enemy") {
               if (king.getX() == x + a && king.getY()==y)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x - a >= 0) {
            if (isavailable(x - a, y) == "empty") {
               if (king.getX() == x - a && king.getY()==y)
                  return true;
            } else if (isavailable(x - a, y) == "enemy") {
               if (king.getX() == x - a && king.getY()==y)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (y + a < 8) {
            if (isavailable(x, y + a) == "empty") {
               if (king.getX()==x && king.getY() == y + a)
                  return true;
            } else if (isavailable(x, y + a) == "enemy") {
               if (king.getX()==x && king.getY() == y + a)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (y - a >= 0) {
            if (isavailable(x, y - a) == "empty") {
               if (king.getX()==x && king.getY() == y - a)
                  return true;
            } else if (isavailable(x, y - a) == "enemy") {
               if (king.getX()==x && king.getY() == y - a)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x + a < 8 && y + a < 8) {
            if (isavailable(x + a, y + a) == "empty") {
               if (king.getX() == x + a && king.getY() == y + a)
                  return true;
            } else if (isavailable(x + a, y + a) == "enemy") {
               if (king.getX() == x + a && king.getY() == y + a)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x + a < 8 && y - a >= 0) {
            if (isavailable(x + a, y - a) == "empty") {
               if (king.getX() == x + a && king.getY() == y - a)
                  return true;
            } else if (isavailable(x + a, y - a) == "enemy") {
               if (king.getX() == x + a && king.getY() == y - a)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x - a >= 0 && y + a < 8) {
            if (isavailable(x - a, y + a) == "empty") {
               if (king.getX() == x - a && king.getY() == y + a)
                  return true;
            } else if (isavailable(x - a, y + a) == "enemy") {
               if (king.getX() == x - a && king.getY() == y + a)
                  return true;
               break;
            } else
               break;
         }
      }

      for (int a = 1; a < 8; a++) {
         if (x - a >= 0 && y - a >= 0) {
            if (isavailable(x - a, y - a) == "empty") {
               if (king.getX() == x - a && king.getY() == y - a)
                  return true;
            } else if (isavailable(x - a, y - a) == "enemy") {
               if (king.getX() == x - a && king.getY() == y - a)
                  return true;
               break;
            } else
               break;
         }
      }
      return false;
   }
}