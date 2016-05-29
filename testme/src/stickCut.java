import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class stickCut {

	 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 int arr[] = new int[n];
	 for(int arr_i=0; arr_i < n; arr_i++){
	 arr[arr_i] = in.nextInt();
	 }
	
	 do{
	 System.out.println(arr.length);
	 int smallest = arr[0];
	 for(int i=0; i<arr.length;i++){
	 //get the smallest length
	 if(smallest > arr[i]){
	 smallest = arr[i];
	 }
	 }
	
	
	 int count = 0;
	 // sub from the latest value
	 for(int j=0; j<arr.length;j++){
	 //get the smallest length
	 arr[j] =arr[j]-smallest;
	 if(arr[j] != 0){
	 count++;
	 }
	
	 }
	 int newArr[] = new int[count];
	 int index=0;
	 for(int j=0; j<arr.length;j++){
	 //get the smallest length
	 if(arr[j] != 0){
	 newArr[index] = arr[j];
	 index++;
	 }
	 }
	 arr = new int[newArr.length];
	 arr = Arrays.copyOf(newArr, newArr.length);
	
	 }while(arr.length > 0);
	
	
	
	
	
//	 }
	
	
//	 public static void main(String[] args) {
//	 Scanner in = new Scanner(System.in);
//	 int n = in.nextInt();
//	 int m = in.nextInt();
//	 int count =0 ;
//	 int arr[] = new int[m];
//	
//	 for(int arr_i=0; arr_i < m; arr_i++){
//	 arr[arr_i] = in.nextInt();
//	 }
//	
//	 for(int x = 0 ; x<arr.length;x++){
//	 for(int y=x+1; y<arr.length;y++){
//	
//	 if(arr[x]+arr[y] == n){
//	 count++;
//	 }
//	 }
//	 }
//	 if(count>0){
//	 System.out.println("1");
//	 }else{
//	 System.out.println("0");
//	 }
	
//	 }

	// public static void main(String[] args) {
	// Scanner in = new Scanner(System.in);
	// String s=in.nextLine();
	// String[] tokens=s.trim().split(" ");
	//
	// if(tokens!=null && tokens.length == 1){
	// System.out.println(tokens[0]);
	// }
	//
	// if(tokens!=null && tokens.length>1){
	// StringBuilder sb = new StringBuilder(tokens[0]);
	// for(int x = 1 ; x<tokens.length;x++){
	// int value = new Integer(tokens[x]).intValue()-new
	// Integer(tokens[x-1]).intValue();
	// if(value <= -127 || value >= 127){
	// sb.append(" -128");
	// }
	// sb.append(" ");
	// sb.append(value);
	// }
	// System.out.println(sb.toString());
	// }

	// public static void main(String[] args) {
	// int rect = 0;
	// int square = 0;
	// int other = 0;
	//
	// Scanner in = new Scanner(new BufferedInputStream(System.in));
	// while (in.hasNext()) {
	// String s = in.nextLine();
	// String[] tokens = s.trim().split(" ");
	//
	// int[] values = new int[4];
	// for (int x = 0; x < tokens.length; x++) {
	// values[x] = new Integer(tokens[x]).intValue();
	// }
	// Arrays.sort(values);
	// if(values[0]<0 || values[1]<0 || values[2]<0 || values[3]<0){
	// other++;
	// }else if (values[0] == values[1] && values[2] == values[3]) {
	// if (values[0] == values[2]) {
	// square++;
	// } else {
	// rect++;
	// }
	//
	// } else {
	// other++;
	// }
	// }
	// System.out.print(square + " " + rect + " " + other);
	// }

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		int m = in.nextInt();
//		int count = 0;
//
// String[] tokens=str.trim().split(" ");
// int [] arr = new int[m];
// String [] hotelreview = new String[m];
//		for (int arr_i = 0; arr_i < m; arr_i++) {
//			arr[arr_i] = in.nextInt();
//			hotelreview[arr_i]= in.nextLine();
//			String[] hotelreviewTokens=hotelreview[arr_i].trim().split(" ");
//			for(int x=0;x< hotelreviewTokens.length;x++){
//				Arrays.cont
//			}
//		}
//
//		for (int x = 0; x < arr.length; x++) {
//			for (int y = x + 1; y < arr.length; y++) {
//
//				if (arr[x] + arr[y] == n) {
//					count++;
//				}
//			}
//		}
//		if (count > 0) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}

	}

	// public static void main(String[] args) {
	// Scanner in = new Scanner(System.in);
	// String s=in.nextLine();
	// String[] tokens=s.trim().split(" ");
	//
	// if(tokens!=null && tokens.length == 1){
	// System.out.println(tokens[0]);
	// }
	//
	// if(tokens!=null && tokens.length>1){
	// StringBuilder sb = new StringBuilder(tokens[0]);
	// for(int x = 1 ; x<tokens.length;x++){
	// int value = new Integer(tokens[x]).intValue()-new
	// Integer(tokens[x-1]).intValue();
	// if(value <= -127 || value >= 127){
	// sb.append(" -128");
	// }
	// sb.append(" ");
	// sb.append(value);
	// }
	// System.out.println(sb.toString());
	// }
}