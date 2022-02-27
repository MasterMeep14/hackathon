//Zarak Tareen
//6.23.21
//CSE 142
//TA:Drew Nguyen
//This code is going to spell out the song put inside of canvas with println statements and methods
//There is a main methods and several other methods after it
//there will be one main method which has all other components put into it to make it print out our song
//There are some methods there that are meant to avoid redundancy

public class Fly{
   public static void main(String[] args){
      fly();
      spider();   
      bird();
      cat();  
      dog();
      lizard();
      horse();
    
   } 
  
   //verse 1 Fly
   public static void fly(){
      System.out.println("There was an old lady who swallowed a fly");
      perhaps();
   
   }
   
   //verse 2 Fly, Spider,
   public static void spider(){
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and jiggled and jiggled inside her.");
      spiderFly();
      perhaps();
   
   }
   
   //verse 3 Fly, Spider, Bird
   public static void bird(){
      System.out.println("There was an old woman who swallowed a bird");
      System.out.println("How absurd to swallow a bird.");
      birdSpider();
      spiderFly();
      perhaps();
   
   }
   
   //verse 4 Fly, Spider, Bird, Cat
   public static void cat(){
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catBird();
      birdSpider();
      spiderFly();
      perhaps();
   
   }
   
   //verse 5 Fly, Spider, Bird, Cat, Dog
   public static void dog(){
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogCat();
      catBird();
      birdSpider();
      spiderFly();
      perhaps();
   
   }
   
   //verse 6 Fly, Spider, Bird, Cat, Dog, Lizard
   public static void lizard(){
      System.out.println("There was an old woman who swallowed a lizard,");
      System.out.println("She gobbled it up just like a gizzard.");
      System.out.println("She swallowed the lizard to catch the dog");
      dogCat();
      catBird();
      birdSpider();
      spiderFly();
      perhaps();
      
   }
   
   //verse 7 Horse
   public static void horse(){
      System.out.println("There was an old lady who swallowed a horse");
      System.out.println("She died of course ");
   
   }
   
   //the constant rhyme at the end of each verse (other than 7)
   public static void perhaps(){
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   //
   public static void spiderFly(){
      System.out.println("She swallowed the spider to catch the fly,");
   
   }
   
   public static void birdSpider(){
      System.out.println("She swallowed the bird to catch the spider,");
   }
   
   public static void catBird(){
      System.out.println("She swallowed the cat to catch the bird,");
   }
   
   public static void dogCat(){
      System.out.println("She swallowed the dog to catch the cat,");
   }
   

}

