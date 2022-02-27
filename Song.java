//Zarak Tareen
//6.23.21
//CSE 142
//TA:Drew Nguyen
//This code is going to spell out the song in the assignment with println statements and methods
//There is a main method which only contains the methods for each verse, after that there are methods for each verse
//There are some methods there that are meant to avoid redundancy, which come after the methods for the verses

public class Song{
   public static void main(String[] args){
   fly();
   spider();
   bird();
   cat();
   dog();
   lizard();
   horse();

   }
   
   public static void fly(){
      //verse 1
      System.out.println("There was an old woman who swallowed a fly.");
      perhaps();
   
   }
   
   
   public static void spider(){
      //verse 2
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spiderfly();
      perhaps();
   
   }
   
   
   public static void bird(){
      //verse 3
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      birdfly();
      perhaps();
   
   }
   
   
   public static void cat(){
      //verse 4
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catfly();
      perhaps();
   
   }
   
   
   public static void dog(){
      //verse 5
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogfly();
      perhaps();
   
   }
   
   public static void lizard(){
      //verse 6
      System.out.println("There was an old woman who swallowed a lizard,");
      System.out.println("She gobbled it up just like a gizzard.");
      lizardfly();
      perhaps();
   
   }
   
   
   public static void horse(){
      //verse 7
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");

   }
   
      
      
      
            
      

      

      
      

      

      
      

   
   //repeated at the end of a lot of the verses
   public static void perhaps(){
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   
   public static void spiderfly(){
      System.out.println("She swallowed the spider to catch the fly,");
   }

   //2 repeated lines
   public static void birdfly(){
      System.out.println("She swallowed the bird to catch the spider,");
      spiderfly();
   
   }
   
   //3 repeated lines
   public static void catfly(){
      System.out.println("She swallowed the cat to catch the bird,");
      birdfly();
   }
   
   //4 repeated lines
    public static void dogfly(){ 
      System.out.println("She swallowed the dog to catch the cat,");
      catfly();
    }
    
    //5 repeated lines
    public static void lizardfly(){
      System.out.println("She swallowed the lizard to catch the dog,");
      dogfly();
    
    }
    
    
}

