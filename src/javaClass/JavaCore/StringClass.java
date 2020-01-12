package javaClass.JavaCore;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String greeting ="Hello! How are you?";
		System.out.println(greeting);
		int countofstring= greeting.length();
		System.out.println("The number of charecters in the string is "+ countofstring);
		System.out.println(greeting.toLowerCase());
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.indexOf("How"));
		String farewell= "Goodbye!";
		System.out.println(greeting+" "+farewell);
		System.out.println(greeting.concat(" "+farewell));
		System.out.println("Hello! My name is \"Ashif\".");
		String classAshif="This is Ashif's Class";
		System.out.println(classAshif);
		System.out.println("Hello! My name is \r Ashif.");
		System.out.println("Hello! My name is \n Ashif.");
		System.out.println("Hello! My name is \t Ashif.");

		int x=3;
		String y="10";
		String z = "20";
		System.out.println(greeting+x);
		System.out.println(x+x);
		System.out.println(x+y+z);
	}

}
