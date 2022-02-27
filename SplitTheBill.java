import java.util.*;
public class SplitTheBill {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        splitTheBill(console);
    }

    public static double round2(double num) {
        return Math.round(num * 100.0) / 100.0;
    }

    // TODO: Your Code Here -> Write a method
    // called splitTheBill for this problem
    public static void splitTheBill(Scanner console){
    double totalCost = 0;
    System.out.print("How many people? ");
    int people = console.nextInt();
    for (int i = 1; i < people + 1; i++){
        System.out.print("Cost for person " + i + ":");
        totalCost += console.nextDouble();
    }
    System.out.print("Tip % (0-100)? ");
    int tip = console.nextInt();
    System.out.print("The bill split " + people + " way(s) is: $");
    double total = round2((totalCost + (totalCost/100 * tip))/people);
    System.out.print(total);
    }
}
