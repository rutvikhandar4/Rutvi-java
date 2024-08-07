package assigment1;
import java.util.Scanner;

/*Q-6 Write a java program to reverse a string and check that the string is palindrome or 
not....
*/
public class Q6Arrays{
	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);
	        
	        if (isPalindrome(input))
	        {
	            System.out.println("The original string is a palindrome.");
	        } else 
	        {
	            System.out.println("The original string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }
	    
	    // Function to reverse a string
	    public static String reverseString(String input) 
	    {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = input.length() - 1; i >= 0; i--)
	        {
	            reversed.append(input.charAt(i));
	        }
	        return reversed.toString();
	    }
	    
	    // Function to check if a string is palindrome
	    public static boolean isPalindrome(String input)
	    {
	        String reversed = reverseString(input);
	        return input.equals(reversed);
	    }
	}
    
