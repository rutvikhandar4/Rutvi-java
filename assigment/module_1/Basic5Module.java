package assigment;

import java.util.Scanner;

/*Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop*/

public class Basic5Module 
{
   public static void main(String[] args) 
   {
	      Scanner sc=new Scanner(System.in);
	      int sum=0;
	      
	      System.out.println("enter 5 numbers:");
	      
	      
	      for(int i=0; i<5; i++)
	      {
	    	  sum+=sc.nextInt();
	      }
	      
	      double average=(double)sum/5;
	      
	      System.out.println("sum of the number: "+sum);
	      System.out.println("average of the number: "+average);
   }
}
