package collection_assigment;
/*
Write a Java program to append the specified element to the end of a hash set.
 */
import java.util.HashSet;
public class Q11_collection 
{
	
           public static void main(String[] args) {
	        // Create a new HashSet of strings
	        HashSet<String> colors = new HashSet<>();

	        // Adding some colors to the HashSet
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        // Print out the HashSet before appending
	        System.out.println("HashSet before appending:");
	        System.out.println(colors);

	        // Append (add) a new color to the HashSet
	        String newColor = "Yellow";
	        colors.add(newColor);

	        // Print out the HashSet after appending
	        System.out.println("\nHashSet after appending:");
	        System.out.println(colors);
	    }
	}
	

