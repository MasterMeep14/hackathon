
import java.util.*;
import java.io.*;

public class Acronym {
    public static void main(String[] args) {
        System.out.println(acronym(" automatic teller machine "));
        System.out.println(acronym("personal identification number"));
        System.out.println(acronym("computer science"));
        System.out.println(acronym("merry-go-round"));
        System.out.println(acronym("All my Children"));
        System.out.println(acronym("Troubled Assets Relief Program"));
        System.out.println(acronym("--quite-- confusing - punctuation-"));
        System.out.println(acronym(" loner "));
    }

    public static String acronym(String inputStr){
      inputStr = inputStr.replace('-', ' ');
      Scanner input = new Scanner(inputStr);
      String acroFinal = "";
      while(input.hasNext()){
         String word = input.next().toUpperCase();
         char acro = word.charAt(0);
         acroFinal += acro;
      }
     return acroFinal; 
    }
}