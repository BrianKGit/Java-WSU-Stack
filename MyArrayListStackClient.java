import java.util.*;

//@SuppressWarnings("unchecked")

public class MyArrayListStackClient {

		
   public static void main(String[] args) {
   
      MyArrayListStack<String> stack1 = new MyArrayListStack<String>(20);
      
      stack1.push("Java Book");
      stack1.push("Python Programming");
      stack1.push("War and Peace");
      stack1.push("The Count of Monte Cristo");
      stack1.push("Animal Farm");
      
      System.out.println( stack1 );
      
      System.out.println( stack1.pop() + " is removed.");
      System.out.println( stack1.pop() + " is removed.");
      
      System.out.println( stack1.peek() + " is the top object.");
      
      System.out.println( stack1 );
   
   
   
   
   
   
   
   }//end of main()

}//end of class













