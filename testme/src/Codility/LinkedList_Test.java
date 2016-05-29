package Codility;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
class IntList {
	  public int value;
	  public IntList next;
	}

class LinkedList_Test {
	public int solution(IntList L) {
        // write your code in Java SE 8
		int count =0 ;
		if(L.next == null){
			return count;
		}
		
		while(L.next !=null){
			count++;
			L=L.next;
			if(L.next == null){
				{
					//last item in the lopp
					count++;
				}
			}
		}
		
		return count;
    }
	
	
	public static void main(String[] args) {
//		System.out.println(solution(A));
	}
}