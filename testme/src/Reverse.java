public class Reverse {
	public static String reverseA(String str){
        if(str.length() <=1){
        	return str;
        }
       	String reversed = reverse(str.substring(1)) + str.charAt(0);
        return reversed;
	}
	public static String reverse(String str){
        if(str.length() <=1){
        	return str;
        }
       	String reversed = reverse(str.substring(1)) + str.charAt(0);
        return reversed;
	}
	
	public static String reverseByFor(String str){
        StringBuilder sb = new StringBuilder();
        for(int x= str.length();x>0;x--){
        	sb.append(str.substring(x-1,x));
        }
        return sb.toString();
	}
	
	public static String reverseBySB(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
	}

	public static void main(String[] args) {
		
		System.out.println(reverse("ABC"));
		System.out.println(reverse("Zalando"));
		System.out.println(reverse("heLLO"));
		System.out.println(reverse("A"));
		
		System.out.println(reverseByFor("ABC"));
		System.out.println(reverseByFor("Zalando"));
		System.out.println(reverseByFor("heLLO"));
		System.out.println(reverseByFor("A"));
		
	}
}