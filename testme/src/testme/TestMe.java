package testme;
import java.math.BigInteger;
import java.util.Scanner;

public class TestMe {

   
    
    public static void main(String []args){
    	int rows = 10;
    	Runtime runtime = Runtime.getRuntime();
	    // Run the garbage collector
	    runtime.gc();
	    // Calculate the used memory
	    long memory = runtime.totalMemory() - runtime.freeMemory();
	    System.out.println("before Used memory is bytes: " + memory);
//	    System.out.println("before Used memory is megabytes: "
//	        + bytesToMegabytes(memory));
	    
    	
    	
    	for(int i =0;i<rows;i++) {
    	            int number = 1;
    	            System.out.format("%"+(rows-i)*2+"s","");
    	            for(int j=0;j<=i;j++) {
    	            	System.out.print(getItNum2(i,j).toString()+" ");
    	                 
    	            }
    	            System.out.println();
//    	            for(int k=0;k<=i;k++) {
//    	            	System.out.format("%4d",number);
//    	                 number = number * (i - k) / (k + 1);
//    	                 
//    	            }
//    	            System.out.println();
    	        }

    	
    	runtime.gc();
        // Calculate the used memory
        memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        
    	
//    	
//    	System.out.println(getIt(4,2));;
////    	System.out.println(getIt(5,0));;
//    	System.out.println(getIt(67,34));;
////    		int A[]={5,1,0,2,7,0,6,6,1};
////    		int B[]={1,0,7,4,2,6,8,3,9};
////    				TestMe x = new TestMe();
//    				x.solution(A, B, 2);
    }

	private static String getIt(int l, int c) {
//		System.out.println(fact(l));
		String x = getItNum2(l,c).toString();
//		System.out.println(new Date().getTime());
		return x;
		
	}
	

	private static BigInteger getItNum2(int l, int c) {
		
		BigInteger a = fact(l);
		BigInteger b = fact(c);
		BigInteger z = fact(l-c);
		
		b = b.multiply(z);
		BigInteger num =  a.divide(b);
	    return num;

	}	

	private static BigInteger fact(int l) {
		int n, c;
	    BigInteger inc = new BigInteger("1");
	    BigInteger fact = new BigInteger("1");
	 
//	    Scanner input = new Scanner(System.in);
//	 
//	    System.out.println("Input an integer");
	    n = l;
	 
	    for (c = 1; c <= n; c++) {
	      fact = fact.multiply(inc);
	      inc = inc.add(BigInteger.ONE);
	    }
	    return fact;
	}

	private static long getItNum(int l, int c) {
		if(c==0 || c==1 || l==c || l-c==1){
			return l;
		}else{
				long x = getItNum(l-1,c-1);
				long y = getItNum(l-1,c);
				return  x + y;
		}
		
	}

}