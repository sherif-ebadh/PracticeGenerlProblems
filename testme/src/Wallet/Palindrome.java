package Wallet;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {
//		System.out.println(checkPalindromeFOrAWord("1121"));
//		System.out.println(checkPalindromeFOrAWord("1221"));
//		System.out.println(checkPalindromeFOrAWord(" 1221 "));
//		
//		String[] lines = { "civic", "A man, a plan, a canal: Panama.",
//				"A Toyota. Race fast, safe car. A Toyota.",
//				"Cigar? Toss it in a can. It is so tragic.",
//				"Dammit, I'm mad!", "Delia saw I was ailed.",
//				"Desserts, I stressed!", "Draw, O coward!", "Lepers repel.",
//				"Live not on evil.", "Lonely Tylenol.",
//				"Murder for a jar of red rum.", "Never odd or even.",
//				"No lemon, no melon.", "Senile felines.", "So many dynamos!",
//				"Step on no pets.", "Was it a car or a cat I saw?",
//				"Dot Net Perls is not a palindrome.",
//				"Why are you reading this?", "This article is not useful." };
//
//			// Test each line to see if it is a palindrome.
//			for (String line : lines) {
//			    if (checkPalindromeFOrString(line)) {
//				System.out.println("Palindrome:     " + line);
//			    } else {
//				System.out.println("Not palindrome: " + line);
//			    }
//			}
//			
			getPalindermCount("barbarabar ");
	}

	static boolean checkPalindromeFOrAWord(String str) {
		// assume we need to test the str without trim , Test str is a case
		// sensitive
		// to trim the string uncomment the next line

		// str = str.trim();
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	static boolean checkPalindromeFOrString(String str) {
		// remove special characters
		str  = str.replaceAll("[-+.^:, ]","");
		str = str.toLowerCase();
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	
	static int getPalindermCount(String str) {
		// remove special characters
		str  = str.replaceAll("[-+.^:, ]","");
		Set<String> x = new HashSet<String>();
		
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String newStr = str.substring(i,j);
				if(checkPalindromeFOrAWord(newStr)){
					x.add(newStr);
				}
			}
		}
		
		
		
//		return str.equals(new StringBuilder(str).reverse().toString());
		return x.size();
	}
}