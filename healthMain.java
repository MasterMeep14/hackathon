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
         InformationSto info = new InformationSto();
         String fullFind = console.nextLine();
         fullFind = fullFind.toLowerCase();
         for(int i = 0; i < fullFind.length(); i++){
            char currentChar = fullFind.charAt(i);
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
            } if(currentChar == 'a'){
               info.age = findAge(console, info);
            }
         }
         findInfo(info, console);
         
         
   }
   
   public static int findHeight(Scanner console, InformationSto info){
         System.out.println("Enter your height in cm here");
         int height = console.nextInt();
         return height;
   }
   
   public static int findWeight(Scanner console, InformationSto info){
         System.out.println("Enter your weight in kgs here");
         int weight = console.nextInt();
         return weight; 
   }
   
      public static double findTemp(Scanner console, InformationSto info){
         System.out.println("Enter your Temp in fahrenheit here");
         double temperature = console.nextDouble();
         return temperature;
      }
      
      public static int findCals(Scanner console, InformationSto info){
         System.out.println("Enter the calories you ate today");
         int cals = console.nextInt();
         return cals; 
      }
      
      public static int findAge(Scanner console, InformationSto info){
         System.out.println("Enter your age in years");
         int age = console.nextInt();
         return age; 
      }
      
      public static int[] findBloodPressure(Scanner console, InformationSto info){
         int[] bpArray = new int[2];
         System.out.println("Enter your systolic blood pressure (first number)");
         int firstNum = console.nextInt();
         System.out.println("Enter your diastolic blood pressure (second number)");
         int secondNum = console.nextInt();
         bpArray[0] = firstNum;
         bpArray[1] = secondNum;
         return bpArray;
      }
      
      public static String findBloodType(Scanner console, InformationSto info){
          System.out.println("Enter your blood type and if it's positive or negative. Ex: a+");
          String bloodType = console.next();
          bloodType = bloodType.toLowerCase();
          return bloodType;
      }
      
      public static int findHeartRate(Scanner console, InformationSto info){
          System.out.println("Enter your heart rate in bpm");
          int heartRate = console.nextInt();
          return heartRate;
      }
      
      
      public static void findInfo(InformationSto info, Scanner console){
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
            } else if(info.height == 0 || info.weight == 0) {
               System.out.println("We cannot calculate your BMI as either your height or weight was not entered");
            }
         } else if(bmiResponse.equals("no")) {
            System.out.println("BMI data not tracked");
         } else{
            System.out.println("Invalid response");
         }
         
         System.out.println("Do you want to know more about your blood type? Please enter 'Yes' if not, 'no' (Casing does not matter, but do not add a space or any other characters) ");
         String bloodTypeResponse = console.next();
         bloodTypeResponse = bloodTypeResponse.toLowerCase();
         if(bloodTypeResponse.equals("yes")){
            if(info.bloodType.equals("a+")){
               System.out.println("Starting with a fun fact, you are less likely to be bitten by Mosquitos! But on a less fun note you are more likely to develop stomach cancer. If you are genetically predisposed to that or something similar, consider talking with your doctor.");
               System.out.println("You also have the most common blood type, with almost 1 in 3 people having it!");
            }
            if(info.bloodType.equals("a-")){
               System.out.println("Starting with a fun fact, you are less likely to be bitten by Mosquitos! But on a less fun note you are more likely to develop stomach cancer. If you are genetically predisposed to that or something similar, consider talking with your doctor.");
               System.out.println("You are a very good donor! you can donate to all A and AB type people. Consider donating blood if you are in good health and eligible. Also, only 1 in 16 poeple have your blood type");
            }
            if(info.bloodType.equals("ab-")){
               System.out.println("You have the most rare blood type ever! Only 1 in 167 people have this blood type, roughly 0.6%. This blood type also only makes up 3% of all donors, so it would be a great help!");
               System.out.println("You are a great donor, as you are a univeral plasma donator. Look to donate blood if healthy and eligible!");
            }
            if(info.bloodType.equals("ab+")){
               System.out.println("You have great genetics! You can recieve any form of blood, and the nickname for this blood type is the universal recipient. This is also a pretty rare blood type; only 3.4% of people have this kind of blood!");
               System.out.println("You are a great donor, as you are a univeral plasma donator. Look to donate blood if healthy and eligible!");
            }
            if(info.bloodType.equals("o+")){
               System.out.println("One of the more common blood types with 37.4% of the population also having it, you are a very eligible donor! You can give to A+, B+, O+ and AB+");
               System.out.println("You are at a decreased risk of diabetes and have a smaller chance of serious clotting issues.");
            }
            if(info.bloodType.equals("o-")){
               System.out.println("Only 6.6% of the population has your blood type! Consider yourself lucky. However, if you are eligble to donate PLEASE look to do so soon. Your blood type is in constant demand due to the fact that any blood recipient can take your blood type. You could save lives and help hospitals out every day by donating blood. In fact your blood type is called the universal donor.");
               System.out.println("You are at a decreased risk of diabetes and have a smaller chance of serious clotting issues.");
            }
            if(info.bloodType.equals("b-")){
               System.out.println("You have a very rare blood type! Only 1.5% have this blood type. You can donate to both B and AB patients so look to donate if you already don't");
               System.out.println("Fun fact: Most people with this blood type have a large/high forehead, and are more likely to have an extra rib.");
            }
            if(info.bloodType.equals("b+")){
               System.out.println("You have a fun blood type! Only 8.5% of the US has type B+ blood. You can give blood products to types B+ and AB+, so look to donate if you are eligible!");
               System.out.println("Fun fact: Most people with this blood type have a large/high forehead, and are more likely to have an extra rib.");
            } else if (info.bloodType.equals(" ")){
               System.out.println("You either did not enter your blood or entered it incorrectly");
            }
         } else if(bloodTypeResponse.equals("no")){
            System.out.println("No data recorded");
         } else {
            System.out.println("Invalid response");
         }
         System.out.println("Do you want to know more about your Blood pressure? Please enter 'Yes' if not, 'no' (Casing does not matter, but do not add a space or any other characters)");
         String hrResponse = console.next();
         hrResponse = hrResponse.toLowerCase();
         if(hrResponse.equals("yes")){
            if(info.bloodPressure[0] < 90 || info.bloodPressure[1] < 60){
               System.out.println("Your systolic Blood pressure is " + info.bloodPressure[0] + " and your diastolic blood pressure is " + info.bloodPressure[1] + " meaning that you are at high risk of low blood pressure. Contact a doctor immediatly");
            } else if(120 > info.bloodPressure[0] && info.bloodPressure[0] >= 90 || 80 > info.bloodPressure[1] && info.bloodPressure[1] >= 60){
               System.out.println("Your blood pressure seems to be normal! If you have any further questions ask your doctor");
            } else if(120 < info.bloodPressure[0]&& info.bloodPressure[0] < 129 && 80 > info.bloodPressure[1] && info.bloodPressure[1] > 60){
               System.out.println("You have elevated blood pressure. Not highly urgent, but make sure to discuss with a doctor and stay in good health!");
            } else if(130 <= info.bloodPressure[0] || 80 <= info.bloodPressure[1]){
               System.out.println("You have high blood pressure. Check this with a doctor ASAP");
            } else {
               System.out.println("Error");
            }
         } else if(hrResponse.equals("no")){
            System.out.println("No data recorded");
         } else{
            System.out.println("Invalid response");
         }
         System.out.println("Do you want to know more about your calorie intake? Please enter 'Yes' if not, 'no' (Casing does not matter, but do not add a space or any other characters)");
         String calResponse = console.next();
         calResponse = calResponse.toLowerCase();
         if(calResponse.equals("yes")){
            if(info.age == 0){
               System.out.println("Information not complete, data will be inaccurate");
            } else if(info.height == 0){
               System.out.println("Information not complete, data will be inaccurate");
            } else if(info.weight == 0){
               System.out.println("Information not complete, data will be inaccurate");
            }
            double idealCals = 66.5 + (13.8  * (double) info.weight) + (5 * (double) info.height) / (6.8 * (double) info.age);
            if(info.calories - 300 > idealCals){
               System.out.println("Your ideal calories to eat would be roughly " + idealCals + ", but you ate more than that at " + info.calories + " calories. Please decide on your own terms if this is something that requires a lifestyle change or a doctor's visit");
            } if(info.calories + 300 < idealCals){
               System.out.println("Your ideal calories to eat would be roughly " + idealCals + ", but you less more than that at " + info.calories + " calories. Please decide on your own terms if this is something that requires a lifestyle change or a doctor's visit");
            } else {
               System.out.println("You ate roughly the reccomended calories of " + idealCals + " at " + info.calories + ". Great job! Keep up the good effort");
            }
         }
         System.out.println("Do you want to know more about your heart rate? Please enter 'Yes' if not, 'no' (Casing does not matter, but do not add a space or any other characters)");
         String heartResponse = console.next();
         heartResponse = heartResponse.toLowerCase();
         if(heartResponse.equals("yes")){
            if(info.heartRate > 60 && info.heartRate < 100){
               System.out.println("Your heart rate seems to be within the accepted range of 60-100 bpm");
            } else {
               System.out.println("Your heart is not within the accepted range of 60-100 bpm. Check with your doctor as soon as possible as this could be linked to further medical issues.");
            }
         } else if(heartResponse.equals("no")){
               System.out.println("No data recorded");
         } else{
            System.out.println("Invalid response");
         }
         System.out.println("Here is some info about your temperature");
         if(info.temp < 97 && info.temp >=96){
            System.out.println("Your temperature is somewhat low, consider going to a doctor");
         } if(info.temp < 96){
            System.out.println("Your temperature is very low, go to a hospital ASAP or dial 911");
         } if(info.temp >= 97 && info.temp <= 99){
            System.out.println("Your temperature is normal! Nothing to worry about");
         } if(info.temp > 99 && info.temp <= 100){
            System.out.println("Your temperature is somewhat high. Consider wearing a mask or getting it checked out.");
         } if(info.temp > 100){
            System.out.println("Your temperature is extremely high. Go to a hospital/ER or dial 911.");
         }
         System.out.println();       
         System.out.println();     
         System.out.println();     
         System.out.println("Here is your final data (consider saving this for future use)");     
         System.out.println("Your temperature was " + info.temp);
         System.out.println("Your height was " + info.height);
         System.out.println("Your weight was " + info.weight);
         System.out.println("Your blood type was " + info.bloodType);
         System.out.println("Your heart rate was " + info.heartRate);
         System.out.print("Your blood pressure was ");
         for(int i=0;i<info.bloodPressure.length;i++){
            System.out.print(info.bloodPressure[i] + " ");    
         }  
         System.out.println();
         System.out.println("Your calorie intake was " + info.calories);
         System.out.println("Your age is " + info.age);
         System.out.println("That is the end. Thank you");
         
      }
   
   
   
      
   public static void printInstructions(){
         System.out.println("Here you will enter your vitals! You can enter as little or as much as you want.");
         System.out.println("Note that if you do not enter in a value it will be marked as 0 and we will not track data for it");
         System.out.println("Please enter a sequence of letters to represent the information you want to store. It does not matter if you add spaces they will be ignored, casing does not matter. ");
         System.out.println("H for height, W for weight, R for Heart rate, T for temperature, B for blood pressure, C for the calories you ate, A for age, and K for blood type");
         System.out.println("Example: H W R would give you information about your height, weight, and heart rate");
         System.out.println("If you enter a different letter it will be ignored.");
         System.out.println("Enter here: ");
   }
   static class InformationSto{
   public int height = 0;
   public int weight = 0;
   public String bloodType = " ";
   public double temp = 0;
   public int[] bloodPressure = {0,0};
   public int calories = 0;
   int age = 0;
   public int heartRate;
   
   
   public void printHeight(){
      System.out.println(height);
   }
}
}

