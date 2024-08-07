package collection_assigment;

/*
 Write a Java program to create a new array list, add some colors (string) and print out the collection.
 */
import java.util.ArrayList;
public class Q1_collection 
{
	
  
	    public static void main(String[] args)
	    {
	        // Create a new ArrayList to store colors
	        ArrayList<String> colorsList = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colorsList.add("Red");
	        colorsList.add("Blue");
	        colorsList.add("Green");
	        colorsList.add("Yellow");

	        // Print out the collection of colors
	        System.out.println("Colors in the ArrayList:");
	        for (String color : colorsList) {
	            System.out.println(color);
	        }
	    }
	}
