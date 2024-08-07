package collection_assigment;

import java.util.HashMap;
import java.util.Map;
public class Q15_collection 
{
	        public static void main(String[] args) {
	        // Create a new HashMap with key as String and value as Integer
	        Map<String, Integer> map = new HashMap<>();

	        // Add some key-value mappings to the HashMap
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        // Count the number of key-value mappings in the HashMap
	        int size = map.size();

	        // Print out the size of the HashMap
	        System.out.println("Number of key-value mappings in the HashMap: " + size);
	    }
	}
	
