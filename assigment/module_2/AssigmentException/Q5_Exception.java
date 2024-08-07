package AssigmentException;

/*
 • W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero
 */

public class Q5_Exception 
{
   public static void main(String[] args)
   {
   
	   		        if (args.length < 2) {
	   		            System.out.println("Usage: java DivisionExample <number1> <number2>");
	   		            return;
	   		        }

	   		        try {
	   		            // Parse input arguments into numbers
	   		            int num1 = Integer.parseInt(args[0]);
	   		            int num2 = Integer.parseInt(args[1]);

	   		            // Perform division
	   		            int result = num1 / num2;
	   		            System.out.println("Division result: " + result);
	   		        } catch (NumberFormatException e) {
	   		            System.out.println("Error: Please provide valid integers.");
	   		        } catch (ArithmeticException e) {
	   		            System.out.println("Error: Division by zero is not allowed.");
	   		        }
	   		    }
	   	}
  
