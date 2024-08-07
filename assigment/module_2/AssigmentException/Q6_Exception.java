package AssigmentException;

/*
 • W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid
 */

public class Q6_Exception 
{
    public static void main(String[] args) 
    {
    	
    	
    	  
    	        try {
    	            validateAge(16);
    	        } catch (ArithmeticException e) {
    	            System.out.println("Exception in thread main java.lang.ArithmeticException: not valid");
    	        }
    	    }

    	    public static void validateAge(int age) {
    	        if (age < 18) {
    	            throw new ArithmeticException("not valid");
    	        } else {
    	            System.out.println("Welcome to vote");
    	        }
    	    }
    	}
    
