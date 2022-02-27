//Zarak Tareen
//6.23.21
//CSE 142
//TA:Drew Nguyen
//The purpose of this code is to make encrypted messages and letters
//The code starts off with an introduction, and an explination
//It then asks for a shared password/key which is encrypted
//Then the user is asked how long the message is, and types in the amount of words they need encrypted
//You type in all of your words, which are encrypted, and then the program finishes with a closing statement

import java.util.*;

public class EncryptionMachine {
  public static final int SHIFT = 18;
   public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
 
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      intro();
      keyIntro();
      key(console);
      message(console);
      ending();
   }
   
   //This code is just the ending message for the program
   public static void ending() {
      System.out.println();
      System.out.println("Message fully encrypted. Happy secret messaging!");
   }
   
   //This part of the code that does the actual letter part
   //it starts off by asking the number of words, then it encrypts all of those words
   //it uses a for loop to do the action a certain amount of time
   //The parameter used was a scanner (console)
   //This is because that's how you use the console, and the instructions state that you have to use the scanner as a console
   public static void message(Scanner console) {
      System.out.print("How many words is your message? ");
      int wordNum =  Integer.valueOf(console.next());
      for (int i=0; i < wordNum; i++){
         System.out.print("  Next word: ");
         String word = console.next();
         System.out.print("    " + "\"" + word + "\"" + " has been encrypted to: " );
         encryptWord(word, ALPHABET);
         System.out.println();
      }
      
   }
   
      
   //This part of the program that does the key
   //it has the key
   //It asks for the key, then encrypts the key and has some println statments, and also uses the scanner console
   //The purpose of the scanner is for the user input statements, and to make the code run smoothly with no errors
   public static void key(Scanner console) {
      String key = console.next();
      System.out.print("    " + "\"" + key + "\"" +  " has been encrypted to: ");
      encryptWord(key, ALPHABET);
      System.out.println();
      System.out.println();
      
   }
   
   
   //The purpose of this method is just to have some context for the user
   //It's so that the user isn't confused as to what to do or how the program works
   public static void keyIntro() {
      System.out.println("Encrypted messages use a shared keyword to decrypt.");
      System.out.print("  Enter key: ");
      
   }
   
   //Just a general introduction to the program as a whole
   //some introductory statements as to what's going on, the name of the program, and what the program itself does
   //Overall just some basic context for the user
   public static void intro() {
      System.out.println("Welcome to the CSE142 Encryption Machine");
      System.out.println("The program lets you encrypt a message");
      System.out.println("with a key for your recipient to decrypt!");
      System.out.println();
      
   }
   
   //This method is to encrypt a single word, which is used throughout the program
   //It feeds off of the method which is to encrypt a single letter
   //it uses a for loop to repeat it enough times to spell out the given word
   //The purpose of the first parameter is to import the information that we need
   //The first parameter is the thing being encrypted
   //The second parameter is for the alphabet, which allows us to use our shift constant to actually do the encrypting
   //The method uses different things, such as charAt and a for loop to complete this
   public static void encryptWord(String key, String ALPHABET) {
      for(int i = 0; i < key.length(); i++){
         encryptletter(key.charAt(i), ALPHABET);
      }
   }
   
   
   //This is the method for encrypting a single letter
   //In order to encrypt a single letter, i used several things such as indexOf and charAt, to make the encyption happen
   //the encryption is by a set SHIFT, and basically just takes the letter, encrypts it, then spits it back out
   //The purpose of the first parameter is to have the acutal information on what to encrypt, and to actually have something to use the code on
   //The purpsoe of the second parameter is to have the alphabet available, as that is how we are performing a shift
   //We are shifting the CharAt value for the given parameter, then spitting that info back out to the word method
   //which then spits out the final encrypted product into whatever other method it is a part of, which is then put into main
   public static void encryptletter(char test, String ALPHABET) {
      int index = ALPHABET.indexOf(test);
      index = (index + SHIFT)%ALPHABET.length();
      System.out.print(ALPHABET.charAt(index));
   }
   
   
}