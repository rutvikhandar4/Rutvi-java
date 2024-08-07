package collection_assigment;

/*
Write a Java program to insert an element into the array list at the first position.

 */
import java.util.ArrayList;
public class Q3_collection 
{

	       public static void main(String[] args) 
	       {
	        // Create an ArrayList of strings
	        ArrayList<String> fruitsList = new ArrayList<>();

	        // Add some fruits to the ArrayList
	        fruitsList.add("Apple");
	        fruitsList.add("Banana");
	        fruitsList.add("Orange");

	        // Insert a new fruit at the first position (index 0)
	        fruitsList.add(0, "Mango");

	        // Print out the updated list of fruits
	        System.out.println("Fruits after inserting at the first position:");
	        for (String fruit : fruitsList) {
	            System.out.println(fruit);
	        }
	    }
	
}
