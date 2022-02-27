import java.util.*;
public class SpinWheel {
    public static void main(String[] args) {
        Random r = new Random(42);
        int n = 20;
        spinWheel(r, 2);
        System.out.println();
        spinWheel(r, 3);
    }
    
    public static void spinWheel(Random r, int n){
        int randomNum = 0;
        int current = 0; 
        int repCount = 0;
        int total = 0;
        while (n != current){        
            randomNum  = r.nextInt(61);
            if (randomNum == 20){
               total++;
               repCount = thing(randomNum, current, n, repCount);  
               if (repCount >= n){break;}
               current = randomNum;
               
            
            }else if (randomNum == 30){
               total++;
               repCount = thing(randomNum, current, n, repCount); 
               if (repCount >= n){break;}
               current = randomNum;
            
            }else if (randomNum == 40){
               total++;
               repCount = thing(randomNum, current, n, repCount); 
               if (repCount >= n){break;}
               current = randomNum;

            }else if (randomNum == 50){
               total++;
               repCount = thing(randomNum, current, n, repCount); 
               if (repCount >= n){break;}
               current = randomNum;
            
            
            }else if (randomNum == 60){
               total++;
               repCount = thing(randomNum, current, n, repCount); 
               if (repCount >= n){break;}
               current = randomNum;
               
            }else{
            randomNum  = r.nextInt(61);
            }       
        }
        System.out.print(n + " in a row after " + total + " spins");     
        
    }
            public static int thing(int randomNum, int current, int n, int repCount){
            System.out.print(randomNum +  ", ");
                           if(randomNum == current){
                              repCount++;
                              if(repCount >= n){
                                 return repCount;
                              }
                           }
                           else{
                              current = randomNum;
                              repCount = 1;
                           }
                           return repCount;
            }
    
}

