package Codility;

import java.util.HashMap;


class MissingInteger {
    public static int solution(int[] A){
    //not good solution 
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    
    	int sum = 0;
    	int count = 0; 
    	for (int i = 0; i < A.length; i++) {
    		if(!hm.containsKey(A[i])){
    			hm.put(A[i], A[i]);
    			sum +=A[i];
    			count++;
    		}
		}
    	
    	java.util.Iterator<Integer> itr =  hm.values().iterator();
    	int missing_element = hm.values().toArray().length+1;
    	int idx=0;
		while(itr.hasNext()){
			int value = itr.next().intValue();
			missing_element = missing_element ^ value ^ (++idx);
		}
	    return missing_element;
    }
    
 public static void main(String[] args) {
	 int [] A = {3, 1, 2, 6, 1,4} ; 
    	solution(A);
    }
}