package com.bridge.com;
/*Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/

import java.util.Scanner;
public class distance {

	static void calculate(int x, int y) {
		System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter value for x");
			int x = s.nextInt();
			System.out.println("enter value for y ");
			int y = s.nextInt();
			calculate(x, y);
			s.close();
		} catch (Exception e) {
			System.out.println("enter integer only");
		}
	}
}
