package AssigmentString;

/*
 W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False 13

 */

public class Q9_String 
{
   public static void main(String[] args) 
   {
	  
	   
	     
	           String mainString1 = "Red is favorite color.";
	           String checkString1 = "Red";

	           // Check if mainString1 starts with checkString1
	           boolean startsWith1 = mainString1.startsWith(checkString1);

	           System.out.println("\"" + mainString1 + "\" Starts with \"" + checkString1 + "\"? " + startsWith1);

	           String mainString2 = "Orange is also my favorite color.";
	           String checkString2 = "Red";

	           // Check if mainString2 starts with checkString2
	           boolean startsWith2 = mainString2.startsWith(checkString2);

	           System.out.println("\"" + mainString2 + "\" Starts with \"" + checkString2 + "\"? " + startsWith2);
	       }
	   


	   
}

