public class HashTag {
    public static void main(String[] args) {
        System.out.println(hashTag("I love computer science"));
        System.out.println(hashTag("to be or not to be"));
        System.out.println(hashTag("saY YES"));
        System.out.println(hashTag(" edGAr allan pOE "));
        System.out.println(hashTag(" sPooOOOooOoOky"));
        System.out.println(hashTag(" fuNNY #@*^!& sYMbols "));
        System.out.println(hashTag("x"));
        System.out.println(hashTag(" "));
        System.out.println(hashTag(""));
    }

      public static String hashTag(String user){
         String word = "#";
         boolean start = true;
         
         for (int i = 0; i < user.length(); i++){
            char c = user.charAt(i);
            if (c != ' '){
                  if (start){
                  char newChar = Character.toUpperCase(c);
                  word += newChar;
                  start = false;
                  } else{
                     char newChar = Character.toLowerCase(c);
                     word += newChar;
                  }
                  
            } else{
               start = true;
            }

         }
         return word;
      }
      
}
      
      