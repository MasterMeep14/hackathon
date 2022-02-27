//Zarak Tareen
//7.2.21
//CSE 142
//TA:Drew Nguyen
//this code will produce a rug that I designed
//I will use different for loops to make an rug, with various methods, and other things
//It fits all the requirements for code, listed in the instructions

public class AsciiArt{
   public static void main(String[] args){
      System.out.print("This is a rug that I designed and printed out in Java");
      topTap();
      topCar();
      midCar();
      bottomCar();
      topCar();
      midCar();
      bottomCar();
      bottomTap();
   }
   
      public static void bottomTap(){
         for (int line=0; line<=6 ; line++){
            for (int i=0; i< 1 * line +1; i++){
               System.out.print(" ");
               }
            System.out.print("\\");
            for (int i=0; i< -2 * line +12; i++){
               System.out.print(" ");
            }
            System.out.print("/");
            for (int i=0; i< line * 2; i++){
               System.out.print(" ");
            }
            System.out.println();
         }
         
      }
   
   public static void bottomCar(){
      for (int line=0 ; line <= 4; line++){
         for (int i=0; i< 1; i++){
            System.out.print("|");
         }
         for (int i=0; i< -1 * line + 4; i++){
            System.out.print(" ");
         }
         for (int i=0; i< 1; i++){
            System.out.print("/");
         }
         for (int i=0; i< 2* line + 4; i++){
            System.out.print(".");
         }
         for (int i=0; i< 1; i++){
            System.out.print("\\");
         }

         for (int i=0; i< -1 * line + 4 ; i++){
            System.out.print(" ");
         }
         for (int i=0; i< 1; i++){
            System.out.print("|");
         }
         System.out.println();     
      
      
      }
   }
   
      public static void midCar(){
      for (int line=0 ; line <= 5; line++){
         for (int i=0; i< 1; i++){
            System.out.print("|");
         }
         for (int i=0; i< 1; i++){
            System.out.print("----|");
         }
         for (int i=0; i< 1; i++){
            System.out.print("____|");
         }
         for (int i=0; i< 1; i++){
            System.out.print("----|");
         }
         System.out.println();
      }
   
   
   }
   
   
   
   
   
   
   
   public static void topCar(){
      for (int line=0 ; line <= 4; line++){
         for (int i=0; i< 1; i++){
            System.out.print("|");
         }
         for (int i=0; i< 1 * line; i++){
            System.out.print(" ");
         }
         for (int i=0; i< 1; i++){
            System.out.print("\\");
         }
         for (int i=0; i< -2* line + 12; i++){
            System.out.print(".");
         }
         for (int i=0; i< 1; i++){
            System.out.print("/");
         }
         for (int i=0; i< 1 * line ; i++){
            System.out.print(" ");
         }
         for (int i=0; i< 1; i++){
            System.out.print("|");
         }
         System.out.println();     
      
      
      }
   
   
   }
   
   public static void topTap(){
         for (int line=0; line<=6 ; line++){
            for (int i=0; i< -1 * line + 7; i++){
               System.out.print(" ");
               }
            System.out.print("/");
            for (int i=0; i< line * 2; i++){
               System.out.print(" ");
            }
            System.out.print("\\");
            for (int i=0; i< -1 * line + 7; i++){
               System.out.print(" ");
            }
            System.out.println();
         
         }
                  for (int i=0; i< 3; i++){
            System.out.print("|----");
         }
         System.out.print("|");
         System.out.println();
         
      }
     
}