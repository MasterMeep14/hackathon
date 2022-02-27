//Zarak Tareen
//7.2.21
//CSE 142
//TA:Drew Nguyen
//This will print out the space needle with for loops
//It is coded to not have redundancy (there will be some level of redundant code, but they follow the guidelines in the instructions)
//It will be scaleable with the SIZE variable, which is implemented into every part of the design, and follows the instruction in ED

public class SpaceNeedle{
   //size variable that changes the size of the code output as a whole
   public static final int SIZE = 4;
   // main method
   public static void main(String[] args){
      needleTip();
      needleTop();
      needleMid();
      needleDown();
      needleTip();
      needleTower();
      needleTop();
      needleMid();
   }
   
   //This method is the middle tower part. It is made up of the following characters | % ,
   // it needs several different for loops, because as it scales, it changes the actual number of times the method is needed
   // The extra for loop is for the |%|
   public static void needleTower(){
      for(int lines=0; lines < SIZE * SIZE; lines++){
         for (int space= 0; space < SIZE * 2 + 1; space ++){
            System.out.print(" ");
         }
         
         for (int tower = 0; tower< 2; tower++){
            System.out.print("|");
            for (int middle= 0; middle < SIZE - 2; middle ++){
               System.out.print("%");
            }
            System.out.print("|");
         }
         
         System.out.println();
      }
   }

   //The downwards part of the top of the needle
   // made up of \_ to open and _/ to close the shape
   //it is filled up with /\
   //the for loops are for the spaces and /\, because of the scaling
   public static void needleDown(){
      for (int lines = 0; lines < SIZE; lines++){
         for (int space= 0; space < 2 * lines; space ++){
            System.out.print(" ");
         }
         
         System.out.print("\\_");
         for (int space= 0; space < -2 * lines + 3 * SIZE -1; space ++){
            System.out.print("/\\");
         }
         
         System.out.println("_/");
      }
   }

   // The middle of the needle, which is repeated again at the bottom.
   // It has the | character to open and close the method, and is filled with the " character
   // only has one for loop for the " character
   public static void needleMid(){
      System.out.print("|");
      for (int quote= 0; quote < 6 * SIZE; quote ++){
         System.out.print("\"");
      }
      
      System.out.println("|");
   }

   // The top of the needle (not including the tip top), is repeated at the base
   // Has several different components
   // Starts off with __/, then has :, then ||, then : again, then \__ to close
   // It has a for loop for the spaces and the : (both of them) 
   public static void needleTop(){
      for (int lines=0; lines < SIZE; lines++){
         for (int space= 0; space < -3 * lines + SIZE * 3 -3 ; space ++){
            System.out.print(" ");
         }
         
         System.out.print("__/");
         for (int colon= 0; colon < 3 * lines; colon++){
            System.out.print(":");
         }
         
         System.out.print("||");
         for (int colon= 0; colon < 3 * lines; colon ++){
            System.out.print(":");
         }
         
         System.out.println("\\__");
      }
   }

   //the tip of the needle, which is reused at above the middle tower section again in the code
   // is just made up of spaces and |
   // has a for loop for both, which accounts for scaling
   public static void needleTip(){
      for (int lines=0; lines < SIZE; lines++){
         for (int space=0; space< 3 * SIZE; space++){
            System.out.print(" ");
         }
         
         for (int vert=0; vert < 2; vert++){
            System.out.print("|");
         }
         
         System.out.println();
      }
   }
}
