package arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		ArrayRotation arrays = new ArrayRotation();
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		arrays.rotateArray(arr, 1, "left");
		arrays.printArray(arr);
		
		arrays.rotateArray(arr2, 1, "right");
		arrays.printArray(arr2);
	}
	
	public void rotateArray(int[] arr, int rotateCount, String direction) {
		if(direction.equals("left")) leftRotateArray(arr, rotateCount);
		else rightRotateArray(arr, rotateCount);
	}
	
	//for loop of number of rotation
	//get element on 0th index and keep it in temp variable
	//move next elements to left and at last index just add value of temp variable
	public void leftRotateArray(int[] arr, int rotateCount) {
		System.out.print("input array ");
		printArray(arr);
		for (int rotateCountIndex = 0; rotateCountIndex < rotateCount; rotateCountIndex++) {
			int temp = arr[0];
			for (int arrayRotationIndex = 0; arrayRotationIndex < arr.length; arrayRotationIndex++) {
				if(arrayRotationIndex == arr.length - 1) {
					arr[arrayRotationIndex] = temp;
					continue;
				}
				arr[arrayRotationIndex] = arr[arrayRotationIndex + 1];
			}
		}
		System.out.println("array rotated to left");
	}
	
	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public void rightRotateArray(int[] arr, int rotateCount) {
		System.out.print("input array ");
		printArray(arr);
		for (int rotateCountIndex = 0; rotateCountIndex < rotateCount; rotateCountIndex++) {
			int temp = arr[arr.length - 1];
			for (int arrayRotationIndex = arr.length - 1; arrayRotationIndex >=0 ; arrayRotationIndex--) {
				if(arrayRotationIndex == 0) {
					arr[arrayRotationIndex] = temp;
					continue;
				}
				arr[arrayRotationIndex] = arr[arrayRotationIndex - 1];
			}
		}
		System.out.println("array rotated to right");
	}
}
