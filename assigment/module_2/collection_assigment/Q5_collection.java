package collection_assigment;

/*
 Write a Java program to update specific array element by given element.
 */
import java.util.ArrayList;
public class Q5_collection 
{
	 public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> colorsList = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colorsList.add("Red");
	        colorsList.add("Green");
	        colorsList.add("Blue");
	        colorsList.add("Yellow");

	        // Specify the index of the element to update
	        int index = 1; // Index of the element to update (e.g., Green at index 1)

	        // Specify the new color to replace the existing element
	        String newColor = "Purple";

	        // Update the element at the specified index with the new color
	        colorsList.set(index, newColor);

	        // Print out the updated list of colors
	        System.out.println("Colors list after updating element at index " + index + ":");
	        for (String color : colorsList) {
	            System.out.println(color);
	        }
	    }
}
