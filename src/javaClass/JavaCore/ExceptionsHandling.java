package javaClass.JavaCore;

public class ExceptionsHandling {

	  public static void main(String[ ] args) {
		    int[] myNumbers = {1, 2, 3};
		    try {
		    System.out.println(myNumbers[10]); // error!
		    }
		    catch(Exception e) {
		    	System.out.println("There is an error in the code here is the error "+e.toString());
		    }
		    System.out.println("This will only run if there is TRy Catch");
		  }

}
