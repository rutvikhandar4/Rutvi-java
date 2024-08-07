package AssigmentString;

/*
 Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for each data type each data type
 */

public class Q13_String
{
		    // Method to print an integer
		    public void printn(int num) {
		        System.out.println("Printing integer: " + num);
		    }

		    // Method to print a double
		    public void printn(double num) {
		        System.out.println("Printing double: " + num);
		    }

		    // Method to print a float
		    public void printn(float num) {
		        System.out.println("Printing float: " + num);
		    }

		    // Method to print a long
		    public void printn(long num) {
		        System.out.println("Printing long: " + num);
		    }

		    // Method to print a string
		    public void printn(String str) {
		        System.out.println("Printing string: " + str);
		    }

		    public static void main(String[] args) {
		        Q13_String printer = new Q13_String();
		        
		        printer.printn(10);
		        printer.printn(3.14);
		        printer.printn(5.67f);
		        printer.printn(100000L);
		        printer.printn("Hello, World!");
		    }
		}


	

