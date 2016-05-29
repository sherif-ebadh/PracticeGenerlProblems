package testme;
import java.util.Scanner;

public class hours{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        String []hoursArray = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelev"};
        String minutes  = String.valueOf(m);
        String []numberArray = {"one","two","three","four","five","six","seven","eight","nine"};
        String []tensArray ={"ten","twenty","thirty","forty","fifty"};
        String []plusTenArray ={"eleven","twelev","thirteen","forteen","fifteen","sixten","seventeen","eighteen","nineteen","tweentey"};

        if(m == 0){
        	String hours = hoursArray[h-1];
        	System.out.println(hours + " o' clock");	
        }else if (m<10){
        	String hours = hoursArray[h-1];
        	if(m==1){
        		System.out.println(numberArray[m-1] + " minute past "+hours);
        	}else{
        		System.out.println(numberArray[m-1] + " minutes past "+hours);
        	}
        	
        }else if (m==10){
        	String hours = hoursArray[h-1];
        	System.out.println(tensArray[0] + " minutes past "+hours);
        }else if(m==15){
        	String hours = hoursArray[h-1];
        	System.out.println("quarter past "+hours);
        }else if(m<=19){
        	String hours = hoursArray[h-1];
        	int x = m%10;
        	System.out.println(plusTenArray[x-1] + " minutes past "+hours);
        }else if(m<30){
        	String hours = hoursArray[h-1];
        	int x = m%20;
        	System.out.println(tensArray[1] +" "+ numberArray[x-1] + " minutes past "+hours);
        }else if(m==30){
        	int newM= 60 - m;
        	String hours = hoursArray[h-1];
        	System.out.println("half past "+hours);
        }else if(m<40){
        	int newM= 60 - m;
        	String hours = hoursArray[h];
        	int x = newM%20;
        	System.out.println(tensArray[1] +" "+ numberArray[x-1] + " minutes to "+hours);
        }else if(m==45){
        	String hours = hoursArray[h];
        	System.out.println("quarter to "+hours);
        }else if(m<50){
        	int newM= 60 - m;
        	String hours = hoursArray[h];
        	int x = newM%10;
        	System.out.println(plusTenArray[x-1] + " minutes to "+hours);
        }else if(m<60){
        	int newM = 60 - m;
        	String hours = hoursArray[h];
        	
        	
        	if(newM==1){
        		System.out.println(numberArray[newM-1] + " minute to "+hours);
        	}else{
        		System.out.println(numberArray[newM-1] + " minutes to "+hours);
        	}
        }
        
        
    }
}
