// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution3 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        for(int i=0; i<A.length;i++){
        	int sumA =0;
        	int countA =0;
        	int countB=0;
        	int sumB =0;
        		for(int x=0; x<i||x==0;x++){
        			countA++;
        			sumA +=A[x];
        		}
        		
        	for(int j=i+1;j<A.length;j++){
        		sumB += A[j];
        		countB++;
        	}
        	
        	if(sumA == sumB || (countB == A.length-1 && sumB ==0) || (countA == A.length-1 && sumA ==0) ){
        		return i;
        	}
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
    	
//    	//Solution x = new Solution();
//    	int[] A = { 1, -2, -1, 2,500};
//    	System.out.println(x.solution(A));
//    	
//    	int [] B = {0};
//    	System.out.println(x.solution(B));
    }
    
    
}