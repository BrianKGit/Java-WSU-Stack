import java.util.*;

//@SuppressWarnings("unchecked")

public class PostfixFormula {

		
   public static void main(String[] args) {
   
      Scanner console = new Scanner(System.in);
      
      //declare variables
      String formula, token;
      Stack<Double> stack1 = new Stack<Double>();
      String [] tokenList;
      double operand1, operand2, result = 0;
      
      //using our self made stack object
      //MyArrayListStack<Integer> stack2 = new MyArrayListStack<Integer>();
      
      //input
      System.out.print("Enter a valid postfix formula (use space as the delimitor): ");
      formula = console.nextLine();
      
      tokenList = formula.split( " " );
      
      try{
         for(int i=0; i<tokenList.length; i++) {
         
            token = tokenList[i];
         
         //if token is an operand, push it to the stack
         //else, pop two operands and calculate the result
         //      and push the result to the stack
         
            if( token.equals("+") ||
            token.equals("-") ||
            token.equals("*") ||
            token.equals("/") ) {
            
               operand2 = stack1.pop();
               operand1 = stack1.pop();
               
               if(operand2 == 0)
                  throw new ArithmeticException();
            
               result = calculate( operand1, operand2, token);
            
               stack1.push( result );
            
            }
            else {
               stack1.push(Double.parseDouble(token));
            }
         
         }//end for loop
      
         System.out.println("\n" + formula + " = " + result);
      
      } 
      catch(ArithmeticException e) {
         System.out.println("\nInvalid formula");
      }
         
   }//end of main()
   
   public static double calculate(double operand1, double operand2, String operator) {
   
      double result = 0;
      
      switch( operator ) {
         
         case "+":
            
            result = operand1 + operand2;
            break;
            
         case "-":
            
            result = operand1 - operand2;
            break;
            
         case "*":
            
            result = operand1 * operand2;
            break;
            
         case "/":
            
            result = operand1 / operand2;
            break;
      
      }//end switch
      
      return result;
      
   }//end calculate() method
   
}//end of class













