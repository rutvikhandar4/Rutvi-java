package collection_assigment;

/*
 Write a Java program to get the number of elements in a hash set.
 */
import java.util.HashSet;
public class Q13_collection 
{

            public static void main(String[] args) {
	        // Create a new HashSet of integers
	        HashSet<Integer> numbers = new HashSet<>();

	        // Adding some numbers to the HashSet
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Get the number of elements in the HashSet
	        int size = numbers.size();

	        // Print out the number of elements
	        System.out.println("Number of elements in the HashSet: " + size);
	    }
	}
	

