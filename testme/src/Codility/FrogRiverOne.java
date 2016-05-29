package Codility;

import java.util.HashMap;

class FrogRiverOne {
    public static int solution(int X, int[] A ){
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	for (int i = 0; i < A.length; i++) {
    		if(!hm.containsKey(A[i]) && A[i]<=X){
    			hm.put(A[i], A[i]);
    			if(hm.size() == X){
    				return i;
    			}
    		}
		}
    	return -1;
     }
    
 public static void main(String[] args) {
	 int [] A = {1,3, 1, 4, 2, 3,5,4} ; 
    	solution(5,A);
    }
}
