import java.math.BigInteger;
import java.util.Scanner;

public class BigDecimales {
//	public static void main(String []argh)
//    {
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n];
//        for(int i=0;i<n;i++)
//        {
//            s[i]=sc.next();
//        }
//        
//        Arrays.sort(s, 
//        		Collections.reverseOrder(
//        				new Comparator<String>() {
//            @Override
//            public int compare(String a1, String a2) {
//                //convert to big decimal inside comparator
//                //so permanent string values are never changed
//                //aka you only use the BigDecimal values to 
//                //compare the strings!
//                BigDecimal a = new BigDecimal(a1);
//                BigDecimal b = new BigDecimal(a2);
//                return a.compareTo(b);
//            }
//        }));
//        
//        
//
//        //Write your code here
//
//
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//
//    }
	
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc= new Scanner(System.in);
	        String a=sc.nextLine();
	        String b=sc.nextLine();
	        
	        BigInteger x = new BigInteger(a);
	        BigInteger y = new BigInteger(b);
	        
	        System.out.println((x.add(y)).toString());
	        System.out.println((x.multiply(y)).toString());
	        
	    }

}




