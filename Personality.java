import java.util.*;
import java.io.*;

//Zarak Tareen
//8.9.21
//CSE 142
//TA:Drew Nguyen
//the purpose of this program is to 
//interpret a file, and determine a personality from it.
//the file is a series of A and B's written out, which
//is then interpreted by the code which spits out an output based
//on the content within the imported file
//It will give you a 4 letter word which is based on the number
//of a or b responses you gave in a certain category
//along with that it gives the percentage of of A/B answers you
//had in a certain category

public class Personality {
   public static final int DIMENSIONS = 4;   
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      intro();
      //decided to keep the input and output file prompts because
      //main is supposed to be like an index of your code, and also
      //adding them into seperate methods would be redundant and unnecesary
      System.out.print("input file name? ");
      String fileName = console.nextLine();
      File inputF = new File(fileName);
      Scanner fileScan = new Scanner(inputF);
      System.out.print("output file name? ");
      String outfileName = console.nextLine();
      File outputF = new File(outfileName);
      PrintStream outputFile = new PrintStream(outputF); 
      while(fileScan.hasNext()){
         String name = fileScan.nextLine();
         outputFile.print( name + ": ");
         
         String processStr = fileScan.nextLine();
         int[] a = interpretFile(processStr.toUpperCase() , 'A');
         int[] b = interpretFile(processStr.toUpperCase() , 'B');
         int[] percentage = getPercentage(a,b);
         String personality = getPersonality(percentage);
         outputFile.println(Arrays.toString(percentage) + " = " +  personality);
      }
   }
   
   //This part of the code is to print out the final 4 letter
   //sorta acronym thing. The letters in it are based on your input file
   //It has a string that adds letters based on the info you give it
   //and dependant on what that info is, it adds letters to that string,
   //then returns that string
   //It takes in the parameter percentage (data)
   //It returns the string with your letters
   //Uses a different method to do this
      public static String getPersonality(int[] percentage){
      String ret = "";
      ret = ret + spelling('I', 'E', 0, percentage);
      ret = ret + spelling('N','S', 1, percentage);
      ret = ret + spelling('F','T', 2, percentage);
      ret = ret + spelling('P','J', 3, percentage);
      return ret;
   }
   
   //This method is used to execute the code talked about earlier
   //it takes in the parameters
   //letter1, letter2, index, ret, and percentage
   //letter1 and 2 are just to add the correct letter to the string
   //because those letters are different at various indexes
   //index is just to decide what index you are at
   //string ret is to add the character to the string before returning it
   //int percentage is to know what letter to add, hence the if else statements
   //It returns the string back to the other method (getPersonality) when completed
   public static String spelling(char letter1, char letter2, int index, int percentage[]){
      if(percentage[index]>50){
         return String.valueOf(letter1);
      } else if (percentage[index]==50){
         return String.valueOf('X');
      }
      else{
         return String.valueOf(letter2);
      }
   }
   
   
   //this method is for calculating the percentages at
   //each index, which is used later in the code
   //this method takes in the parameters a and b, in order
   //to calculate the percetage of each in the responses
   //it returns the percentages at each index when completed
   public static int[] getPercentage(int[] a, int[] b){
       int[] percentage = new int[DIMENSIONS];
       for(int i=0; i<DIMENSIONS; i++){
           percentage[i] = (int) Math.round((b[i]*100.0)/(a[i]+b[i]));
       }
       return percentage;
   }
   
   //this part of the code is meant to interpret the input file
   //it interprets either the letter a or b
   //it makes an array and then returns that array when finished
   //it uses a different method to process the info, but makes the
   //array right here.
   //it takes in the string input as a parameter, which it then
   //processes and makes into an array, and also takes in a
   //parameter char c, which is a char that decides whether
   //it is doing the letter A or B
   public static int[] interpretFile(String input, char currentChar){
   //replace aArray with aArray
      int[] aArray = new int[DIMENSIONS];
      aArray = processInfo(input,aArray, currentChar, 0,0);
      aArray = processInfo(input,aArray, currentChar, 1,1);
      aArray = processInfo(input,aArray, currentChar, 2,1);
      aArray = processInfo(input,aArray, currentChar, 3,2);
      aArray = processInfo(input,aArray, currentChar, 4,2);  
      aArray = processInfo(input,aArray, currentChar, 5,3);
      aArray = processInfo(input,aArray, currentChar, 6,3);
      return aArray;
   }
   
   
   
   //this method is meant to process the info given t o it
   //it takes in a start index character (ex 1), then jumps
   //to the character 7 digits away (in this case 8)
   //it does that until it has no more characters 7 ahead in the string.
   //it does this in a for loop and runs until it doesn't have any more stuff
   //it then returns the array
   //the parameters it takes in are input, array, c, start, and index
   //it uses input and array to have the actual string and the array used
   //it has char c to know which character to look for
   //it has int start to know what start number to have
   //and it has int index to know which index to use
   public static int[] processInfo(String input, int[] array, char currentChar, int start, int index){
      for(int i=start; i < input.length(); i=i+7){
         if(input.charAt(i) == currentChar){
            array[index] = array[index]+1;
         }
      }
      return array;
   }
   
   
   
   //introdocuctory statment
   //just gets the user aware of the code and how it works
   //pretty self explanitory
   public static void intro(){
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter. It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
      System.out.println();
   }
}