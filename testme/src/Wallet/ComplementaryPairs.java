package Wallet;

import java.util.HashMap;
import java.util.Map;

public class ComplementaryPairs {

	public static void main(String[] args) {

		// TEst the complementary pair Method
		int[] A = { 1, 5, 9 };
		System.out.println(getComplementaryPairs(6, A));
	}

	static int getComplementaryPairs(int k, int[] A) {
		Map<Integer, Integer> compMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {

			Integer complValue = k - A[i];
			// check if the map contains the value if so return the existence
			// value
			// if not exist return 0
			int tempValue = compMap.containsKey(complValue) ? compMap.get(complValue) : 0;
			compMap.put(complValue, tempValue + 1);
		}

		int counter = 0;
		for (int i = 0; i < A.length; i++) {
			counter += compMap.containsKey(A[i]) ? compMap.get(A[i]) : 0;
		}

		return counter;
	}
}