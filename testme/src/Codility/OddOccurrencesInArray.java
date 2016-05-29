package Codility;

import java.util.HashMap;
class OddOccurrencesInArray {
    public static int solution(int[] A){
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!hm.containsKey(A[i])) {
				hm.put(A[i], 1);
			}else{
				hm.put(A[i], hm.get(A[i])+1);
			}
		}
		java.util.Iterator<Integer> itr =  hm.values().iterator();
		int index=0;
		while(itr.hasNext()){
			if(itr.next().intValue()%2 != 0){
				break;
			}
			index++;
		}
		Integer x= (Integer) hm.keySet().toArray()[index];
		return x.intValue();
    }
    
 public static void main(String[] args) {
	 int [] A = {9, 3, 9, 3, 9, 7, 9} ; 
    	solution(A);
    }
}