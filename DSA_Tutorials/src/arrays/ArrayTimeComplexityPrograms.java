package arrays;

import java.util.Arrays;

public class ArrayTimeComplexityPrograms {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
//		sumAndProductOfArray(array);
//		printPairsInArray(array);
//		pintUnorderredPairsInArray(array);
		reverseArray(array);
	}
	
	public static void sumAndProductOfArray(int[] array) {
		int sum = 0;//O(1)
		int product = 1;//O(1)
		for (int i = 0; i < array.length; i++) {//O(n)
			sum += array[i];//O(1)
		}
		for (int i = 0; i < array.length; i++) {//O(n)
			product *= array[i];//O(1)
		}
		System.out.println(sum+", "+product);//O(1)
		//we can ignore non dominant terms like O(1)
		//here we will perform time complexity addition, O(n) + O(n) = 2O(n) here will ignore the constant
		//so final time complexity is O(n)
	}
	
	public static void printPairsInArray(int[] array) {
		for (int i = 0; i < array.length; i++) {//O(n)
			for (int j = 0; j < array.length; j++) {//O(n)
				System.out.println(array[i]+", "+array[j]);//O(1)
			}
		}
		//we can ignore non dominant terms like O(1)
		//here we will perform time complexity multiplication since its a nested for loop 
		//O(n) * O(n) = final time complexityO(n*2)
	}
	
	public static void printUnorderredPairsInArray(int[] array) {
		for (int i = 0; i < array.length; i++) {//O(n)
			for (int j = i+1; j < array.length; j++) {//n/2 - using average work method
				System.out.println(array[i]+", "+array[j]);//O(1)
			}
		}
		//we can ignore non dominant terms like O(1)
		//we will use average work method to calculate inner loop time comp
		//assume arrays has 10 elements and each nested loop iteration is reduced by 1
		//we can assume the average to be around 5 iteration
		//10/2 = 5, so we have n/2
		//n*n/2 = final time complexity O(n2) n square
	}
	
	public static void compareTwoArrays(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = i+1; j < array2.length; j++) {
				//some O(1)
			}
		}
		//time comp will be O(ab)
		//where a = array1.length, b = array2.length
	}
	
	public static void compareThreeArrays(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = i+1; j < array2.length; j++) {
				for (int k = 0; k < 1000000; k++) {
					//some O(1)
				}
			}
		}
		//here even though a third array exists but since its iteration is constant between 0 to 1000000, we consider it 
		//as O(1) and hence ignore it
		//time comp will be O(ab), as per previous example
		//where a = array1.length, b = array2.length
	}
	
	public static void reverseArray(int[] array) {
		for (int i = 0; i < array.length/2; i++) {//O(n/2) lets remove constanct 1/2, so time comp O(n)
			int other = array.length-i-1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
