package AssigmentException;

/*
	 W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch 
	 block. try { 
	 try 
	{//code} 
	catch (Exception e) 
	{//code} 
	catch (Exception e) 
	{//code}
	 */

public class Q4_Exception 
      {
	       public static void main(String[] args) 
	       {
	       {
	                        try {
	       		            try {
	       		                // Inner try block
	       		                int[] numbers = {1, 2, 3};
	       		                System.out.println(numbers[5]); // Accessing out of bounds element
	       		            } catch (ArrayIndexOutOfBoundsException e) {
	       		                // Inner catch block for ArrayIndexOutOfBoundsException
	       		                System.out.println("Array index out of bounds: " + e.getMessage());
	       		            }
	       		            
	       		            try {
	       		                // Another inner try block
	       		                String str = null;
	       		                System.out.println(str.length()); // Trying to invoke a method on null object
	       		            } catch (NullPointerException e) {
	       		                // Inner catch block for NullPointerException
	       		                System.out.println("NullPointerException occurred: " + e.getMessage());
	       		            }
	       		            
	       		            // Simulating another potential exception (division by zero)
	       		            int a = 10, b = 0;
	       		            System.out.println(a / b); // Division by zero

	       		        } catch (ArithmeticException e) {
	       		            // Outer catch block for ArithmeticException
	       		            System.out.println("ArithmeticException occurred: " + e.getMessage());
	       		        } catch (Exception e) {
	       		            // Generic catch block for any other exceptions
	       		            System.out.println("Some other exception occurred: " + e.getMessage());
	       		        }
	       	}
	       	}
	   	}


   

