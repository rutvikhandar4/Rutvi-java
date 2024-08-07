package collection_assigment;


import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
public class Q28_collection 
{
	        public static void main(String[] args) {
	        // Create a HashMap of integers (key) and strings (value)
	        Map<Integer, String> map = new HashMap<>();

	        // Add some key-value pairs to the map
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");

	        // Get the collection view of values from the map
	        Collection<String> values = map.values();

	        // Print the collection view of values
	        System.out.println("Collection view of values in the map:");
	        System.out.println(values);
	    }
	}
	
