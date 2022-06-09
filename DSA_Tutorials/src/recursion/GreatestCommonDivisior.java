package recursion;

public class GreatestCommonDivisior {

	//GCD of 2 number is the larget positive number which divides both numbers without the remainder
	//we use Euclidean algorithm here gcd(a, b) = gcd(b, a % b) if b=0 then gcd=a
	public static void main(String[] args) {
		System.out.println(gcd(48,18));
	}
	
	public static int gcd(int a, int b) {
		if(a<0 || b<0) return -1;
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}
