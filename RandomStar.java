import java.util.*;
public class RandomStar {
    public static void main(String[] args) {
        // Note: 2063064142 is called a random seed. 
        // You can ignore this value!
        Random r = new Random(2063064142);
        int num = 14;
        randomStar(r, num);
        
    }
    
    public static void randomStar(Random r, int num) {
        int randomNum = 0;
        while (num != randomNum){
        //i have to set the boudaries for this
            randomNum  = r.nextInt(19);
            while (randomNum <= 5){
            randomNum  = r.nextInt(19); 
            }
            for (int i = 0; i < randomNum; i++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}