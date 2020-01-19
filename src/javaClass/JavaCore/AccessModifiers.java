package javaClass.JavaCore;

import javaClass.folder2.PrintClass2;

public class AccessModifiers {

	PrintClass2 printClass21=new PrintClass2();
	static ConstructorClass myObj= new ConstructorClass(30);
	static EcapsolationClass myObj2=new EcapsolationClass();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Encapsolution class name is "+myObj2.getName());
		System.out.println("My AGe from another class is "+myObj.age);
		myObj2.setName("Shima");
		System.out.println("Encapsolution class name is "+myObj2.getName());


	}

}
