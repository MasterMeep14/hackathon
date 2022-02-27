//Zarak Tareen
//6.23.21
//CSE 142
//TA:Drew Nguyen
//This program is going to tell you your:
//monthly income, spending, daily expenses, and daily income, along with
//how much you spent relative to your income,
//along with a custom message dependant on that.
//The code starts off with an introduction message,
//Then the income, expenses, totals, and your final spending relative to income
//In order to perform the code, I used a variety of features
//like return values, int/doubles, for loops, if/else statements, etc.

import java.util.*;
public class Budgeter {
   public static final int DAYS_IN_MONTH = 31;
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      introduction();
      double incomeTotal = income(console);
      double expenseTotal = expenses(console);
      totals(incomeTotal, expenseTotal);
      spending(incomeTotal, expenseTotal);
   }
   
   
   //This is a method to calculate your spending relative to income,
   //And contains a special message dependant on that outcome
   //You must include both the income and expenses as parameters, 
   //because those are used to calculate your final spending to income equation
   //In order to round everything to the nearest cent (ex: 4.52 instead of 4), 
   //i used the math.round function, multipied it by 100, then divided it by 100
   //it is passed in as a parameter and used to round where necessary
   //No return value here
   //To produce the right outcome, I used an if else statement for both 
   //the amount you spent vs. saved statement, along with the custom message
   //For the custom message, I used several if/else statments, 
   //because there are several potential outputs
   public static void spending(double incomeTotal, double expenseTotal){
      double saveSpend = rounding(incomeTotal - expenseTotal);
      if (saveSpend > 0){
         System.out.println("You earned $" + saveSpend + " more than you spent this month.");
      }
      else{
         System.out.println("You spent $" + Math.abs(saveSpend) + " more than you earned this month.");
         
      }
      
      if (saveSpend > 250){
         System.out.println("You're a big saver.");
         System.out.println("Maybe you can retire early... SIKE you thought enjoy paying rent next month");
      }
      else if(saveSpend > 0){
         System.out.println("You're a saver.");
         System.out.println("Congrats you didn't completely fail at life");
      }
      else if(saveSpend > -250){
         System.out.println("You're a spender.");
         System.out.println("Good job on failing to be a functional adult");
      }
      else{
         System.out.println("You're a big spender.");
         System.out.println("You work at starbucks stop buying supreme");
      }
   }
   
   
   //This is a method that prints your total income/spending,
   // along with your spending/income daily
   //You must include both the income and expenses as parameters, because 
   //those are used to calculate the daily spending/income, and to print out the totals
   //No return value here
   //In order to round everything to the nearest cent (ex: 4.52 instead of 4), 
   //I used the math.round function, multipied it by 100, then divided it by 100
   //that is stored in a seperate method and passed as a parameter
   //The daily income/expenses is just the totals/the days in a month
   //2 println statments for both the income and expenses
   public static void totals(double incomeTotal, double expenseTotal){
      double incomeDaily = incomeTotal / DAYS_IN_MONTH;
      double expenseDaily = expenseTotal / DAYS_IN_MONTH;
      System.out.println("Total income = $" + rounding(incomeTotal) + " ($" + rounding(incomeDaily) + "/day)");
      System.out.println("Total expenses = $" + rounding(expenseTotal) + " ($" + rounding(expenseDaily) + "/day)");
      System.out.println();
      
   }
   
   
   //In order to round everything to the nearest cent (ex: 4.52 instead of 4), 
   //I used the math.round function, multipied it by 100, then divided it by 100
   //this method is passed as a parameter to other parts of the code when necessary
   public static double rounding(double number){
      return (Math.round((number) * 100.0) / 100.0);
   }
   
   
   //This is just an introductory statement to get the user aware of what is actually going on
   //Pretty basic, just explains it briefly, and it isn't 
   //rocket science to learn how to use this program
   //Just what we had in the instructions
   public static void introduction(){
      System.out.println("This program asks for your monthly income and");
      System.out.println("expenses, then tells you your net monthly income.");
      System.out.println();
   }
   
   
   //This part of the method is to figure out the total income of the person
   //Because we are taking in user input, we have to pass the scanner console as a parameter
   //when the program is finished, the total income is returned through the return value
   //Throughout the program, i used doubles when dealing with dollar amounts, and ints 
   //when dealing with whole numbers (i.e the categories of income)
   //The for loop here is to get all of the income amounts, and is run the number of 
   //time that the user requests it
   public static double income(Scanner console){
      double incomeTotal = 0;
      incomeTotal = categories("income", incomeTotal, console);
      System.out.println();
      return incomeTotal;
      
   }
   
   //This method is for figuring out the total amount of expenses
   //The scanner console is passed as a parameter, because there is user input
   //When the program is over, the total value of the expenses is returned to main.
   //Once again, i used Ints for vaulues that are just whole numbers, and doubles 
   //for values that are dealing with money
   //Here, i have an if/else statement for whether or not you are doing daily or monthly expenses.
   // If it's monthly i just run the program normally
   //and if it is daily then I multiply the outcome by the number of days in a month
   //To execute the code, i have a for loop similar to the income, where it asks you for 
   //the amount of expenses you have, runs the for loop that many times
   //and then inside the for loop is where you get the user input
   public static double expenses(Scanner console){
      double expenseTotal = 0;
      System.out.print("Enter 1) monthly or 2) daily expenses? " );
      int monthDay = console.nextInt();
      expenseTotal = categories("expense", expenseTotal, console);
      if (monthDay > 1){
      expenseTotal = expenseTotal * DAYS_IN_MONTH;
         
      }
      System.out.println();
      return expenseTotal;
   }
   
   //this method is a pretty simple one that is meant to reduce redundancy
   //you pass in the parameters that determine whether or not it is expense or income
   //those parameters are catType and categoryTotal
   //You also pass in scanner console because the method inside this one uses console
   //The method returns the added total when completed
   public static double categories(String catType, double categoryTotal, Scanner console){
      System.out.print("How many categories of " + catType + "? ");
      categoryTotal = calculate(categoryTotal, console, catType);
      return categoryTotal;
   }
   
   //This method is meant to calculate the amounts
   //it uses a for loop to do this and just asks for how many times you want
   //to run it, then adds your amount each time you run it.
   //it returns that final number when the for loop is done running
   //it takes int the parameters newTotal, console, and amount
   //it takes in console for the user input, and takes in the other 2
   //parameters in order to add the user inputs correctly
   public static double calculate(double newTotal, Scanner console, String amount){
      double runNum = console.nextInt();
      for (int i = 1; i <= runNum; i++){
         System.out.print("    Next " + amount + " amount? $");
         newTotal += console.nextDouble();
      }
      return newTotal;
   }
}

