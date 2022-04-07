
public class Arrays {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		Arrays arrays = new Arrays();
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

	static void recursiveMethod(int n) {
		//this will be printed as usual
		System.out.println(n);
		if(n < 1) {
			System.out.println("n is less than 1");
		} else {
			recursiveMethod(n - 1);
			
			//this is printed after all recursions are called
			System.out.println(n);
		}
	}
}
