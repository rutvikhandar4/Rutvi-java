package collection_assigment;

import java.util.ArrayList;
import java.util.List;

public class Q17_collection 
{

	        public static void main(String[] args) {
	        // Create a new ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Adding some numbers to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Print out the original ArrayList
	        System.out.println("Original ArrayList:");
	        System.out.println(numbers);

	        // Extract a portion of the ArrayList using subList method
	        List<Integer> subList = numbers.subList(1, 4); // Extracts elements from index 1 to 3 (exclusive)

	        // Print out the extracted sublist
	        System.out.println("\nExtracted Sublist (from index 1 to 3):");
	        System.out.println(subList);
	    }
	}
	
