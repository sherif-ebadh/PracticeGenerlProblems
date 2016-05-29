// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution4 {
    public String solution(String S) {
    	int count=0;
    	boolean cFlag = false;
    	int groupNum = 0;

    	S = S.replaceAll("-","");
    	S = S.replaceAll(" ","");
    	    	if(S.length()%3 == 1){
    		groupNum = S.length() / 3;
    		cFlag = true;
    	}
    	int groupCount = 1;
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < S.length(); i++) {
           char c =  S.charAt(i);
           if(Character.isDigit(c)){
        	   sb.append(c);
        	   count++;
        	   if(cFlag && groupCount >= groupNum){
        		   if(count == 2 && i!=S.length()-1){
        			   count = 0;
            		   sb.append("-");
            		   groupCount++;
        		   }
        	   } else if(count == 3 && i!=S.length()-1){
        		   count = 0;
        		   sb.append("-");
        		   groupCount++;
        	   }
           }
        } 
    	
    	return sb.toString();
    }

    
    public static void main(String[] args) {
    	
//    	Solution x = new Solution();
    	int[] A = { 1, -2, -1, 2,500};
    	String s= "44-34 324324 234324 2345";
//    	System.out.println(x.solution(s));
//    	
//    	
//    	s="555372654";
//    			System.out.println(x.solution(s));
//    			
//    			s="022-198-532-4";
//    			System.out.println(x.solution(s));
//    	int [] B = {0};
//    	System.out.println(x.solution(B));
    }
    
    
}