package javaClass.JavaCore;

public class OOPClass {
	String teacher="Ashif";
	static int x=1;
	static int y=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			addNumbers(x,y);
			System.out.println("Print "+compareNumbers(x,y));
	}
	
	static void addNumbers(int number1, int number2) {
		int result= number1+number2;
		System.out.println("Print "+result);
	}
	static boolean compareNumbers(int number1, int number2) {
		boolean result= number1>number2;
		return result;
	}

}
