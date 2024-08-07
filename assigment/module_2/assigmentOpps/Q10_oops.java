package assigmentOpps;

/*
 Write a program to print the factorial of a number by defining a method named 
  'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. 
   *(n-1) *n.E.g.- 
    4! = 1*2*3*4 = 24 
    3! = 3*2*1 = 6         2! = 2*1 = 2               Also, 1! = 1           0! = 0
 */

public class Q10_oops 
{
   public static void main(String[] args) 
   {
	  int num = 4;
	  long factorial = Factorial(num);
	  System.out.println(num+"! ="+factorial);
	  
    }
   static long Factorial(int n)
   {
	   if(n==0)
	   {
		   return 1;
	   }
	   else
	   {
		   long result = 1;
		   for(int i = 1; i<=n; i++)
		   
		   {
			  result*=i; 
		   }
		   return result;
	   }
   }
}
