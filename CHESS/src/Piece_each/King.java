package Piece_each;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;


public class King extends Piece {

   public Piece IsAvailable;

   public King() {
      super();
   }

   public King(boolean valid, String color, int x, int y) {
      super(valid, color, x, y);
   }

   public boolean validMove(boolean canMove) {

      boolean move = false;
      if(canMove != true) Game.change_background("Pink", x, y);

      for (int a = 0; a < 2; a++) {
         for (int b = 0; b < 2; b++) {
            if (x + a < 8 && y + b < 8 && a + b >0) {
               if (isavailable(x + a, y + b) == "enemy" || isavailable(x + a, y + b) == "empty") {
                  if(canMove != true) Game.change_background("Yellow", x + a, y + b);
                  if (MakeCheck.makecheck(x, y, x + a, y + b)) {
                     if ((x + y + a + b) % 2 == 0) {
                        Game.change_background("White", x + a, y + b);
                     } else {
                        Game.change_background("Purple", x + a, y + b);
                     }
                  }
                  else move = true;
               }
            }

            if (x - a >= 0 && y - b >= 0 && a + b >0 ) {
               if (isavailable(x - a, y - b) == "enemy" || isavailable(x - a, y - b) == "empty") {
                  if(canMove != true) Game.change_background("Yellow", x - a, y - b);
                  if (MakeCheck.makecheck(x, y, x - a, y - b)) {
                     if ((x + y - a - b) % 2 == 0) {
                        Game.change_background("White", x - a, y - b);
                     } else {
                        Game.change_background("Purple", x - a, y - b);
                     }
                  }
                  else move = true;
               }
            }
            
            if (x + a < 8 && y - b >= 0 && a!=0 && b!=0) {
               if (isavailable(x + a, y - b) == "enemy" || isavailable(x + a, y - b) == "empty") {
                  if(canMove != true) Game.change_background("Yellow", x + a, y - b);
                  if (MakeCheck.makecheck(x, y, x + a, y - b)) {
                     if ((x + y + a - b) % 2 == 0) {
                        Game.change_background("White", x + a, y - b);
                     } else {
                        Game.change_background("Purple", x + a, y - b);
                     }
                  }
                  else move = true;
               }
            }
            
            if (x - a >= 0 && y + b < 8 && a!=0 && b!=0) {
               if (isavailable(x - a, y + b) == "enemy" || isavailable(x - a, y + b) == "empty") {
                  if(canMove != true) Game.change_background("Yellow", x - a, y + b);
                  if (MakeCheck.makecheck(x, y, x - a, y + b)) {
                     if ((x + y - a + b) % 2 == 0) {
                        Game.change_background("White", x - a, y + b);
                     } else {
                        Game.change_background("Purple", x - a, y + b);
                     }
                  }
                  else move = true;
               }
            }
         }
      }
      return move;
   }

}