package Codility;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

class PermCheck {
	public static int solution(int[] A) {
//80%		
		 int N = A.length + 1;
         int total = N * (N + 1) / 2;

         for (int i : A) {

             total -= i;
         }

         return Math.abs(total);
         
		
	}
	
	
	public static int solution2(int[] A) {
		//100%		
//		def solution(A):
		    int missing_element = A.length+1;
		    int idx=0;
		    for (int value : A){
		        missing_element = missing_element ^ value ^ (++idx);
		    }
		   
		    if(missing_element == A.length+1){
		    	return 1;
		    }else{
		    	return 0;
		    }
				
		}
	
	public static void main(String[] args) {
		int []A = new int[4];
				  A[0] = 1;
				  A[1] = 4;
				  A[2] = 3;
				  A[3] = 2;
		System.out.println(solution2(A));
	}
}