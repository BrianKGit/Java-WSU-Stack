import java.util.*;

//@SuppressWarnings("unchecked")

public class ReverseString {

		
   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      
      //declare variables
      String input, token;
      String [] inputList;
      
      System.out.println("Enter a string: ");
      
      input = console.nextLine();
      
      inputList = input.split( " " );
      
      System.out.println("Reverse Words: " + reverseWords(inputList));
      
      System.out.println("Reverse Letters: " + reverseLetters(inputList));
      
   }//end of main()
   
   public static String reverseWords( String [] inputList ) {
   
      Stack<String> stack1 = new Stack<String>();
      String result = "";
      
      for(int i=0; i<inputList.length; i++) {
         stack1.push( inputList[i] );
      }
   
      while( !stack1.isEmpty() ) {
      
         result += stack1.pop() + " ";
      
      }
      
      return result;
   
   }//end reverseWords() method
   
   public static String reverseLetters( String [] inputList ) {
   
      Stack<Character> stack1 = new Stack<Character>();
      String token, result = "";
      
      for(int i=0; i<inputList.length; i++) {
         
         token = inputList[i];
         
         //push each letter to stack1
         for( int x=0; x<token.length(); x++) {
            stack1.push(token.charAt(x));
         }
         
         while( !stack1.isEmpty() ) {
            result += stack1.pop();
         }
         
         result += " ";
         
      }
      
      return result;
      
   }//end reverseLetters() method
   
   public static String reverseWordsAndLetters( String [] inputList ) {
   
      Stack<Character> stack1 = new Stack<Character>();
      String token, result = "";
   
   }

}//end of class













