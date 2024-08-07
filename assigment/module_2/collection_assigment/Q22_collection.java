package collection_assigment;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Q22_collection 
{
	        public static void main(String[] args) {
	        // Create a HashSet of strings
	        HashSet<String> set = new HashSet<>();

	        // Add some elements to the HashSet
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Grapes");
	        set.add("Mango");

	        // Convert HashSet to ArrayList
	        List<String> list = new ArrayList<>(set);

	        // Print elements of the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (String fruit : list) {
	            System.out.println(fruit);
	        }
	    }
	}
	
