package javaClass.JavaCore;

import java.util.HashMap;

public class HashMapCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Integer myInt = 100; 
	    String myString = myInt.toString();
	    System.out.println(myString.length());
	    
	    System.out.println(myInt+1);
	    System.out.println(myString+1);
	    
		HashMap<String, String> StudentsAge= new HashMap<String, String>();
		StudentsAge.put("Ashif", "33");
		StudentsAge.put("Hera", "32");
		StudentsAge.put("Hassan", "32");
		
	System.out.println(StudentsAge);
	
	System.out.println(StudentsAge.get("Hera"));
	StudentsAge.remove("Hassan");
	System.out.println(StudentsAge);
	
	for(String StudentName : StudentsAge.keySet()) {
		System.out.println(StudentName);
	}
	for(String StudentName : StudentsAge.values()) {
		System.out.println(StudentName);
	}
	for(String StudentName : StudentsAge.keySet()) {
		System.out.println("Students name is "+StudentName+" and age is "+ StudentsAge.get(StudentName));
	}
	}
}
