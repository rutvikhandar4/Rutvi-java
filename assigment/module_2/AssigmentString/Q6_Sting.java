package AssigmentString;
/*
 W.A.J.P to concatenate a given string to the end of another string.
 */

public class Q6_Sting 
{
	       public static void main(String[] args) {
	        String originalString = "Hello, ";
	        String appendString = "world!";

	        // Using concat() method
	        String concatenatedString1 = originalString.concat(appendString);

	        // Using + operator
	        String concatenatedString2 = originalString + appendString;

	        System.out.println("Original String: " + originalString);
	        System.out.println("String to append: " + appendString);
	        System.out.println("Concatenated String using concat(): " + concatenatedString1);
	        System.out.println("Concatenated String using + operator: " + concatenatedString2);
	    }
	}




