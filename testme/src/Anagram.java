import java.io.*;
import java.util.*;

public class Anagram {

   static boolean isAnagram(String A, String B) {
      String s = (A+B).toLowerCase();
       int sum=0;

       for(int i=0;i<s.length();i++){
        sum ^=(int)s.charAt(i);
       }
 return (sum==0);
   
   }
   
   
   static long sumOfIntegers(int[] arr) {
	   long sum = 0;
	   for(int x= 1;x<=arr[0];x++){
	       sum  +=arr[x]; 
	   }
	           return sum;
	       }

    public static void main(String[] args) {
    	int[]A={1,2,3,4,5};
    	System.out.print(sumOfIntegers(A));
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        boolean ret=isAnagram(A,B);
//        if(ret)System.out.println("Anagrams");
//        else System.out.println("Not Anagrams");
        
    }
}
