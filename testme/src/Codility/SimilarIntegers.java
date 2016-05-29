package Codility;

class SimilarIntegers {
	public static int solution(int N) {
		String num = Integer.toString(N);
		int length = num.length();

		// get the Factorial of the length
		int total = factorial(length);
		int[] a = new int[10];

		// Iterate to get the represent digits in the given Number
		for (int x = 0; x < num.length(); x++) {
			a[Integer.valueOf(String.valueOf(num.charAt(x)))]++;
		}

		for (int x = 0; x < a.length; x++) {
			total = total / factorial(a[x]);
		}
		return total;
	}

	// helper method to get the factorial
	public static int factorial(int n) {
//		int a = 1;
//		for (int i = n; i >= 1; i--) {
//			a = a * i;
//		}
//		return a;
//		
		if(n<=1){
			return 1;
		}
		return n*factorial(n-1);
		
	}

	public static void main(String[] args) {

		// System.out.println(solution(16));
		// System.out.println(solution(1213));
		System.out.println(solution(55));
		System.out.println(solution(22));
		// System.out.println(solution(325));
	}
}