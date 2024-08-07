package AssigmentException;
/*
 W.A.J. P to demonstrate try catch block, 
*/

public class Q1_Exception 
{
     public static void main(String[] args) 
     {
     {
    	try {
    	 		   int[] numbers = {1, 2, 3};
    	 		    System.out.println(numbers[10]); 
    	 		    } catch (ArrayIndexOutOfBoundsException e) {
    	 		    // Handling the exception
    	 		    System.out.println("Exception caught: " + e);
    	 		     } finally {
    	 		     System.out.println("Finally block executed");
    	 		     }
    	 		        System.out.println("Program continues...");
    	 		    }

    	 	
     }
}
	

