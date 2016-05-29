package Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class CyclicRotation {
    public static  int[] solution(int [] A, int k) {
    	List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < A.length; index++)
        {
            intList.add(A[index]);
        }
        
    	Collections.rotate(intList, k);
    	int[] arr = new int[intList.size()];
    	for(int i = 0; i < intList.size(); i++) {
    	    if (intList.get(i) != null) {
    	        arr[i] = intList.get(i);
    	    }
    	}
    	
    	return arr;
    }
    
 public static void main(String[] args) {
	 int [] A = {3, 8, 9, 7, 6}; 
    	solution(A,3);
    }
}