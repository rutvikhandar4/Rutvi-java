package assigment; 

/*Basic corejava Write a Java program that takes a year from user and print whether that year is a leap
year or not. B19.*/

import java.util.Scanner;

public class Basic3Module 
{
   public static void main(String[] args) 
   {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter a year");
	 int year=sc.nextInt();
	 
	 if(year%4==0 && year %100!=0 || (year% 400==0))
	 {
		 System.out.println(year+"is a leap year.");
	 }
	 else {
		 System.out.println(year+"is not a leap year.");
	 }
   }
}
