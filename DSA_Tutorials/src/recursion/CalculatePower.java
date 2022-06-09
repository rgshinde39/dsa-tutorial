package recursion;

public class CalculatePower {

	public static void main(String[] args) {
		
		//power formula Xn = X * Xn-1 
		//2 with power of 4 = 2*2*2*2
		int number = 2;
		int power = 4;
		System.out.println("power of "+number+" is "+calcPower(number, power));
	}
	
	public static int calcPower(int number, int power) {
		if(power < 0 ) return -1;
		if(power == 0) return 1;
		return number * calcPower(number, power - 1);
	}
}
