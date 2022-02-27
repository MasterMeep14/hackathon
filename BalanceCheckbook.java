import java.util.*;
public class BalanceCheckbook {
    public static void main(String[] args) {      
        Scanner console = new Scanner(System.in);
        boolean wasOverdrawn = balanceCheckbook(console);
        System.out.println("    Return Value: " + wasOverdrawn);
    }

    // TODO: Your Code Here -> Write a method
    // called balanceCheckbook here
    public static boolean balanceCheckbook(Scanner console){
    System.out.print("initial balance?");    
    double initialBalance = console.nextDouble();
    System.out.print("how many transactions?");  
    int transactionNum = 0;
    int transactions = console.nextInt();
    double minBalance = initialBalance;
    boolean wasOverdrawn = false;
    for (int i = 0; i < transactions; i++){
      //double newBalance = 0;
      transactionNum++;
      System.out.print(transactionNum + "/" + transactions + " amount?");  
      double balanceChange = console.nextDouble();
      initialBalance = initialBalance + balanceChange;
      
      System.out.print("new balance = $" + initialBalance);
      if (initialBalance < minBalance){
      minBalance = initialBalance;
      
      }  
      System.out.println();
      
      if (initialBalance < 0){
         wasOverdrawn = false;
      } else {
         wasOverdrawn = true;
      }
    }
    System.out.print("minimum balance = $" + minBalance);
      return wasOverdrawn;
    }
}