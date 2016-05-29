package Codility;

class FrogJmp {
	public static int solution(int X, int Y, int D) {
		if(Y < X || Y==X || D==0){
			return 0;
		}
		if( (Y-X) % D == 0){
			return (Y-X) / D ;
		}else{
			return ((Y-X) / D)+1; 
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int X = 10;
				  int Y = 15;
				  int D = 0 ;
		
		System.out.println(solution(X,Y,D));
	}
}