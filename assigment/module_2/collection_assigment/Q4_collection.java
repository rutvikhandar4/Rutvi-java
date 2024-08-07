package collection_assigment;

/*
 Write a Java program to retrieve an element (at a spec. index) from a given array list.
 */
import java.util.ArrayList;

public class Q4_collection 
{
	
           public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbersList = new ArrayList<>();

	        // Add some numbers to the ArrayList
	        numbersList.add(10);
	        numbersList.add(20);
	        numbersList.add(30);
	        numbersList.add(40);

	        // Specify the index of the element to retrieve
	        int index = 2; // Index starts from 0, so index 2 corresponds to the 3rd element

	        // Retrieve the element at the specified index
	        int element = numbersList.get(index);

	        // Print out the retrieved element
	        System.out.println("Element at index " + index + ": " + element);
	    }
}
