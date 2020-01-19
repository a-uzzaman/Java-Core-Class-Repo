package javaClass.JavaCore;

public class CLassVSObjects {

	int age=20;
	String name="Ashif";
	String location="Bronx";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLassVSObjects myObj= new CLassVSObjects();
		CLassVSObjects myObj2= new CLassVSObjects();
		myObj2.age=25;
		System.out.println("My object age is "+myObj.age);
		System.out.println("My object name is "+myObj.name);
		System.out.println("My object age is "+myObj2.age);
	}

}
