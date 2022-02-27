//Zarak Tareen
//6.23.21
//CSE 142
//TA:Drew Nguyen
//This program is meant to take in ceratain files 
//and then interpret them, and output them.
//all of which is dictated by user input.
//it starts off with an intro message, then runs the program
//The program ends when you type in "q" for quit
//And the program runs different actions until that happens
import java.util.*;
import java.io.*;

public class YazInterpreter {
   public static void main(String[] arg) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      introMessage();
      interpret(console);
   }
   
   //Just a simple introductory message for the user
   //Lets them know what the program is about
   public static void introMessage(){
      System.out.println("Welcome to YazInterpreter!");
      System.out.println("You may interpret a YazLang program and output");
      System.out.println("the results to a file or view a previously");
      System.out.println("interpreted YazLang program.");
      System.out.println();
   }
   
   
   //This method is meant to interpret files that are for temperature
   //The method takes in a parameter of lineScanner in order to get all
   //of the information that it needs.
   //The program returns the string convertTemp when finished
   public static String convertTemp(Scanner lineScanner){
      int temp = lineScanner.nextInt();
      String unit = lineScanner.next();
      String convertTemp;
      if(unit.equals("C")){
         int tempF = (int)(1.8 * temp + 32);
         convertTemp = String.valueOf((int)tempF) + "F";
      }
      else{
         int tempC = (int)((temp - 32)/1.8);
         convertTemp = String.valueOf((int)tempC) + "C";
      }
      return convertTemp;
   }
   
   
   //This method is meant to interpret files that are for range
   //The method takes in a parameter of lineScanner to get all of the ints that
   //the program needs to work
   //inside the method is a for loop which adds all of the correct characters/information
   //to the string range
   //The program returns the string range when finished
   public static String rangePrint(Scanner lineScanner){
      int start = lineScanner.nextInt();
      int end = lineScanner.nextInt();
      int step = lineScanner.nextInt();
      String range ="";
      for(int i = start; i<end; ){
         range += i + " ";
         i +=step;
      }
      return range;
      
   }
   
   
   //This method is meant to interpret files that are for repeat
   //The method takes in a parameter of lineScanner to get all of the ints that
   //the program needs to work
   //in order to make the program work, i use a for loop which adds to the string
   //all of the interpreted code.
   //in order to make the code peforms correctly, I used substring and replace
   //It returns the string returnStr (the final output)
   public static String repeat(Scanner lineScanner){
      String returnStr = "";
      while(lineScanner.hasNext()){
         String rep = lineScanner.next();
         int repLength = rep.length() - 1;
         rep = rep.substring(1, repLength);
         rep = rep.replace("_", " ");
         int repCount = lineScanner.nextInt();
         for(int j=0; j<repCount; j++){
            returnStr += rep;
         }
      }
      return returnStr;
   }
   
   //This is a method that was repeated many times throughout the code, and falls
   //under the umbrella of redundancy
   //It is the simple prompt of what action you want to run with the code, which
   //occurs until you enter Q to quit the code
   //It takes in the parameter scanner console for the user input
   //It returns the choice that the user gives back to the part of the code it was used at
   public static String getChoice(Scanner console){
      System.out.print("(I)nterpret YazLang program, (V)iew output, (Q)uit? ");
      String choice = console.nextLine();
      choice = choice.toUpperCase();
      return choice;
   }
   
   //This part of the code is where the bulk of the program is made
   //you have to put "throws fileNotfoundexception" here in order to
   //minimize the number of errors the program can produce
   //this part of the code takes in the scanner console for user input, along
   //with other things
   //inside of this code is a while loop that runs until the user inputs the 
   //letter q to quit the program
   //within that while loop are the options for if the user puts in either I or V
   //If the user puts I the program will interpret the given file
   //If the user puts V, the viewer can view their interpreted file
   //If the user does not put either I,V, or Q the user is re prompted for a
   //valid answer
   public static void interpret(Scanner console) throws FileNotFoundException{
      String choice = getChoice(console);
      String outputfileName = "";
      String fileName = "";
      while (!choice.equals("Q")) {
         if (choice.equals("I")) {
            inputFile(console);
            while(!f.exists()){
               System.out.print("File not found. Try again: ");
               fileName = console.nextLine();
               f = new File(fileName);
            } 
               Scanner input = new Scanner(f);
               System.out.print("Output file name: ");
               outputfileName = console.nextLine();
               PrintStream outputfile = new PrintStream(new File(outputfileName));
               while (input.hasNext()) {
                  String line = input.nextLine();
                  Scanner lineScanner = new Scanner(line);
                  String yazCommand = lineScanner.next();
                  if (yazCommand.equals("CONVERT")){
                     String convertTemp = convertTemp(lineScanner);
                     outputfile.println(convertTemp);
                  } else if (yazCommand.equals("REPEAT")){
                     String ret = repeat(lineScanner);
                     outputfile.println(ret);
                  } else if (yazCommand.equals("RANGE")){
                     String ret = rangePrint(lineScanner);
                     outputfile.println(ret);
                  }
               }
         System.out.println("YazLang interpreted and output to a file!");
         System.out.println();
         choice = getChoice(console);  
         } else if (choice.equals("V")) {
            System.out.print("Input file name: ");
            String fileNameInput = console.nextLine();
            File f = new File(fileNameInput);
            while(!f.exists()){
               System.out.print("File not found. Try again: ");
               fileNameInput = console.nextLine();
               f = new File(fileNameInput);
            }
            Scanner viewFile = new Scanner(f);
            System.out.println();
            while(viewFile.hasNext()){
               System.out.println(viewFile.nextLine());
            }
            System.out.println();
            }
      }
      choice = getChoice(console);
   }
   
   //new method
   
   public static void inputFile(Scanner console){
      System.out.print("Input file name: ");
      String fileNameInput = console.nextLine();
      File f = new File(fileNameInput);
      //return file f
      
   }
   
}