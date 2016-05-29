package testme;

import java.util.ArrayList;
import java.util.Scanner;

public class Salt2 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=500;i<=1000;i++){
			if(i%2 == 0){
				if(i%7 !=0){
					sum += i;
				}
				
			}
		}
		System.out.println(sum);
	}
}