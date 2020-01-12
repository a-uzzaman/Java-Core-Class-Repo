package javaClass.JavaCore;

public class OperatorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 5;
		int b= 3;
		int result;
		//Addition
		result=a+b;
		System.out.println("when we add a+b we get the result "+result);
		
		//Subtarction
		result= a-b;
		System.out.println("when we subtract a-b we get the result "+result);
		
		//Multiplication
		result=a*b;
		System.out.println("when we Multiplication a*b we get the result "+result);
		
		//Division
		double resultindecimal;
		
		resultindecimal= (double)a/(double)b;
		System.out.println("when we Division a/b we get the result "+ (int)resultindecimal);
		
		//Widening the Division result

		System.out.println("when we Division a/b we get the result "+resultindecimal);
		
		//Modulus is Remainder in division
		result=a%b;
		System.out.println("The modulus of dividing a/b is"+result);
		
		//increments 
		result = ++a; //addition increment
		System.out.println(result);
		
		result = --b; //subtraction increment
		System.out.println(result);
		
		// Assignment operators
		
		a+=3; // result should be 5+3=8
		System.out.println(a);
		
		
		
	}

}
