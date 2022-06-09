package recursion;
public class RecursionPrograms {

	public static void main(String[] args) {
		RecursionPrograms recursion = new RecursionPrograms();
		
//		int number = 6;
//		System.out.println("factorial of "+number+" is "+recursion.getFactorial(number));
		
		int number = 10;//fibonacci series - 0,1,1,2,3,5,8,13,21,34,55,89......
		System.out.println("finonacci of "+number+" is "+recursion.fibonacci(number));
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
	
	public int getFactorial(int n) {
		
		//step 3: the constraint
		if(n < 0) {
			return -1;
		}
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		//step 1: the actual flow
		return n * getFactorial(n - 1);
	}
	
	public int fibonacci(int n) {
		
		//step 3: the constraint
		if(n < 0) {
			return -1;
		}
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		//step 1: the actual flow
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
