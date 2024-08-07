package collection_assigment;

/*
 Write a Java program to copy one array list into another.
 */
import java.util.ArrayList;

public class Q9_collection 
{
	

	    public static void main(String[] args) {
	        // Create the original ArrayList
	        ArrayList<String> originalList = new ArrayList<>();
	        originalList.add("Apple");
	        originalList.add("Banana");
	        originalList.add("Orange");

	        // Create a new ArrayList to copy into
	        ArrayList<String> copiedList = new ArrayList<>();

	        // Using addAll method to copy elements from originalList to copiedList
	        copiedList.addAll(originalList);

	        // Print out the original and copied ArrayLists
	        System.out.println("Original ArrayList: " + originalList);
	        System.out.println("Copied ArrayList: " + copiedList);
	    }
	}
	

