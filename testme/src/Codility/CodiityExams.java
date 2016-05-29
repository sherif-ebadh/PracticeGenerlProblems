package Codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CodilityExams{
	public static void main(String[] arg) {
		
		int[] nums = { 6,10,6,9,7,8 };
        int[] longestConsecutiveSequence = findLongestConsecutiveSequence(nums);
        System.out.println("The longest consecutive sequence is:");
        System.out.println(Arrays.toString(longestConsecutiveSequence));
		
		
		int []A = new int[7];
		A[0] = 4;
				  A[1] = 6;
				  A[2] = 2;
				  A[3] = 2;
				  A[4] = 6;
				  A[5] = 6;
				  A[6] = 4;
				  
				  solutionFix(A) ;
		
//	System.out.println(solution(123));
    }
	
	
	
	static int solutionFix(int[] A) {
        int N = A.length;
        int result = 0;
        int i =0;
            for (int j = N-1; j>0; j--)
                if (A[i] != A[j])
                   return  j - i;
        return result;
    }
	
	 public static String solution(int A, int B, int C, int D) {
		 int []digits = {A,B,C,D};
		 
		 int minute = 0;
		 int hour = 0;
		 int digit0 = 0 , digit1 = 0;
		 boolean hourExist  = false,minExist = false;
		 
		 // Find the maxuim hours
		 for(int i=0;i<digits.length;i++){
			 for(int j = 0;j<digits.length;j++){
				if(i==j){
					continue;
				}
				int val  = digits[i]*10 + digits[j];
				 if(val < 24 && val >= hour){
					 hour = val;	
					 hourExist = true;
					 digit0=i;
					 digit1=j;
				 }
			 }
		 }

		 // Get the remaining values to calculate maxuim minutes
		
		
		if(hourExist){
			 int [] minutArray = new int[2];
			 int index =0;
			 for(int i=0;i<digits.length;i++){
				 if(i != digit0 && i != digit1){
					 minutArray[index] = digits[i];
					 index++;
				 }
			 }
			 
			 // find the maxuim minutes
			 for(int i=0;i<minutArray.length;i++){
				 for(int j = 0;j<minutArray.length;j++){
					 if(i==j){
							continue;
						}
					 int val  = minutArray[i]*10 + minutArray[j];	 
					 if(val < 60 && val >= minute){
						 minute = val;	
						 minExist = true;
					 }
				 }
			 }
		}
		 
		 
		if(hourExist&&minExist){
			String hourStr  = String.valueOf(hour);
			String minStr  = String.valueOf(minute);
			
			if(hour == 0){
				hourStr  = "00";
			}
			if(minute ==0 ){
				minStr = "00";
			}
			
			
			return hourStr+":"+minStr;
		 }else{
			 return "NOT POSSIBLE";
		 }
	 }
	
	
//	
//	
	
    public int solution(int[] A) {
    	
    	Arrays.sort(A);
    	int [] difference =  new int[A.length-1];
    	for(int i =0;i< A.length-1;i++){
    		int temp = A[i+1]-A[i];
    		difference [i] = temp;
    		
    	}
    	int tempCounter=0;
    	int sum =0;
    	int counter =0;
    	for(int i = 0;i<difference.length; i++){
    		if(difference[i]<2){
    			tempCounter++;
    			sum+=difference[i];
    			if(sum<2){
    				counter = tempCounter;
    			}
    		}else{
    			tempCounter =0;
    			sum =0;
    		}
    	}
    	return counter+1;
    }   
    
    
//    	
//    	int minuim =A.length;
//        for(int i=0; i<A.length;i++){
//        	if(i+7 < A.length){
//        		int []b = Arrays.copyOfRange(A, i, i+7);
//        		for(int index = 0;index<3 && index < b.length ;index++){
//        			int []c = Arrays.copyOfRange(b, index, b.length);
////        			boolean contains = ;
////        			Arrays.sort(c);        			
//        			if(IntStream.of(c).anyMatch(x -> x == 1) 
//                			&& IntStream.of(c).anyMatch(x -> x == 3) 
//                			&& IntStream.of(c).anyMatch(x -> x == 7)
//                			&& IntStream.of(c).anyMatch(x -> x == 4) ){
//        				
//        				if(minuim > c.length){
//        					minuim = c.length;
//        				}
//            		}
//        		}
//        	}else{
//        		int []b = Arrays.copyOfRange(A, i, A.length);
//        		for(int index = 0;index<3 && index < b.length;index++){
//        			int []c = Arrays.copyOfRange(b, index, b.length);
////        			Arrays.sort(c);        			
//        			if(IntStream.of(c).anyMatch(x -> x == 1) 
//                			&& IntStream.of(c).anyMatch(x -> x == 3) 
//                			&& IntStream.of(c).anyMatch(x -> x == 7)
//                			&& IntStream.of(c).anyMatch(x -> x == 4) ){
//        				
//        				if(minuim > c.length){
//        					minuim =c.length;
//        				}
//            			
//            		}
//        		}
//        	}
//        }
//        return minuim;
//    }
    
    
    public static int[] findLongestConsecutiveSequence(int[] nums) {
        if (nums == null) {
            return new int[0];
        }
        Map<Integer, Integer> numConsecutiveValuesStartingFrom = new HashMap<Integer, Integer>();
        for (int num : nums) {
            numConsecutiveValuesStartingFrom.put(num, 0);
        }
        int n = nums.length;
        int maxNumConsecutiveValues = 0;
        int maxStartIndex = 0;
        for (int i = 0; i < n; ++i) {
            int num = nums[i];
            int numConsecutiveValues = findNumConsecutiveValuesStartingAt(num, numConsecutiveValuesStartingFrom);
            if (numConsecutiveValues > maxNumConsecutiveValues) {
                maxNumConsecutiveValues = numConsecutiveValues;
                maxStartIndex = i;
            }
        }
        int[] longestConsecutiveSequence = new int[maxNumConsecutiveValues];
        for (int i = 0; i < maxNumConsecutiveValues; ++i) {
            int num = nums[maxStartIndex] + i;
            longestConsecutiveSequence[i] = num;
        }
        return longestConsecutiveSequence;
    }
    private static int findNumConsecutiveValuesStartingAt(int num, Map<Integer, Integer> numConsecutiveValuesStartingFrom) {
        boolean isNumInArray = numConsecutiveValuesStartingFrom.containsKey(num);
        if (!isNumInArray) {
            return 0;
        }
        int numConsecutiveValuesStartingFromNum = numConsecutiveValuesStartingFrom.get(num);
        boolean numConsecutiveValuesHaveBeenComputed = (numConsecutiveValuesStartingFromNum != 0);
        if (numConsecutiveValuesHaveBeenComputed) {
            return numConsecutiveValuesStartingFromNum;
        }
        int numConsecutiveValues = 1 + findNumConsecutiveValuesStartingAt(num + 1, numConsecutiveValuesStartingFrom);
        numConsecutiveValuesStartingFrom.put(num, numConsecutiveValues);
        return numConsecutiveValues;
    }
}
