package AssigmentString;

import java.util.Scanner;

/*
 Write a Java program to count the letters, spaces, numbers and other characters of an  input string
 */

public class Q1_String 
{
   public static void main(String[] args) 
   {
	 
	           Scanner scanner = new Scanner(System.in);
	           System.out.println("Enter a string: ");
	           String input = scanner.nextLine();

	           int letterCount = 0;
	           int spaceCount = 0;
	           int numberCount = 0;
	           int otherCount = 0;

	           for (int i = 0; i < input.length(); i++) {
	               char ch = input.charAt(i);
	               if (Character.isLetter(ch)) {
	                   letterCount++;
	               } else if (Character.isDigit(ch)) {
	                   numberCount++;
	               } else if (Character.isWhitespace(ch)) {
	                   spaceCount++;
	               } else {
	                   otherCount++;
	               }
	           }

	           System.out.println("Letter count: " + letterCount);
	           System.out.println("Space count: " + spaceCount);
	           System.out.println("Number count: " + numberCount);
	           System.out.println("Other character count: " + otherCount);
	       }
	   }



