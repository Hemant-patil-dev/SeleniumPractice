package Array;

public class ArrayMax {
	public static void main(String [] args) {
	       int [] array = {123,456,23,56,789};
	       int max = array[0];
	       for(int i=0; i<array.length; i++) {
	    	  if(max<array[i]) {
	    		  max = array[i];
	    	  }
	       }
	       System.out.println(max);
	}
}
