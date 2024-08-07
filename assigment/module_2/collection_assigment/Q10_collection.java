package collection_assigment;

/*
 Write a Java program to shuffle elements in an array list.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Q10_collection 
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

	        // Print out the ArrayList before shuffling
	        System.out.println("ArrayList before shuffling:");
	        System.out.println(numbers);

	        // Shuffle the ArrayList using Collections.shuffle method
	        Collections.shuffle(numbers);

	        // Print out the shuffled ArrayList
	        System.out.println("\nArrayList after shuffling:");
	        System.out.println(numbers);
	    }
	}
	
	        

