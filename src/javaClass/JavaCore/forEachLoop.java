package javaClass.JavaCore;

public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] y = new int[3];
		y[0]=3;
		y[1]=6;
		y[2]=7;
		
		int[] x= {10,2,3,4,5,6};
		String[] animals= {"human","boy","cat"};
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x.length);
			System.out.println("The first value of x is "+x[i]);
		}
		for(String a:animals) {
			System.out.println("The name of the animal is "+a);
		}
		

		String[] bronx= {"Shima","Saju","Masum"};
		String[] Ozone={"Russel","Tanvir"};
		String[][] myStudents= {bronx,Ozone};
		
		System.out.println("My second student from Ozone is named "+myStudents[1][1]);
		for(int i=0;i<myStudents.length;i++) {
			for(int j=0; j<myStudents[i].length;j++) {
			System.out.println("My students names are "+myStudents[i][j]);
		}

		}
		
		for( String[] branches:myStudents) {
			for(String student:branches) {
				System.out.println("My students names are "+student);

			}
			
		}
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
	}

}
