package testme;

import java.util.Scanner;

public class StringEncrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		StringBuffer bf = new StringBuffer();
		for (int x = 0; x < s.length(); x++) {
			char c = s.charAt(x);
			int ascii = (int) c;
			if (ascii >= 65 && ascii <= 90) {
				// Upper case
				ascii = ascii + k;
				while (ascii > 90) {
					ascii = ascii - 90;
					ascii = 65 + ascii -1;
				}

			} else if (ascii >= 97 && ascii <= 122) {
				// lower Case
				ascii = ascii + k;
				while (ascii > 122) {
					ascii = ascii - 122;
					ascii = 97 + ascii -1 ;
				}
			}

			bf.append(Character.toChars(ascii));
		}
		System.out.println(bf.toString());

	}
}