package javaClass.JavaCore;

public class WhileLoop {
	public static void main(String[] args) {

		int x=0;
		while (x>0 && x<4) {
			System.out.println("Checks value first");
			System.out.println("Value of x is "+x);
			x++;
			System.out.println("New value of x is "+x);
		}
		
		int y= 0;
		do {
			System.out.println("old Value of y is "+y);
			y++;
			System.out.println("New value of y is "+y);
			System.out.println("Checks value last");

		}
		while(y>0 && y<4);
	}
}
