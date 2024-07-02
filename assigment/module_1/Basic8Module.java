package assigment;

/*Write a Java program that reads a positive integer and count the number of digits
the number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6
 */
import java.util.Scanner;
public class Basic8Module 
{
  public static void main(String[] args) 
  {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("input an integer number less than ten billion");
	 long number = sc.nextLong();
	 
	 int digits=0;
	 for(long r=number;r!=0; r/=10)
	 {
		 digits++;
	 }
	 System.out.println("number of digits in the number: "+digits);
  }
}
