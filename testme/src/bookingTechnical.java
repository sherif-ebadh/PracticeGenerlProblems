import java.util.Scanner;

public class bookingTechnical {
	
	public static void main(String []arg){
	String  [] words = {"foo", "bar", "baz", "food"};
		check(words);
	}
	
	/*
	# char nextChar() // returns character from "a".."z" or EOF
	# 
	# WordsOfInterest = [ 'foo', 'bar', 'baz', 'food'... ];
	# 
	# OUT: { "foo": 1, "bar": 12, "baz": 0, ...}

	my $ch = nextChar(); # 'f'
	$ch = nextChar(); # ‘o'
	$ch = nextChar(); # 'o'

	nextChar() returns this string 1-char at at time: "foodcatbarfaloof\0"

	OUTPUT: {
	foo => 1
	bar => 1
	baz => 0
	}

	sub nextChar() {
	     # ... implemented for you
	}



	*/

//	We get stream of characters, one by one, through nextChar.
//
//	What we need to do is counting how many words from the array WordsOfInterest
//	occurred in this stream.
//
//	If the question doesn't make sense, please ask questions. Here.
//
//	Let's assume that the stream can be really long, so can't fit in the available RAM.
//
//	We will not compile  the code, we will only read it. So, it doesn't need to work as an executable would.
//	It only needs to make sense.
//
//	So, can we get time complexity in terms of the big O notation for the whole algorithm?

	public static void check(String [] words){
	    String given = "";
//	    char x = nextChar();
//	  do{
//	      given+= x;
//	      x = nextChar();
//	  }while( x == '\0');
	  given = "foodcatfoodbarfalooffoobaz";
	  int [] countArr = new int[words.length] ; 
	  for(int i =0 ; i<words.length;i++){
	      int count = 0;
	      if(given.contains(words[i])){
	          count++;
	         int index =  given.indexOf(words[i]);
	         index = index + words[i].length();
	         while(index < given.length()){
	             String newSt = given.substring(index);
	             if(newSt.contains(words[i])){
	                 count++;
	                 index = index+newSt.indexOf(words[i])+words[i].length();
	             }else{
	            	 break;
	             }
	         }
	          countArr[i] = count;
	      }else{
	    	  countArr[i] = count;
	      }
	      
	  }  
	     for(int i =0 ; i<words.length;i++){
	         
	         System.out.println(words[i] + ":" + countArr[i]);
	     }
	     
	     System.out.println("*****************");
	     
	     int [] countArr2 = new int[words.length] ;
	     for(int i =0 ; i<words.length;i++){
		      String [] strCoun = given.split(words[i]);
		      if(given.endsWith(words[i])){
		    	  countArr2[i] =  strCoun.length;
		      }else{
		    	  countArr2[i] =  strCoun.length - 1;
		      }
		  }  
		     for(int i =0 ; i<words.length;i++){
		         
		         System.out.println(words[i] + ":" + countArr2[i]);
		     }
	    
	    }

	private static char nextChar() {
		
//		Arrays.
//		Scanner sc= new Scanner(System.in);
//	     return (char)sc.nextLine().;
	     return 0;
	}
}
