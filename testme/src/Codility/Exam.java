package Codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Exam {
	public static int solution2(int[] A, int[] B) {
		// write your code in Java SE 8
		double[] C = new double[A.length];
		if (A.length == 0 || B.length == 0) {
			return 0;
		}
		for (int x = 0; x < A.length; x++) {
			C[x] = A[x] + B[x] / 1000000.0;
		}
//		System.out.println(count_pairs(C));
		return count_pairs(C);
	}
	
	static int count_pairs(double[] C)
	{
	  int result = 0;
	  int len = C.length;

	  if (len > 1)
	  {
	    int lo_index;
	    int hi_index = len - 1;

	    // Skip all C[i] less than 1
	    for (lo_index = 0; lo_index < len; lo_index++)
	    {
	      if (C[lo_index] > 1)
	        break;
	    }

	    while (hi_index > lo_index)
	    {
	      double v = C[hi_index] / (C[hi_index] - 1);

	      while (lo_index < hi_index && C[lo_index] < v)
	      {
	        lo_index++;
	      }

	      if (lo_index == hi_index)
	        break;

	      result += (hi_index - lo_index);

	      hi_index--;

	    }
	  }
	  return result;  
	}
	

//	public static int solution(int[] A) {
		// write your code in Java SE 8
//		int depth = -1;
//		for (int x = 0; x < A.length; x++) {
//			for (int j = x + 1; j < A.length - 1; j++) {
//				if (A[x] > A[j]) {
//					int test = j + 1;
//					while (test < A.length && A[j] > A[test]) {
//						j++;
//						test++;
//					}
//					j = test - 1;
//					int index = j;
////					int g = j
//					for (int g = j; g < A.length-1;g++) {
//						int test2 = g + 1;
//						boolean exist = false;
//						while (test2 < A.length && A[g]<A[test2]) {
//							index = g;
//							g++;
//							test2++;
//							exist = true;
//						}
//						if(j<index && exist){
//							g = index;
//							exist = false;
//							
//							int y = A[x] - A[j];
//							int z = A[index] - A[j];
//							if (y <= z && depth < y) {
//								depth = y;
//							} else if (depth < z) {
//								depth = z;
//							}
//							System.out.println("(" + x + "," + j + "," + index + ")   "+depth);
//						}
//					}
//					
//				}
//
//			}
//		}
//		System.out.println(depth);
//		return depth;
		
//		 int depth = 0;
//
//		    int P = 0, Q = -1, R = -1;
//
//		    for (int i = 1; i < A.length; i++)
//		    {
//		        if (Q < 0 && A[i] >= A[i-1]) 
//		            Q = i-1;
//
//		        if ((Q >= 0 && R < 0) && 
//		            (A[i] <= A[i-1] || i + 1 == A.length))
//		        {
//		            if (A[i] <= A[i-1])
//		                R = i - 1;
//		            else
//		                R = i;
//		            System.out.println(P+"  "+Q+"  "+R);
//		            depth = Math.max(depth, Math.min(A[P]-A[Q], A[R]-A[Q]));
//		            P = i - 1; 
//		            Q = R = -1;
//		        }
//		    }
//		    if (depth == 0) depth = -1;
//		    System.out.println("Depth: "+depth);
//		    return depth;
		
//		int N = A.length;
//
//		int depth = -1;
//		int P, Q, R;
//		int i = 0, j, k;
//		while (i < N - 2) {
//		    P = A[i];
//
//		    j = i + 1;
//		    int p = P;
//		    while (j < N - 1 && A[j] < p) {
//		        p = A[j++];
//		    }
//		    if (j == N - 1) {
//		        break;
//		    }
//		    if (j > i + 1) {
//		        Q = A[j - 1];
//		    } else {
//		        i++;
//		        continue;
//		    }
//		    k = j;
//		    int q = Q;
//		    while (k < N && A[k] > q) {
//		        q = A[k++];
//		    }
//
//		    if (k > j) {
//		        R = A[k - 1];
//		        System.out.println(P+"  "+Q+"  "+R);
//		        depth = Math.max(depth, Math.min(P - Q, R - Q));
//		        i = k - 1;
//		    } else {
//		        i = j - 1;
//		    }
//		}
//
//		return Math.max(depth, -1);
//	}

	
	static int AdjacentPointsMinDistance(int []A){
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		int count=0;
		for(int i=0;i<A.length;i++){
			if(!hm.containsKey(Math.abs(A[i]))){
				count++;
			}else{
				hm.put(Math.abs(A[i]), "");
			}
		}
		
		return count;
	}
	
	
	private static int countDistinct(int[] nums) {
	    int lastLeft = Math.abs(nums[0]);
	    int lastRight = Math.abs(nums[nums.length - 1]);
	    int count = 0;
	    for (int a = 1, b = nums.length - 2; a <= b;) {
	        int left = Math.abs(nums[a]);
	        int right = Math.abs(nums[b]);
	        if (left == lastLeft) {
	            a++;
	            lastLeft = left;
	        } else if (right == lastRight) {
	            b--;
	            lastRight = right;
	        } else if (lastLeft == lastRight) {
	            a++;
	            b--;
	            lastLeft = left;
	            lastRight = right;
	            count++;
	        } else if (lastLeft > lastRight) {
	            count++;
	            a++;
	            lastLeft = left;
	        } else {
	            count++;
	            b--;
	            lastRight = right;
	        }
	    }
	    count += (lastLeft == lastRight ? 1 : 2);
	    return count;
	}

	private static int countDistinctUsingSet(int[] nums) {
	    Set<Integer> s = new HashSet<Integer>();
	    for (int n : nums)
	        s.add(Math.abs(n));
	    int count = s.size();
	    return count;
	}
	
	
	public static void main(String[] args) {
//	DOn't remove this part
//		for (int len : new int[]{1000 * 1000, 100 * 1000, 10 * 1000, 1000}) {
//	        int[] nums = new int[len];
//	        for (int i = 0; i < len; i++)
//	            nums[i] = (int) (Math.random() * (Math.random() * 2001 - 1000));
//	        Arrays.sort(nums);
//
//	        long timeArray = 0;
//	        long timeSet = 0;
//	        int runs = len > 1000 * 1000 ? 10 : len >= 100 * 1000 ? 100 : 1000;
//	        for (int i = 0; i < runs; i++) {
//	            long time1 = System.nanoTime();
//	            int count = countDistinct(nums);
////	            System.out.println(count);
//	            long time2 = System.nanoTime();
//	            int count2 = AdjacentPointsMinDistance(nums);
////	            System.out.println(count2);
//	            long time3 = System.nanoTime();
//	            timeArray += time2 - time1;
//	            timeSet += time3 - time2;
//	            assert count == count2;
//	        }
//	        System.out.printf("For %,d numbers, using an array took %,d us on average, using a Set took %,d us on average, ratio=%.1f%n",
//	                len, timeArray / 1000 / runs, timeSet / 1000 / runs, 1.0 * timeSet / timeArray);
//	    }
//		
		
		
		
		 int [] A = {0,1,2,2,3,5};
		 int [] B = {500000,500000, 0, 0, 0,20000};
		 solution2(A,B);

//		int[] C = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };
//		solution(C);
		
//		solution2([0, 1, 2, 2, 3, 5], [500000, 500000, 0, 0, 0, 20000]);
	}
	
	

}