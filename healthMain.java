import java.util.Arrays;
import java.util.ArrayList;  
import java.io.*;
import java.util.*;


public class healthMain{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      printInstructions();
      findVitals(console);
      
   
   }
      
   public static void findVitals(Scanner console){
         InformationStore info = new InformationStore();
         String fullFind = console.nextLine();
         fullFind = fullFind.toLowerCase();
         for(int i = 0; i < fullFind.length(); i++){
            char currentChar = fullFind.charAt(i);
            System.out.println("The char is " + currentChar);
            if(currentChar == 'r'){
               info.heartRate = findHeartRate(console, info);
            }
            if(currentChar == 'h'){
               info.height = findHeight(console, info);
            }
            if(currentChar == 'w'){
               info.weight = findWeight(console, info);
            }
            if(currentChar == 't'){
               info.temp = findTemp(console, info);
            }  
            if(currentChar == 'b'){
               info.bloodPressure = findBloodPressure(console, info);
            }   
            if(currentChar == 'c'){
               info.calories = findCals(console, info);
            }            
            if(currentChar == 'k'){
               info.bloodType = findBloodType(console, info);
            }   
         }
         System.out.println(info.bloodType + info.calories);
         findInfo(info, console);
         
         
   }
   
   public static int findHeight(Scanner console, InformationStore info){
         System.out.println("Enter your height in cm here");
         int height = console.nextInt();
         return height;
   }
   
   public static int findWeight(Scanner console, InformationStore info){
         System.out.println("Enter your weight in kgs here");
         int weight = console.nextInt();
         return weight; 
   }
   
      public static int findTemp(Scanner console, InformationStore info){
         System.out.println("Enter your Temp in Celcius here");
         int temperature = console.nextInt();
         return temperature;
      }
      
      public static int findCals(Scanner console, InformationStore info){
         System.out.println("Enter the calories you ate today");
         int cals = console.nextInt();
         return cals; 
      }
      
      public static int[] findBloodPressure(Scanner console, InformationStore info){
         int[] bpArray = new int[2];
         System.out.println("Enter your systolic blood pressure (first number)");
         int firstNum = console.nextInt();
         System.out.println("Enter your diastolic blood pressure (second number)");
         int secondNum = console.nextInt();
         bpArray[0] = firstNum;
         bpArray[1] = secondNum;
         return bpArray;
      }
      
      public static String findBloodType(Scanner console, InformationStore info){
          System.out.println("Enter your blood type");
          String bloodType = console.next();
          return bloodType;
      }
      
      public static int findHeartRate(Scanner console, InformationStore info){
          System.out.println("Enter your heart rate");
          int heartRate = console.nextInt();
          return heartRate;
      }
      
      
      public static void findInfo(InformationStore info, Scanner console){
      //maybe add a thing where it asks u what stuff u wanna get info on
         System.out.println("We will now give you some results");
         System.out.println("If you would like to know your BMI and some medical information on it, please enter 'Yes' if not, 'no' (Casing does not matter, but do not add a space or any other characters)");
         String bmiResponse = console.next();
         bmiResponse = bmiResponse.toLowerCase();
         if(bmiResponse.equals("yes")){
            if(info.height != 0 && info.weight != 0){
               //make it like actually fully calculate
               double weightCalc = info.weight;
               double heightCalc = info.height;
               double BMI =  (weightCalc/heightCalc/heightCalc) * 10000;
               System.out.println("your BMI is " + BMI);
            } else {
               System.out.println("We cannot calculate your BMI as either your height or weight was not entered");
            }
         } else {
            System.out.println("BMI data not tracked");
         }
         
         System.out.println("Do you want to know more about your blood type? Please enter 'Yes' if not, 'no' (Casing does not matter, but do not add a space or any other characters) ");
         String bmiResponse = console.next();
         //test
         
      }
   
   
   
      
   public static void printInstructions(){
         System.out.println("Here you will enter your vitals! You can enter as little or as much as you want.");
         System.out.println("Note that if you do not enter in a value it will be marked as 0 and we will not track data for it");
         System.out.print("Please enter a sequence of letters to represent the information you want to store. It does not matter if you add spaces they will be ignored");
         System.out.println("H for height, W for weight, R for Heart rate, T for temperature, B for blood pressure, and C for the calories you ate, and K for blood type");
         System.out.println("Example: H W R would give you information about your height, weight, and heart rate");
         System.out.println("If you enter a different letter it will be ignored.");
         System.out.println("Enter here: ");
   }
}