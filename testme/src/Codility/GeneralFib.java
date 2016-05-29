package Codility;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

class GeneralFib {
	public static int solution(int N, int M) {
		int ans;
		ans = new Double(Math.pow(N, M)).intValue();

		return generalFib(ans) % 10000103;
	}

	private static int generalFib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		return generalFib(n - 1) + generalFib(n - 2);
	}

//	static BigInteger fib(long num) {
//		return new Object() {
//			private Map cache = new HashMap();
//
//			public BigInteger computeFib(long k) {
//				for (long i = 0; i <= k; i++)
//					cache.put(i, fib(i));
//				return (BigInteger) cache.get(k);
//			}
//
//			public BigInteger fib(long k) {
//				if (k == 0)
//					return new BigInteger("0");
//				else if (k <= 2)
//					return new BigInteger("1");
//				else
//					return ((BigInteger) cache.get(k - 1))
//							.add((BigInteger) cache.get(k - 2));
//			}
//		}.computeFib(num);
//	}
	
	
//	static BigInteger fib(long num) {
//		return new Object() {
//			private Map cache = new HashMap();
//
//			public BigInteger computeFib(long k) {
//				for (long i = 0; i <= k; i++)
//					cache.put(i, fib(i));
//				return (BigInteger) cache.get(k);
//			}
//
//			
//		}.computeFib(num);
//	}

	
	public static  BigInteger fib(long k) {
		if (k == 0)
			return new BigInteger("0");
		else if (k <= 2)
			return new BigInteger("1");
		else
		{
			return fib(k-1).add(fib(k-2));
		}
			
	}
	
	
	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3 };
//		solution(100000000, 13);
		fib(new Double(Math.pow(2,3)).longValue());
	}
}