package arrays;

import java.util.Arrays;

public class RotateMultiDimeArray {
	public static void main(String[] args) {
		int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		//output {{7,4,1}, {8,5,2}, {9,6,3}}
		
		int [][] rotatedMatrix = rotate90Degree(matrix);
		if(rotatedMatrix != null) {
			System.out.println(Arrays.deepToString(rotatedMatrix));
		} else {
			System.out.println("could not rotate matrix");
		}
	}
	
	public static int [][] rotate90Degree(int [][] matrix) {
		//no of rows and cols should be same for rotation
		if(matrix.length == 0 || matrix.length != matrix[0].length) return null;
		int arrayLength = matrix.length;
		int [][] rotatedMatrix = new int[arrayLength][arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayLength; j++) {
				rotatedMatrix[j][arrayLength - 1 - i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}
}
