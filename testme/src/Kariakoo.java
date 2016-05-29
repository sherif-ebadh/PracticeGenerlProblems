import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class letterCount {
	static String countletter(String str) {

		return String.valueOf(str.length());
	}
}

public class Kariakoo {

	// ;
	//
	// static String sum(String... numbers) {
	// double total = 0;
	//
	// for (String number : numbers) {
	// total = total + Float.parseFloat(number);
	// }
	//
	// return String.valueOf(total);
	//
	// ArrayList x = new ArrayList();
	// x.add(e);
	// x.add
	// }

	public static boolean isBalanced(String in) {
		Stack st = new Stack();

		for (char chr : in.toCharArray()) {
			if (chr == '{' || chr == '[' || chr == '(') {
				st.push(chr);
			} else if (chr == '}') {
				if (st.isEmpty())
					return false;
				if ((char) st.peek() == '{') {
					st.pop();
				} else {
					return false;
				}
			} else if (chr == ']') {
				if (st.isEmpty())
					return false;
				if ((char) st.peek() == '[') {
					st.pop();
				} else {
					return false;
				}

				// char x = (char) st.pop();
				// if(x != '['){
				// return false;
				// }
			} else if (chr == ')') {
				if (st.isEmpty())
					return false;
				if ((char) st.peek() == '(') {
					st.pop();
				} else {
					return false;
				}
			}
		}

		return st.empty();
	}

	
	
//	class SampleComparator implements Comparator<String> 
	
	
	static int Fib(int n) {
		long x  = Calendar.getInstance().getTimeInMillis();
		if(n<=2){
			return 1;
		}
		
		return Fib(n-1) + Fib(n-2);
//		return value;
	}
	
	static String FibForFOr(int n) {
		// 1,1,2,3,5,8,13
		long x  = Calendar.getInstance().getTimeInMillis();
		if(n<=2){
			return "1";
		}
		BigInteger first =new BigInteger("1");
		BigInteger last = new BigInteger("1");
		BigInteger sum = new BigInteger("0");
		for(int i=3;i<=n;i++){
			sum = first.add(last);
			first = last ;
			last = sum;
		}
		long y  = Calendar.getInstance().getTimeInMillis();
		
		System.out.println(y - x);
		return sum.toString();
//		return value;
	}
	

	static int getPositionAt(int n) {
		return 1 << 2;

		//
		// return steps(n) + getPositionAt(n-1);
		// }
		//
		// static int steps(int n){
		// if(n == 0){
		// return 0;
		// }
		// if(n == 1){
		// return 1;
		// }
		// if(n == 2){
		// return -2;
		// }
		//
		// return steps(n-1) - steps(n-2);

	}

	public static void main(String[] args) {
		// System.out.println(Kariakoo.check("{[]}()")); // true
		// System.out.println(Kariakoo.check("{[}](")); // false
		// System.out.println(Kariakoo.check("(kjds(hfkj)sdhf")); // false
		// System.out.println(Kariakoo.check("(sfdsf)(fsfsf)")); // true
		// System.out.println(Kariakoo.check("(dsfdf)")); // true
		// System.out.println(Kariakoo.check("[(()])")); // false
		//
		// System.out.println(Kariakoo.check("([(([[(([]))]]))])")); // true
		// System.out.println(Kariakoo.check("[](()()[[]])()[]([])")); // true
		// System.out.println(Kariakoo.check("([((([(([]))])))))])")); // false
		// System.out.println(Kariakoo.check("[](()()[[]])[][[([])")); // false
		//
		// letterCount.countletter("Yes we code");
		// System.out.println(Kariakoo.getPositionAt(3)); // -4
		// Scanner sc=new Scanner(System.in);
		// String A=sc.next();
		// String B=sc.next();
		// boolean ret=isAnagram(A,B);
		// if(ret)System.out.println("Anagrams");
		// else System.out.println("Not Anagrams");

		sort2Nd();
		long x  = Calendar.getInstance().getTimeInMillis();
		System.out.println(Fib(100));
		long y  = Calendar.getInstance().getTimeInMillis();
		System.out.println(y - x);
		
		System.out.println(FibForFOr(100));
		
		
//		1,1,2,3,5,8,13

	}
	
	static void sort2Nd() {

		String[] lines = { "Jervie,12,M", "Jaimy,11,F", "Tony,23,M", "Janey,11,F", };
		List<String> rowList = new ArrayList<String>(Arrays.asList(lines));
		Collections.sort(rowList, new SampleComparator());

		for (String string : rowList) {
			System.out.println(string);
		}
	}
}

class SampleComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		String array1[] = o1.split(",");
		String array2[] = o2.split(",");
		return array1[1].compareTo(array2[1]);
	}
}
