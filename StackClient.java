/*
 * Author:      Brian Klein
 * Date:        11/29/17
 * Program:     StackClient.java
 * Description: The postfix expression is evaluated from left to right, one 
                token at a time. If an operand is encountered, it is pushed 
                onto the stack. If an operator is encountered, two operands are 
                popped, the infix version is constructed and the result is 
                pushed onto the stack. For example, if the operator is + and 
                top two operands are 8 and 5, then ( 5 + 8 ) is constructed and 
                pushed onto the stack. In the end, the last object in the stack 
                is the infix expression and it should be popped. The program 
                should repeatedly accept and evaluate expressions until the 
                user choose not to. The empty stack exception should be handled.
 */
import java.util.*;

public class StackClient {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //declare variables
        String formula, token, translation = "";
        Stack<String> stack2 = new Stack<String>();
        String[] tokenList;
        String operand1, operand2;

        boolean flag = true;
        String userCommand;

        while (flag) {

            displayMenu();

            userCommand = console.next();

            switch (userCommand) {
                case "1":

                    //input
                    console.nextLine();
                    System.out.print("Enter a valid postfix formula (use space as the delimitor): ");
                    formula = console.nextLine();


                    tokenList = formula.split(" ");

                    try {
                        
                        for (int i = 0; i < tokenList.length; i++) {
                            

                            token = tokenList[i];

                            //if token is an operand, push it to the stack
                            //else, pop two operands and calculate the result
                            //      and push the result to the stack
                            if (token.equals("+")
                                    || token.equals("-")
                                    || token.equals("*")
                                    || token.equals("/")) {

                                operand2 = stack2.pop();
                                operand1 = stack2.pop();

                                translation = infixTranslation(operand2, operand1, token);

                                stack2.push(translation);

                            } else {
                                stack2.push(token);
                            }

                        }//end for loop

                        System.out.println(translation);

                    } catch (EmptyStackException e) {
                        System.out.println("\nInvalid formula");
                    }

                    break;

                case "0":
                    flag = false;

                    System.out.println("Thank you for using this program.");

                    break;

                default:
                    System.out.println("Invalid command, try again.");

            }//end switch

        }//end while

    }//end of main()

    public static String infixTranslation(String operand1, String operand2, String operator) {

        String translation = "";

        translation += "(" + operand2 + " " + operator + " " + operand1 + ")";

        return translation;

    }

    private static void displayMenu() {

        System.out.print("\n\n"
                + "1 -- Translate a postfix expression.\n"
                + "0 -- Exit\n\n"
                + "Enter command:");

    }

}
