package assigment;
/*Write a program in Java to make such a pattern like right angle triangle with number increased by 1 the pattern like
 1
 2 3
 4 5 6
 7 8 9 10
 
 * 
 * 
 * 
 * */

public class Basic7Module 
{
   public static void main(String[] args) 
   {
	   int number=1;
	   for(int i=1; i<=4; i++)
	   {
		   for(int j=1; j<=i; j++)
		   {
			   System.out.print(number+" ");
			   number++;
//			 
		   }
		   System.out.println();
	   }
   }
}
