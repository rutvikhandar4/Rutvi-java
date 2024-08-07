package collection_assigment;

/*
 Write a Java program to associate the specified value with the specified key in a Hash Map
 */
import java.util.HashMap;
public class Q14_collection 
{
	        public static void main(String[] args) {
	        // Create a new HashMap with key as String and value as Integer
	        HashMap<String, Integer> map = new HashMap<>();

	        // Associate values with keys using put method
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        // Print out the HashMap
	        System.out.println("HashMap after associating values:");
	        System.out.println(map);

	        // Adding another key-value pair
	        map.put("Four", 4);

	        // Print out the HashMap after adding a new key-value pair
	        System.out.println("\nHashMap after adding another key-value pair:");
	        System.out.println(map);
	    }
	}
	

