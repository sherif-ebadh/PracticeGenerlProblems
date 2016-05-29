package Codility;



class HolidayAdvice {
    public static int solution(int[] A){
    	int minuim =A.length;

    	int oneIndex = 0;
    	int threeIndex = 0;
    	int fourIndex = 0;
    	int sevenIndex = 0;
    	
    	boolean oneF = false;
    	boolean threeF = false;
    	boolean fourF = false;
    	boolean sevenF = false;
    	
    	
    	for(int i=0; i<A.length;i++){
    		if(A[i] == 1){
    			oneIndex = i;
    			oneF= true;
    		}else if(A[i] == 3){
    			threeIndex = i;
    			threeF = true;
    	    	
    		}else if(A[i] == 4){
    			fourIndex = i;
    			fourF = true;
    	    	
    		} else if(A[i] == 7){
    			sevenIndex = i;
    			sevenF = true;
    		}
    		
    		if(oneF && threeF && fourF && sevenF){
        		int min = Math.min( Math.min(oneIndex, threeIndex), Math.min(fourIndex, sevenIndex));
        		int max = Math.max( Math.max(oneIndex, threeIndex), Math.max(fourIndex, sevenIndex));
        		if ( minuim > (max-min)){
        			minuim = max-min+1;
        		}

    		}
    	}
    	if(!(oneF && threeF && fourF && sevenF)){
    		minuim = 0;
    	}
    		
        	
      return minuim;
 
    }
    
 public static void main(String[] args) {
	 int [] A = {1,3,7,1,4,5,3,7,4,1};
    	System.out.println(solution(A));
    }
}