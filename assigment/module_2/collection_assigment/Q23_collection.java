package collection_assigment;


import java.util.HashMap;
import java.util.Map;

public class Q23_collection 
{



	    public static void main(String[] args)
	    {
	        // Create a HashMap of strings (key) and integers (value)
	        Map<String, Integer> map = new HashMap<>();

	        // Check if the map is empty
	        if (map.isEmpty()) {
	            System.out.println("Map is empty.");
	        } else {
	            System.out.println("Map is not empty.");
	        }

	        // Adding some key-value mappings to the map
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        // Check again if the map is empty
	        if (map.isEmpty()) {
	            System.out.println("Map is empty.");
	        } else {
	            System.out.println("Map is not empty.");
	        }
	    }
	}
	
