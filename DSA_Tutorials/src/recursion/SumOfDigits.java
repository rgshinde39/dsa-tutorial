package recursion;

public class SumOfDigits {

	//print sum of digits in a integer for ex. 10 = 1, 41 = 5, 659=20
	
	public static void main(String[] args) {
		int number = 659;
		System.out.println("som of digits for "+number+" is "+sumOfDigits(number));
	}
	
	public static int sumOfDigits(int n) {
		if(n == 0 || n < 0) return 0;
		
		//use division to find individual digits in a number i.e. quotient + remainder
		//for each recursion remainder is considers and quotient is send back to get its sum of digits if its not a single digit number
		return n%10 + sumOfDigits(n/10);
	}
}
