package Codility;

import java.util.Arrays;
import java.util.Collections;
class BinaryGap {
    public int solution(int A) {
    	String x= Long.toBinaryString(A);
    	int zeros = 0;
    	if(x.lastIndexOf("1")!=x.length()-1){
    		x = x.substring(0, x.lastIndexOf("1")+1);
    	}
    	System.out.println(x);
    	if(x.contains("0")){
    		zeros = Collections.max(Arrays.asList(x.split("1+"))).length();
    		if(x.endsWith("0")){
        		zeros-=1;
        	}
    	}
    	return zeros;
    }
    
 public static void main(String[] args) {
    	
    	BinaryGap x = new BinaryGap();
    	System.out.println(x.solution(16));
    	System.out.println(x.solution(15));
    	System.out.println(x.solution(1204));
    	System.out.println(x.solution(325));
    }
}