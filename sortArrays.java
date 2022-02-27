/*
Write a Java program to sort a Numeric Array and String Array.
*/

import java.util.Arrays;
import java.util.ArrayList;  

public class sortArrays{
   public static void main(String[] args){
      int[] arr = {1,6,71,23,213,4,12,5,163,141};
      //1
      Program1();
      //2
      printGrid();
      //3
      int num = findIndex(arr, 0, arr.length-1, 23);
      System.out.println("The index for that number is " + num);
      //4
      boolean yesNo = findElement(arr, 71, 0);
      System.out.println("That number being in the array is " + yesNo);
      //5
      arrayPractice();
      //6
      oddEven(arr);
      //7
      highLow(arr);
   }
   
   
   public static void highLow(int[] arr){
   int biggestNum = arr.length;
   int smallestNum = arr.length;
   if(arr.length < 2){
      System.out.println("Array smaller than 2");
   }
   //firstNum = lastNum = Integer.MAX_VALUE;
   for(int i = 0; i < arr.length; i++){
      if(arr[i] < smallestNum){
         smallestNum = arr[i];
      }
      else if (arr[i] > biggestNum){
         biggestNum = arr[i];
      }
   }
   System.out.println("Largest number: " + biggestNum);
   System.out.println("Smallest number: " + smallestNum);
}

   
   
   
   
   public static void oddEven(int[] arr){
      int evenNums = 0;
      int oddNums = 0;
      int[] evenNumbers = new int[10];
      int[] oddNumbers = new int[10];
      for(int i = 0; i < arr.length; i++){
         if(arr[i] % 2 == 0){
         evenNums++;
         evenNumbers[i] = arr[i];
         } else{
         oddNums++;
         oddNumbers[i] = arr[i];
         }
      }
      System.out.println("Odd numbers: " + oddNums);
      System.out.println("Even numbers: " + evenNums);
      for(int i = 0; i < oddNumbers.length; i++){
         if(oddNumbers[i] != 0){
         System.out.print(oddNumbers[i] + " ");
         }
      }
      System.out.println();
      for(int i = 0; i < evenNumbers.length; i++){
         if(evenNumbers[i] != 0){
         System.out.print(evenNumbers[i]+ " ");
         }
      }
      System.out.println();
   }
   
   
  
   public static void arrayPractice(){
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      arrayList.add(4);
      arrayList.add(3);
      arrayList.add(9);
      arrayList.add(18);
      arrayList.set(2, 2);
      arrayList.remove(0);
      System.out.println(arrayList);
      
      //works in neatbeans but not here
      //arr = ArrayUtils.remove(arr, 4);
      
   }
  
  
  
  
  
  
  
    public static boolean findElement(int[] arr, int x, int startNum){
      if(startNum > arr.length){
         return false;
      }
      if(arr[startNum] == x){
         return true;
      }
      startNum++;
      return findElement(arr, x, startNum);
    
    }
  
  
    public static int findIndex(int [] arr, int x, int y, int z){
        if (y < x){
            return -1;
        }
        if (arr[x] == z){
            return x;
        }
        if (arr[y]== z){
            return y;
        }
        return findIndex(arr, x + 1, y-1, z);
 
      
      
   }
   
   
   
   
   
   public static void printGrid(){
   for(int i = 0; i < 4; i++){
      for(int j = 0; j < 6; j++){
         System.out.print("-");
      }
      System.out.print("\n");
   }
   
   
   
   }
   
   
   
   
   
   

   
   public static void Program1(){
   int[] arr = {1,6,71,23,213,4,12,5,163,141};
   String[] stringArr = {"Tiger", "Lion", "Hippo", "Giraffe", "Dog", "Cat"};
   Arrays.sort(arr);
   Arrays.sort(stringArr);
   for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
   }
   for(int i = 0; i < stringArr.length; i++){
      System.out.println(stringArr[i]);
   } 
   }

}