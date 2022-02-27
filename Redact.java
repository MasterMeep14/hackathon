import java.util.*;
import java.io.*;

public class Redact {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        redact(input);
    }

    // TODO: write your code here`
    public static void redact(Scanner input){
        while(input.hasNext()){
            //String fullOutput = "";
            String word = input.next();
            int count = 0;
            if(word.equals("CLASSIFIED")){
                count = input.nextInt();
                while(count > 0){
                 word = input.next();
                 System.out.println("[redacted]"); 
                 count--;  
                }
            } else {
                System.out.println(word);
            }

        }

    }
}