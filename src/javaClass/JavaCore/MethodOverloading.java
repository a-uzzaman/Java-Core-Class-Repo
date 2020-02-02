package javaClass.JavaCore;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addnumbers(1.01f,20.02f);
		addnumbers(1,20);

	}
	
	static void addnumbers(int number1, int number2) {
		System.out.println("With variable as int "+number1+" "+number2);
	}
	
	static void addnumbers(float number1, float number2) {
		System.out.println("With variable as float "+number1+" "+number2);
	}

}
