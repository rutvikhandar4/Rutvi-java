package collection_assigment;

/*
 Write a Java program to iterate through all elements in a hash list.
 */
import java.util.HashMap;
import java.util.Map;
public class Q12_collection 
{
	
            public static void main(String[] args) {
	        // Create a new HashMap with key as Integer and value as String
	        HashMap<Integer, String> map = new HashMap<>();

	        // Adding some key-value pairs to the HashMap
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Orange");
	        map.put(4, "Grapes");
	        map.put(5, "Mango");

	        // Method 1: Iterate over keys using enhanced for loop
	        System.out.println("Iterating over keys using enhanced for loop:");
	        for (Integer key : map.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + map.get(key));
	        }

	        // Method 2: Iterate over entries using enhanced for loop
	        System.out.println("\nIterating over entries using enhanced for loop:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Method 3: Iterate over keys using iterator
	        /*
	        System.out.println("\nIterating over keys using iterator:");
	        Iterator<Integer> iterator = map.keySet().iterator();
	        while (iterator.hasNext()) {
	            Integer key = iterator.next();
	            System.out.println("Key: " + key + ", Value: " + map.get(key));
	        }
	        */
	    }
	}

	

