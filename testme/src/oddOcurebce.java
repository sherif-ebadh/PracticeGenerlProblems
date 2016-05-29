import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class oddOcurebce {

	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 List intList =Arrays.asList(A);
		 Set<Integer> mySet = new HashSet(intList);
		 for(int x =0 ; x<A.length;x++){
			 if(Collections.frequency(intList,A[x])%2 != 0){
				 System.out.println(A[x]);
				 return A[x];
			 }
//		 // System.out.println(s + " " +Collections.frequency(asList,s));
		 }   
		 return 0;
	    }
	 
	 public static void main(String [] args){
		 int A[] = {9, 3, 9, 3, 9, 7, 9} ;
		 oddOcurebce c =  new oddOcurebce();
		 c.solution(A);
	 }
}