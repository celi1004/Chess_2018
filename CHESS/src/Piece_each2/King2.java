package Piece_each2;

import Chess_1vs1.Game;
import Chess_1vs1.MakeCheck;
import Chess_2vs2.Game2;
import Piece_each2.Piece2;

public class King2 extends Piece2{
   public Piece2 IsAvailable;

      public King2() {
         super();
      }

      public King2(boolean valid, String color, int x, int y) {
         super(valid, color, x, y);
      }

      public boolean validMove(boolean canMove) {

         boolean move = false;
         if(canMove != true) Game2.change_background2("Pink", x, y);

         for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 2; b++) {
               if (boundary2(x+a, y+b)) {
                  if (isavailable_2(x, y, x+a, y+b)== "enemy" || isavailable_2(x, y, x+a, y+b) == "empty") {
                     System.out.println("dmdd");
                	 if(canMove != true) Game2.change_background2("Yellow", x + a, y + b);
                     if (MakeCheck.makecheck(x, y, x + a, y + b)) {
                        if ((x + y + a + b) % 2 == 0) {
                           Game2.change_background2("White", x + a, y + b);
                        } else {
                           Game2.change_background2("Purple", x + a, y + b);
                        }
                     }
                     else move = true;
                  }
               }

               if (boundary2(x-a, y-b)) {
                  if (isavailable_2(x, y, x-a, y-b) == "enemy" || isavailable_2(x, y, x-a, y-b) == "empty") {
                     if(canMove != true) Game2.change_background2("Yellow", x - a, y - b);
                     if (MakeCheck.makecheck(x, y, x - a, y - b)) {
                        if ((x + y - a - b) % 2 == 0) {
                           Game2.change_background2("White", x - a, y - b);
                        } else {
                           Game2.change_background2("Purple", x - a, y - b);
                        }
                     }
                     else move = true;
                  }
               }
               
               if (boundary2(x+a, y-b) && a!=0 && b!=0) {
                  if (isavailable_2(x, y, x+a, y-b) == "enemy" || isavailable_2(x, y, x+a, y-b) == "empty") {
                     if(canMove != true) Game2.change_background2("Yellow", x + a, y - b);
                     if (MakeCheck.makecheck(x, y, x + a, y - b)) {
                        if ((x + y + a - b) % 2 == 0) {
                           Game2.change_background2("White", x + a, y - b);
                        } else {
                           Game2.change_background2("Purple", x + a, y - b);
                        }
                     }
                     else move = true;
                  }
               }
               
               if (boundary2(x-a, y+b) && a!=0 && b!=0) {
                  if (isavailable_2(x, y, x-a, y+b)== "enemy" || isavailable_2(x, y, x-a, y+b) == "empty") {
                     if(canMove != true) Game2.change_background2("Yellow", x - a, y + b);
                     if (MakeCheck.makecheck(x, y, x - a, y + b)) {
                        if ((x + y - a + b) % 2 == 0) {
                           Game2.change_background2("White", x - a, y + b);
                        } else {
                           Game2.change_background2("Purple", x - a, y + b);
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