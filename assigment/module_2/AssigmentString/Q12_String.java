package AssigmentString;

/*
 Create a class to print an integer and a character with two methods having the same name but different 
 sequence of the integer and the character parameters. For example, if the parameters of the first method 
 are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
 */

public class Q12_String 
{
   
	  
		       // Method to print an integer followed by a character
		       public void print(int n, char c) {
		           System.out.println("Printing integer first: " + n + ", then character: " + c);
		       }

		       // Method to print a character followed by an integer
		       public void print(char c, int n) {
		           System.out.println("Printing character first: " + c + ", then integer: " + n);
		       }

		       public static void main(String[] args) {
		           Q12_String printer = new Q12_String();
		           
		           printer.print(10, 'A');
		           printer.print('B', 20); 
		       }
		   }


