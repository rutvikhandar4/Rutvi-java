package assigment1;

/*
 Q-1 Write a java program to find out the max number from given array using function....
	 
 */

public class Q1Arrays
	   {
	    public static int findMax(int[] arr)
	   {
	        if (arr == null || arr.length == 0)
	        {
	            throw new IllegalArgumentException("Array must not be empty or null");
	        }

	        int max = arr[0]; 

	           for (int i = 1; i < arr.length; i++) 
	        {
	            if (arr[i] > max)
	        {
	                max = arr[i]; 
	        }
	        }

	        return max;
	    }

	    public static void main(String[] args) 
	    {
	    	 int[] array = { 3, 7, 2, 1, 8, 4, 5 };
	         int maximum = findMax(array);
	         System.out.println("The maximum number in array is : "+maximum);
	    }
	    
	   
	}

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
