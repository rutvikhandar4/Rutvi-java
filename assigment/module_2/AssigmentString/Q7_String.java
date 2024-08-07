package AssigmentString;
/*
 W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
 */

public class Q7_String
{
	public static void main(String[] args) 
	{
		
                String str1 = "topsint.com";
		        String str2 = "topsint.com";

		        // Comparing two strings for an exact match
		        boolean isEqual1 = str1.equals(str2);

		        // Comparing two strings ignoring the case
		        boolean isEqual2 = str1.equalsIgnoreCase(str2);

		        System.out.println("Comparing " + str1 + " and " + str2 + ": " + isEqual1);
		        System.out.println("Comparing " + str1 + " and " + str2 + " ignoring case: " + isEqual2);
		    }
		}



	
