package collection_assigment;

import java.util.HashSet;
public class Q21_collection 
{
            public static void main(String[] args) 
            {
	        // Create a HashSet of strings
	        HashSet<String> set = new HashSet<>();

	        // Add some elements to the HashSet
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Grapes");
	        set.add("Mango");

	        // Convert HashSet to an array of strings
	        String[] array = new String[set.size()];
	        set.toArray(array);

	        // Print the elements of the array
	        System.out.println("Elements in the array:");
	        for (String fruit : array) {
	            System.out.println(fruit);
	        }
	    }
	}
	
