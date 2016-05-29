package testme;
import java.util.*;

public class PerformanceTest {
  private static final long MEGABYTE = 1024L * 1024L;

  public static long bytesToMegabytes(long bytes) {
    return bytes / MEGABYTE;
  }

  public static void main(String[] args) {
	  // Get the Java runtime
	    Runtime runtime = Runtime.getRuntime();
	    // Run the garbage collector
	    runtime.gc();
	    // Calculate the used memory
	    long memory = runtime.totalMemory() - runtime.freeMemory();
	    System.out.println("before Used memory is bytes: " + memory);
	    System.out.println("before Used memory is megabytes: "
	        + bytesToMegabytes(memory));
	    
	    // I assume you will know how to create a object Person yourself...
    String[] test = new String[10000]; 
	    Arrays.fill(test, "test me");
	    
	    test   = fixArraySize(test);
	    
//	    List<String> list = new ArrayList<String>();
//    for (int i = 0; i <= 100000; i++) {
//      list.add("Knopf");
//    }
    // Get the Java runtime
    // Run the garbage collector
    runtime.gc();
    // Calculate the used memory
    memory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    
    
//    list = null;
    test = null ;
    
    // Get the Java runtime
    // Run the garbage collector
    runtime.gc();
    // Calculate the used memory
    memory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: "  + bytesToMegabytes(memory));
  }

private static String[] fixArraySize(String[] test) {
	
	String [] test2 =  Arrays.copyOf(test,test.length);
	test = new String [20000]; 
	test = test2;
	test2 = null;
	return test;
}
}