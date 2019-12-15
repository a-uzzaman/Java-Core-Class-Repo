package javaClass.JavaCore;

import sun.misc.FloatingDecimal;

public class PrintClass1 {

	public static void main(String[] args) {
		//This is a comment
		/*  Starting of comment
		  	middle of comment
		 	End of comment */

  
//		Shortcut keyboard keys to comment is ctrl+7
		// my first program
		//ctrl+space turns on intelisence to help complete code
		//. to access different methods
		// all code lines need to end with semicolon ;
		// to run a program we need to right click inside the code and run as java application
		System.out.println("Hello world!!");
		
		System.out.print("new writing");
		System.out.println("same line ");
		System.out.println("shortcut");
		
		
		// Variable must be declared
		
		int numbers;
		float flotingNumbers;
		String charectors;
		boolean booleanVariable;
		
		
		numbers= 101;
		flotingNumbers= 0.546732f;
		charectors= "Any string";
		booleanVariable= true;
		
		System.out.println(numbers);
		System.out.println(flotingNumbers);
		System.out.println(charectors);
		System.out.println(booleanVariable);

		System.out.println("The value pof the number variable is "+numbers);
		System.out.println("the floating value of the variable is "+ flotingNumbers);
		System.out.println("the string stored in the  charectors variable is "+charectors);
		System.out.println("the boolean value of the variable is "+booleanVariable);
		
		System.out.println(numbers+" "+flotingNumbers+" "+charectors+" "+booleanVariable);
	}

}
