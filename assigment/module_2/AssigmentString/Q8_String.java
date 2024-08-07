package AssigmentString;

/*
 W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True

 */

public class Q8_String 
{
   public static void main(String[] args) 
   {
	  
	   
	       
	           String mainString1 = "Java Exercises";
	           String checkString1 = "se";

	           // Check if mainString1 ends with checkString1
	           boolean endsWith1 = mainString1.endsWith(checkString1);

	           System.out.println("\"" + mainString1 + "\" ends with \"" + checkString1 + "\"? " + endsWith1);

	           String mainString2 = "Java Exercise";
	           String checkString2 = "se";

	           // Check if mainString2 ends with checkString2
	           boolean endsWith2 = mainString2.endsWith(checkString2);

	           System.out.println("\"" + mainString2 + "\" ends with \"" + checkString2 + "\"? " + endsWith2);
	       }
}