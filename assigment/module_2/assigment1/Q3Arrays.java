package assigment1;
import java.util.Arrays;
import java.util.Scanner;

public class Q3Arrays 
{
	/*
	Q-3  Write A Java Program to take two Array input from user and sort them in 
	      ascending or descending order as per user’s choice 
	 */

	
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the first array: ");
	        int size1 = scanner.nextInt();
	        int[] array1 = new int[size1];

	        System.out.print("Enter elements of the first array: ");
	        for (int i = 0; i < size1; i++)
	        {
	            array1[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the size of the second array: ");
	        int size2 = scanner.nextInt();
	        int[] array2 = new int[size2];

	        System.out.print("Enter elements of the second array: ");
	        for (int i = 0; i < size2; i++)
	        {
	            array2[i] = scanner.nextInt();
	        }

	        
	        System.out.print("Enter sorting order (ASC / DESC): ");
	        String sortOrder = scanner.next();

	        if (sortOrder.equalsIgnoreCase("ASC"))
	        {
	            Arrays.sort(array1);
	            Arrays.sort(array2);
	        }
	        else if (sortOrder.equalsIgnoreCase("DESC"))
	        {
	            Arrays.sort(array1);
	            Arrays.sort(array2);
	            reverseArray(array1);
	            reverseArray(array2);
	        }
	         else
	        {
	            System.out.println("Invalid input for sorting order. Defaulting to ascending order.");
	            Arrays.sort(array1);
	            Arrays.sort(array2);
	        }

	        // Display sorted arrays
	        System.out.println("Sorted first array: " + Arrays.toString(array1));
	        System.out.println("Sorted second array: " + Arrays.toString(array2));

	        scanner.close();
	    }

	    
	    private static void reverseArray(int[] arr) 
	    {
	        for (int i = 0; i < arr.length / 2; i++)
	        {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }
	    }
	
}
