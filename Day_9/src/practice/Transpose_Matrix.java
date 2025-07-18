package practice;
import java.util.*;

public class Transpose_Matrix {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();
	        
	        int[][] matrix = new int[rows][cols];
	        System.out.println("Enter the elements of the matrix:");
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("\nOriginal Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        int[][] transpose = new int[cols][rows];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }
	        System.out.println("\nTransposed Matrix:");
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }
	        sc.close();
	}
}
