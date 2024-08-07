package collection_assigment;
import java.util.HashSet;
import java.util.Set;

public class Q27_collection 
{
	
            public static void main(String[] args) {
	        // Create the first set
	        Set<String> set1 = new HashSet<>();
	        set1.add("Apple");
	        set1.add("Banana");
	        set1.add("Cherry");

	        // Create the second set
	        Set<String> set2 = new HashSet<>();
	        set2.add("Banana");
	        set2.add("Date");
	        set2.add("Cherry");

	        // Print the original sets
	        System.out.println("Original Set 1: " + set1);
	        System.out.println("Original Set 2: " + set2);

	        // Retain only the common elements in set1
	        set1.retainAll(set2);

	        // Print the set after retaining common elements
	        System.out.println("\nSet after retaining common elements:");
	        System.out.println(set1);
	    }
	}
	
