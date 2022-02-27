import java.util.*;

public class ReverseGreeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("First name?");
        String firstName = console.next();
        System.out.print("Last name?");
        String lastName = console.next();
        String greeting = ("Nice to meet you, ");
        reverseGreeting(firstName, lastName, greeting);
        System.out.println();
    }

    // TODO: your code here -> write a method called reverseGreeting()
    //       for this problem
    
    private static void reverseGreeting(String firstName, String lastName, String greeting){
        int n = firstName.length();
        int m = lastName.length();
        int o = greeting.length();
        
        for (int i = m-1; i>=0; i--){
            System.out.print(lastName.charAt(i));
        }
        System.out.print(" ");
        for (int i = n-1; i>=0; i--){
            System.out.print(firstName.charAt(i));
        }
        for (int i = o-1; i>=0; i--){
            System.out.print(greeting.charAt(i));
        }
        

    }
    
      //here, we have to take firstname and lastname and reverse it
      //that way, this method will make the words nice to meet you, firstname lastname in reverse
      //step 1: find out how to reverse words
      //step 2: make a println statement where this methods uses firstName and Lastname and all the other stuff and reverses it
      //
      
    
}