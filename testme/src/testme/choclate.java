package testme;

import java.util.Scanner;

public class choclate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int num = n/c;
            int oldnum = num ;
            while(num >= m){
                    if(num%m == 0){
                        int x  = num / m ;
                        num = x;
                        oldnum = oldnum + x;
                    }else{
                       int y =  num % m; 
                       int x  = num / m ;
                       int newAdded  = (y+x)/m;
                       num = ((x+y)%m)+newAdded;
                       oldnum = oldnum + x + newAdded;  
                    }

                
            }
            System.out.println(oldnum);
        }
    }
}
