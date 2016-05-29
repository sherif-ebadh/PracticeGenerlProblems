package testme;
import java.util.Scanner;

public class matrixEncruption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        
        s=s.replaceFirst(" ", "");
        int strLength  = s.length();
        int ceilValue = (int) Math.ceil(Math.sqrt(strLength));
        int floorValue = (int) Math.floor(Math.sqrt(strLength));

        int arrindex = 0;
        if(ceilValue*floorValue >= strLength) {
        	arrindex = floorValue;
        	
       }else{
    	   arrindex = floorValue+1;
       }
        
        String [] strArray = new String[arrindex];
        
        int index = 0;
        for(int x = 0 ; x < s.length() ;index++){
        	if(x+ceilValue >= s.length()){
        		strArray[index] =  s.substring(x,s.length());
        	}else{
        		strArray[index] =  s.substring(x,x+ceilValue);
        	}
        	x = x+ceilValue;
        	
        }
        StringBuilder sb = new StringBuilder();
        for(int Y = 0 ; Y<ceilValue ;Y++){
        	if(Y!=0){
        		sb.append(" ");
        	}
        	for(int x = 0 ; x<arrindex ;x++){
        		if(Y < strArray[x].length()){
            		sb.append(strArray[x].charAt(Y));
        		}
            }
        }
        
        System.out.println(sb.toString());
        
    }
}
