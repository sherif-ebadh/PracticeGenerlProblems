import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Ditnict {

	public int solution(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!hm.containsKey(A[i])) {
				hm.put(A[i], 1);
			}
		}
		return hm.size();
		
		

	}
	
	public static int ditnictSlice(int M, int[] A) {
		HashMap<Integer, Integer> hm;
		int distnict = 0;
		
		for(int i = 0; i < A.length; i++){
			hm = new HashMap<Integer, Integer>();
			for (int j = i; j < A.length; j++) {
				if (!hm.containsKey(A[i])) {
					hm.put(A[i], 1);
					distnict++;
					System.out.println("("+i+","+j+")");
				}else{
//					distnict++;
					hm = null;
					break;
				}
			}
		}
		
		
		return distnict;

	}
	
	
	
	public static int solution3(int[] A) {
				
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!hm.containsKey(A[i])) {
				hm.put(A[i], 1);
			}else{
				hm.put(A[i], hm.get(A[i])+1);
//				String.
			}
		}
		
		Integer x = Collections.max(new ArrayList<Integer>(hm.values()));
		
		if(x>A.length/2){
			 Set<Integer> keys = new HashSet<Integer>();
			    for (Entry<Integer, Integer> entry : hm.entrySet()) {
			        if (Objects.equals(x, entry.getValue())) {
			            keys.add(entry.getKey());
			        }
			    }
			    int xc  = 0;
			    int y = ((Integer)(keys.toArray())[0]).intValue();
			    for(int i=0; i<A.length; i++) {
			         if(A[i] == y){
			             xc =  i;
			             break;
			         }
			    }
			return xc;
		}else{
			return -1;
		}
		

	}

	public static int solution2(int[] A) {
		int end = A.length - 1;
		int[] MySortedArray = Arrays.copyOf(A, A.length);
		Arrays.sort(MySortedArray);
		return Math.max(MySortedArray[0] * MySortedArray[1]
				* MySortedArray[end], MySortedArray[end - 2]
				* MySortedArray[end - 1] * MySortedArray[end]);
	}

	public static void main(String[] args) {
		int[] A = {3, 4,  3,2, 3, -1, 3, 3};
		
		ditnictSlice(6,A);
		
//		System.out.println(solution3(A));
	}
}