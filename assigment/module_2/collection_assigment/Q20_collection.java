package collection_assigment;

import java.util.ArrayList;
public class Q20_collection 
{
	       public static void main(String[] args) {
	        // Create the first ArrayList of integers
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        // Create the second ArrayList of integers
	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);

	        // Joining the two ArrayLists using addAll method
	        list1.addAll(list2);

	        // Print out the joined ArrayList
	        System.out.println("Joined ArrayList:");
	        System.out.println(list1);
	    }
	}
	
