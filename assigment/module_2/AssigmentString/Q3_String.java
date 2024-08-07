package AssigmentString;

/*
 Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5
 5+55+555

 */
import java.util.Scanner;

public class Q3_String{
	

		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a number: ");
		        int n = scanner.nextInt();

		        int nn = n * 11;  // n + nn = n * 11
		        int nnn = n * 111;  // n + nn + nnn = n + n * 11 + n * 111

		        int result = n + nn + nnn;
		        System.out.println("Result: " + result);
		    }
		}



