package javaClass.JavaCore;

import java.util.ArrayList;
import java.util.Collections;



public class arrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Cars = new ArrayList();
		Cars.add("Mercedese");
		Cars.add("BMW");
		Cars.add("Honda");

		System.out.println(Cars.get(2));
		Cars.set(2, "Bently");
		System.out.println(Cars.get(2));
	
		Collections.sort(Cars);
		for(String car : Cars) {
			
			System.out.println(car);
		}
		
		Cars.clear();
		System.out.println(Cars.get(0));
		
		
		
		Cars.remove(2);
		System.out.println(Cars.get(2)); 
		
	}

}
