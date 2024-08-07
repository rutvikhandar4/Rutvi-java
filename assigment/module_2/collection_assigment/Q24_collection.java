package collection_assigment;

import java.util.ArrayList;

public class Q24_collection 
{
	
            public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Print initial capacity and size of the ArrayList
	        System.out.println("Initial Capacity of ArrayList: " + numbers.size());

	        // Add some elements to the ArrayList
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);

	        // Print current capacity and size of the ArrayList
	        System.out.println("Current Capacity of ArrayList: " + numbers.size());

	        // Add more elements to the ArrayList
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);

	        // Print updated capacity and size of the ArrayList
	        System.out.println("Updated Capacity of ArrayList: " + numbers.size());
	    }
	}
	
