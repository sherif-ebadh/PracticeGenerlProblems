package Codility;


class ArrayInversionCount {
    public static int solution(int[] A){
    
    	int count=0;
    	for (int p = 0; p < A.length; p++) {
    		for(int q = p+1; q < A.length; q++){
    			if(A[q]<A[p]){
    				count++;
    				if(count > 1000000000){
    					return -1;
    				}
    			}
    		}
		}
    	return count;
    }
    
 public static void main(String[] args) {
	 int [] A = new int[6];
	 A[0] = -1 ;A[1] = 6; A[2] = 3;
			 A[3] =  4; A[4] = 7; A[5] = 4; 
    	solution(A);
    }
}