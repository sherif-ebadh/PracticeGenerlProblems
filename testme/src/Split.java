import java.io.*;
import java.util.*;

public class Split {

  
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           String s=scan.nextLine();
           
           
         //Complete the code
           if(s==null||s.length()==0||s.trim().length()==0){
        	   System.out.println(0);
           }else if(s.length()>40000){
        	   //System.out.println(s.length());
    }else{
           String[] tokens=s.trim().split("[_\\@ !,?.']+");
           System.out.println(tokens.length);
          for(String s2: tokens){
        	  System.out.println(s2);
        	 
          }}
           

         }
        
}
