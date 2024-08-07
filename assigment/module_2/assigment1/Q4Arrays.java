package assigment1;//

/*
 Q-4  Write a java program to make addition, Subtraction and multiplication of two 
      matrix using 2-D Array
 */

import java.util.Scanner;

public class Q4Arrays
{

    // Function to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) 
    {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++)
     {
            for (int j = 0; j < cols; j++)
      {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return result;
    }
    
   // two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B)
   {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
         for (int i = 0; i < rows; i++) 
            {
            for (int j = 0; j < cols; j++)
            {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        
         return result;
    }
    
    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B)
    {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        
          for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsB; j++) 
            {
                for (int k = 0; k < colsA; k++)
                {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
          return result;
    }
    
    // Function to print a matrix
    public static void printMatrix(int[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Input matrices A and B
        System.out.println("Enter number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.println("Enter number of columns for matrix A: ");
        int colsA = scanner.nextInt();
        
        int[][] A = new int[rowsA][colsA];
        
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < rowsA; i++)
        {
            for (int j = 0; j < colsA; j++) 
         {
                A[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.println("Enter number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        
        int[][] B = new int[rowsB][colsB];
        
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
        // Perform addition, subtraction, and multiplication
        if (rowsA == rowsB && colsA == colsB)
        {
            int[][] sum = addMatrices(A, B);
            int[][] difference = subtractMatrices(A, B);
            int[][] product = multiplyMatrices(A, B);
            
            // Print results
            System.out.println("\nMatrix A:");
            printMatrix(A);
            
            System.out.println("\nMatrix B:");
            printMatrix(B);
            
            System.out.println("\nSum of A and B:");
            printMatrix(sum);
            
            System.out.println("\nDifference of A and B:");
            printMatrix(difference);
            
            System.out.println("\nProduct of A and B:");
            printMatrix(product);
        } 
        else 
        {
            System.out.println("Matrices cannot be added, subtracted, or multiplied due to incompatible dimensions.");
        }
        
        scanner.close();
    }
}
   
