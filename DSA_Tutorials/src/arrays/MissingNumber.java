package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
//		new MissingNumber().missingNumber(intArray);
		new MissingNumber().findMissingNumberBySum(intArray);
	}

	public void missingNumber(int[] intArray) {
		for (int i = 0; i < 10; i++) {
			if(i+1 != intArray[i]) {//method 1
				//this approach is time efficient, as it doed not need second array iteration
				System.out.println("missing number is " + (i+1));
				return;
			}
//			if (!checkForNumber(i, intArray)) {//method 2
//				System.out.println("missing number is " + i);
//			}
		}
	}

	public boolean checkForNumber(int number, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (number == array[i])
				return true;
		}
		return false;
	}
	
	public void findMissingNumberBySum(int[] arr) {//method 3
		//formula to sum integers in array n(n+1)/2
		int sum = 10*(10+1)/2;
		int arraySum = 0;
		for (int i : arr) {
			arraySum += i;
		}
		System.out.println("missing number is "+(sum - arraySum));
	}
}
