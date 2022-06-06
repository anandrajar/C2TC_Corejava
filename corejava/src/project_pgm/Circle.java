package project_pgm;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colour of the circle:");
		
		System.out.println("Enter the radius of the circle::");
		radius=sc.nextInt();
		area=3.14*(radius*radius);
		System.out.println("area of the circle is::"+area);

	}

}
