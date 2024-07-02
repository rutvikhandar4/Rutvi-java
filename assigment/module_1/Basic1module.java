package assigment;
//Write a Java program to Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class Basic1module 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number one");
		int a=sc.nextInt();
		System.out.println("enter the number two");
		int b=sc.nextInt();
		System.out.println("enter the number three");
		int c=sc.nextInt();
		
		if(a>=b && a>=c)
		{
	       System.out.println("number a is gretest number: " +a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("number b is gretest number:" +b);
		}
		else {
			System.out.println("number c is gretest number :"+c);
		}
	}
}
