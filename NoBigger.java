import java.util.*;
public class NoBigger {
    public static void main(String[] args) {
        Random r = new Random();
        int numCount = noBigger(r, 100);
        System.out.println(numCount);
        noBigger(r, 5);
        System.out.print(numCount);
    }


    public static double round2(double num) {
        return Math.round(num * 100.0) / 100.0;
    }
    
    public static int noBigger(Random r, int max){
    int previousNum = max + 2;
    int randomNum =  r.nextInt(max) + 1;
    int numCount = 0;
    System.out.println("Picking numbers from 1 - " + max);
    
    while(randomNum <= previousNum){
      previousNum = randomNum;
      randomNum = r.nextInt(max) + 1;
      if (randomNum < previousNum) {
      System.out.println("Number: " + randomNum);
      double winPercent = round2(randomNum)/100.0;
      System.out.println("Probability to continue: " + winPercent);
      numCount++;
      } else {
      System.out.println("Number: " + randomNum + ", streak ends");
      }
    }
    
    
    return numCount;
   }
}
