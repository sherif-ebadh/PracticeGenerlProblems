package Wallet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SelectKWords {

	public static void main(String[] args) {

		try {
			displayTopKWords("c:\\test.txt", 3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String[] displayTopKWords(String filePath, final int k) throws IOException {
		File file = new File(filePath);
		BufferedReader bufferedReader = null;
		bufferedReader = new BufferedReader(new FileReader(file));
		String inputLine = null;
		final Map<String, Integer> frequencyMap = new HashMap<String, Integer>();

		try {
			while ((inputLine = bufferedReader.readLine()) != null) {
				final String[] words = inputLine.split("\\|");
				for (final String word : words) {
					int freq = 1;
					if (frequencyMap.containsKey(word)) {
						freq = frequencyMap.get(word) + 1;
					}

					// update the frequency map
					frequencyMap.put(word, freq);
				}
			}

			// Find kth largest frequency which is same as (n-k)th smallest
			// frequency
			final int[] frequencies = new int[frequencyMap.size()];
			int i = 0;
			for (final int value : frequencyMap.values()) {
				frequencies[i++] = value;
			}

			final int kthLargestFreq = kthSmallest(frequencies, 0, i - 1, i - k);

			// extract the top K
			final String[] topK = new String[k];
			i = 0;
			for (final java.util.Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
				if (entry.getValue().intValue() >= kthLargestFreq) {
					topK[i++] = entry.getKey();
					if (i == k) {
						break;
					}
				}
			}

			return topK;

		} catch (IOException error) {
			System.out.println("Invalid File");
		} finally {
			bufferedReader.close();
		}
		return null;
	}

	// Using quick sort
	private static int kthSmallest(int[] arrA, int start, int end, int k) {
		int left = start;
		int right = end;
		int pivot = start;
		while (left <= right) {
			while (left <= right && arrA[left] <= arrA[pivot])
				left++;
			while (left <= right && arrA[right] >= arrA[pivot])
				right--;
			if (left < right) {
				swap(arrA, left, right);
				left++;
				right--;
			}
		}
		swap(arrA, pivot, right);
		if (pivot == k)
			return arrA[pivot];// if pivot is kth element , return
		else if (pivot < k)
			// if pivot is less than k, then kth element will be on the right
			return kthSmallest(arrA, pivot + 1, end, k);
		else
			// if pivot is greater than k, then kth element will be on the right
			return kthSmallest(arrA, start, pivot - 1, k);
	}

	public static void swap(int[] arrA, int a, int b) {
		int x = arrA[a];
		arrA[a] = arrA[b];
		arrA[b] = x;
	}
}