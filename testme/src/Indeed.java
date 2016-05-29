// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Indeed {
	public int solution(int N, String S, String T) {
		// write your code in Java SE 8

		int devideN = N / 2;
		int  cellmax = devideN*devideN;
		
		String [] barrels = null;
		
		if(!S.trim().equals("")){
			barrels = S.trim().split(" ");
		}
		
		int tLength=0;
		if(!T.trim().equals("")){
			String [] exist = T.trim().split(" ");
			tLength =  exist.length;
		}
		
		
		int leftFront =0,rightFront =0,leftBack =0,rightBack =0;

		int maxAllowd =0;
		
		if(barrels== null){
			// no barrels exist
			maxAllowd = cellmax *4 ;
			return maxAllowd - tLength;
		}
		
		for(int i = 0 ;i<barrels.length ; i++){
			String position = barrels[i];
			
//			int row = new Integer();
			int row = Integer.parseInt(position.substring(0,1));
			
			char character = position.charAt(1); // This gives the character 'a'
			int ascii = (int) character;
			int column = ascii - 65 +1;
			
			if(row <=devideN && column<=devideN){
				leftFront++;
			}else if(row >devideN && column<=devideN){
				leftBack++;
				
			}else if(row <=devideN && column>devideN){
				rightFront++;
			}if(row >devideN && column >devideN){
				rightBack++;
			}
			
			int max = Math.max(Math.max(rightBack, rightFront) , Math.max(leftFront, leftBack));
			
			maxAllowd = (cellmax - max)*4;
			
			
		}
		return maxAllowd - tLength;
	}

	public static void main(String[] args) {

		Indeed x = new Indeed();
//		 int[] A = { 1, -2, -1, 2,500};
		 System.out.println(x.solution(4, "", "1B") );
		//
		// int [] B = {0};
		// System.out.println(x.solution(B));
	}

}