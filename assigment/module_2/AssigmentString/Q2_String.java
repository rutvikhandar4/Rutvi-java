package AssigmentString;

/*
 Write a Java program to print the ASCII value of a given character.
*/
import java.util.Scanner;

public class Q2_String {
	
                public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a character: ");
		        char inputChar = scanner.next().charAt(0);

		        int asciiValue = (int) inputChar;
		        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);
		    }
		}

