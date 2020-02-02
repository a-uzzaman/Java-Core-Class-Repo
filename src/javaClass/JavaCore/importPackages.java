package javaClass.JavaCore;

import java.util.*;

import javaClass.folder2.PrintClass2;


public class importPackages extends MethodOverloading{

	
	static Scanner scn= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is your name?");
		String name= scn.nextLine();
		System.out.println("Hi "+name+"! How old are you?");
		String age =scn.nextLine();
		System.out.println("Wow thats great! I am "+age+" younger than you.");
		addnumbers(10.0f, 11.02f);
		
	}

}
