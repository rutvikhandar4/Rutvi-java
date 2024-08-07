package collection_assigment;

/*
 Write a Java program to search an element in an array list.
 */
import java.util.ArrayList;

public class Q7_collection 
{



	    public static void main(String[] args) {
	        // Create a new ArrayList of strings
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Element to search for
	        String searchElement = "Blue";

	        // Check if the ArrayList contains the search element
	        if (colors.contains(searchElement)) {
	            System.out.println("Element '" + searchElement + "' found in the ArrayList.");
	        } else {
	            System.out.println("Element '" + searchElement + "' not found in the ArrayList.");
	        }
	    }
	}
	

