package collection_assigment;

/*
 Write a Java program to iterate through all elements in an array list
 */
import java.util.ArrayList;
public class Q2_collection 
{
	public static void main(String[] args) 
	    {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbersList = new ArrayList<>();

	        // Add some numbers to the ArrayList
	        numbersList.add(10);
	        numbersList.add(20);
	        numbersList.add(30);
	        numbersList.add(40);

	        // Iterate through all elements in the ArrayList
	        System.out.println("Iterating through all elements in the ArrayList:");
	        for (Integer number : numbersList) {
	            System.out.println(number);
	        }
	    }
	}


