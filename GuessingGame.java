import java.util.*;
//
//
//
//
//Zarak Tareen
//8.4.21
//CSE 142
//TA:Drew Nguyen
//This program is a guessing game with the user
//Java creates a random number between two values, then
//It constantly asks the user for a number between those two values
//Java will guide the user to the answer until the user gets there, where
//the user is asked if they still want to continue playing
//the program starts off with a haiku
public class GuessingGame {
   public static final int MAX_VALUE = 100;
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Random rand = new Random();
      haiku();
      
      boolean response = true;
      int loopNum = 0;
      int guessNum = 0;
      int totalGuess = 0;
      int lowestGuess = 10000000;
      while(response){
         guessNum = guessing(rand, console);
         totalGuess += guessNum;
         response = yes(console, guessNum);
         loopNum++;
         if (guessNum < lowestGuess){
            lowestGuess = guessNum;
         }
      }
      results(loopNum, totalGuess, lowestGuess);
      
   }
   
   
   // This method is the final message in the program
   // The method prints out your results, such as your number of 
   // Games, total guesses, and other things of that nature
   // One of the numbers in this is rounded to the nearest tens place, and to do this i 
   // Multipied it by 10, then divided it by 10, then used the math.round function,
   // The parameters passed in here are loopNum (for the total games), 
   // GuessNum (for the total guesses), and lowestGuess (for the best game)
   public static void results(int loopNum, int guessNum, int lowestGuess){
      System.out.println("Overall results:");
      System.out.println("Total games   = " + loopNum);
      System.out.println("Total guesses = " + guessNum);
      double ratio = guessNum/(double)loopNum;
      System.out.println("Guesses/game  = " + (Math.round((ratio) * 10.0) / 10.0));
      System.out.println("Best game     = " + lowestGuess);
   }
   
   
   
   // This method is the part of the program that occurs when you guess the correct number
   // The parameters passed in here are the console (for the user input) and guessNum (to print out the number of guesses it takes you to solve it)
   // the return in this method is a boolean true/false for whether or not you want to continue playing another game
   // there is an if/else statement for if you got it right in on the first try (if that's true you have to say guess rather than guesses)

   public static boolean yes(Scanner console, int guessNum){      
      System.out.print("Do you want to play again? ");
      String response = console.next();
      System.out.println();
      response = response.toLowerCase();
      return response.startsWith("y");
   }
   
   //This method is the bulk of the code, as it is the actual guessing part of the code
   //The parameters passed in are a random rand (to generate the random number) and the scanner console (for user input)
   //The thing that is returned from here is the int guessNum (so that later in the program we can use it)
   // To start off, a random number is generated within the range (has a +1 to make it inclusive) 
   // And while the guess that the user gives is not equal to the random number, we will make them keep guessing
   // We also have a guessNum number that goes up every time the user guesses, and is eventually returned
   public static int guessing(Random rand, Scanner console){
      System.out.println("I'm thinking of a number between 1 and " + MAX_VALUE + "...");
      int randomNum = rand.nextInt(MAX_VALUE) + 1;
      
      int guessNum = 0;
      int userNum =  -1;
      while (userNum != randomNum){
         System.out.print("Your guess? ");
         userNum = console.nextInt();
         if (userNum > randomNum){
            System.out.println("It's lower.");
         }
         else if (userNum < randomNum){
            System.out.println("It's higher.");
         }
         guessNum++;
      }
      if (guessNum <= 1) {
         System.out.println("You got it right in " + guessNum + " guess!");
         
      } else{
         System.out.println("You got it right in " + guessNum + " guesses!");
         
      }
      return guessNum;
   }
   
   
   //Just an introductory haiku talking about the game itself
   public static void haiku(){
      System.out.println("Guessing the number");
      System.out.println("Fun yet very hard to do");
      System.out.println("Go ahead and try");
      System.out.println();
   }
   
   
}


