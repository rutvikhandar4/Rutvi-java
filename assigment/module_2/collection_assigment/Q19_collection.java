package collection_assigment;


import java.util.ArrayList;
import java.util.Collections;
public class Q19_collection 
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

	        // Print out the ArrayList before swapping
	        System.out.println("ArrayList before swapping:");
	        System.out.println(numbers);

	        // Swap elements at index 1 and index 3
	        int index1 = 1;
	        int index2 = 3;
	        Collections.swap(numbers, index1, index2);

	        // Print out the ArrayList after swapping
	        System.out.println("\nArrayList after swapping elements at index " + index1 + " and index " + index2 + ":");
	        System.out.println(numbers);
	    }
	}
	

