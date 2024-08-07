package AssigmentString;

/*
 W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is o
 */

public class Q5_String 
{
	            public static void main(String[] args) {
		        String originalString = "Tops Technologies!";
		        int index1 = 0;
		        int index2 = 10;

		        char charAtIndex1 = originalString.charAt(index1);
		        char charAtIndex2 = originalString.charAt(index2);

		        System.out.println("Original String = " + originalString);
		        System.out.println("The character at position " + index1 + " is " + charAtIndex1);
		        System.out.println("The character at position " + index2 + " is " + charAtIndex2);
		    }
		
		}

