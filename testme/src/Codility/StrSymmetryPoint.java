package Codility;


class StrSymmetryPoint {
    public static int solution(String s){
    	if(s.length() == 0){
    		return -1;
    	}
    	
    	if(s.length()%2 == 0){
    		return -1;
    	}
    	
    	
    	int summetry = s.length()/2;
    	String leftPart = s.substring(0,summetry);
    	String rightPart = s.substring(summetry+1);
    	
    	if(leftPart.equals((new StringBuilder(rightPart)).reverse().toString())){
    		return summetry;
    	}
    	
    	return -1;
    }
    
 public static void main(String[] args) {
	 int [] A = {3, 1, 2, 4, 3} ; 
	 String s = "racecar";
    	solution(s);
    }
}