package assigment;

import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message.*/

public class Basic2Module 
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a single character from the alphaber");
	String input=sc.nextLine();
	
	if(input.length()==1&&Character.isLetter(input.charAt(0)))
	{
		char ch=input.charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='U')
		{
			
			System.out.println(ch + "is a vowel.");
		}
		else {
			System.out.println(ch+"is a consonant");
		}
		
	}
	else {
		System.out.println("error: input is not a single letter.");
	}
}
}


