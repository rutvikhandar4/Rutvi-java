package assigment1;

/*
 Q-2  Write a java program to find out the 2nd max number from given array using 
	       function
	 */

	public class Q2Arrays
	{
		    public static void main(String[] args)
		    {
		        int[] array = { 10, 23, 15, 7, 45, 32, 17 };
		        int secondMax = findSecondMax(array);
		        System.out.println("Second largest number in the array: " + secondMax);
		    }

		    public static int findSecondMax(int[] array)
		    {
		        if (array.length < 2)
		        {
		            System.out.println("Array length should be at least 2");
		            return -1; 
		        }

		        int firstMax = Integer.MIN_VALUE;
		        int secondMax = Integer.MIN_VALUE;

		        for (int i = 0; i < array.length; i++)
		        {
		            if (array[i] > firstMax)
		            {
		                secondMax = firstMax;
		                firstMax = array[i];
		            }
		            else if (array[i] > secondMax && array[i] != firstMax) 
		            {
		                secondMax = array[i];
		            }
		        }

		        return secondMax;
		    }
		}

