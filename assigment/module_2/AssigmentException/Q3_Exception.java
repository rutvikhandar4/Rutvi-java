package AssigmentException;

/*
W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
exception and another one is to handle 
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 
*/



public class Q3_Exception 
{
   public static void main(String[] args) 
   {
	  {
	   	 int[] a = new int[5];

	   		        try {
	   		            a[5] = 30 / 0; 
	   		        } catch (ArithmeticException e) {
	   		            System.out.println("ArithmeticException caught: Attempted to divide by zero.");
	   		            e.printStackTrace();
	   		        } catch (ArrayIndexOutOfBoundsException e) {
	   		            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of range.");
	   		            e.printStackTrace();
	   		        }
	   		}
	   	
	   	}
   }

