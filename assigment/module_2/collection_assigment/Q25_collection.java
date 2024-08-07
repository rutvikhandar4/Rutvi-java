package collection_assigment;

import java.util.ArrayList;
public class Q25_collection
{

	        public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> list = new ArrayList<>();

	        // Add some elements to the ArrayList
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Print the ArrayList before replacement
	        System.out.println("ArrayList before replacement:");
	        System.out.println(list);

	        // Replace the second element with "Mango"
	        if (list.size() >= 2) {
	            list.set(1, "Mango");
	        } else {
	            System.out.println("ArrayList has less than 2 elements. Cannot replace.");
	        }

	        // Print the ArrayList after replacement
	        System.out.println("\nArrayList after replacing the second element:");
	        System.out.println(list);
	    }
	}
	
