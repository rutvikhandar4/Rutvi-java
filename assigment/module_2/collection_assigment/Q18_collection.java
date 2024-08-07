package collection_assigment;

import java.util.ArrayList;
public class Q18_collection 
{ 
	

	
	    public static void main(String[] args) {
	        // Create the first ArrayList of integers
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        // Create the second ArrayList of integers
	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(1);
	        list2.add(2);
	        list2.add(3);

	        // Compare the two ArrayLists using equals method
	        boolean isEqual = list1.equals(list2);

	        // Print out the result of the comparison
	        if (isEqual) {
	            System.out.println("The ArrayLists are equal.");
	        } else {
	            System.out.println("The ArrayLists are not equal.");
	        }
	    }
	}
