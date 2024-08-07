package collection_assigment;

import java.util.ArrayList;
import java.util.Collections;

public class Q16_collection 
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

	        // Print out the ArrayList before reversing
	        System.out.println("ArrayList before reversing:");
	        System.out.println(numbers);

	        // Reverse the ArrayList using Collections.reverse method
	        Collections.reverse(numbers);

	        // Print out the reversed ArrayList
	        System.out.println("\nArrayList after reversing:");
	        System.out.println(numbers);
	    }
	}
	

