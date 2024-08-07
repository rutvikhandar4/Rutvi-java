package collection_assigment;

import java.util.ArrayList;

public class Q26_collection 
{ 
	     public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Print all elements with their positions
	        System.out.println("Elements of the ArrayList with their positions:");
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println("Position " + i + ": " + numbers.get(i));
	        }
	    }
	}
	
