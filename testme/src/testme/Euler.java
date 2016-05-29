package testme;
import java.math.BigInteger;
import java.util.Scanner;

public class Euler {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
        	int A = in.nextInt();
            int M = in.nextInt();
    	   BigInteger ABig = new BigInteger(String.valueOf(A));
    	   boolean exist= false;
    	  
    	   for(int x = 2;x<Math.sqrt(M);x++){
    		  
    		   BigInteger xBig = new BigInteger(String.valueOf(x));
    		   BigInteger mBig = new BigInteger(String.valueOf(M));
    		   xBig = xBig.pow(2);
    		   BigInteger value  = (ABig.subtract(xBig)).mod(mBig);
    		   if(value.equals(new BigInteger("0"))){
    			  exist = true;
    			  break;
    		   }
    	   }
    	   
    	   if(exist){
        	   System.out.println("YES");
    	   }else{
    		   System.out.println("NO");
    	   }
    	  
    	  
    	   
       }
        
    }        
}
