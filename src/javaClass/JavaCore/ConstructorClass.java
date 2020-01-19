package javaClass.JavaCore;

public class ConstructorClass {
	int age;
	
	public ConstructorClass(int initialAge) {
		age=initialAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorClass myObj= new ConstructorClass(33);
		ConstructorClass myObj2= new ConstructorClass(33);
		myObj.age=35;
		int newAge =myObj2.age;
		
		
		
		System.out.println("My obj age is "+myObj.age);
		System.out.println("My obj age is "+myObj2.age);
		System.out.println("My obj age is "+newAge);
		newAge=45;
		System.out.println("My obj age is "+newAge);
		System.out.println("My obj age is "+myObj2.age);
		
	}

}
