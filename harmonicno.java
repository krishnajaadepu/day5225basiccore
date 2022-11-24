package com.bridge.com;
/*Harmonic Number
a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

import java.util.Scanner;
public class harmonicno {
	static double harmonic(int n) {
		double h = 1;
		for (double i = 2; i <= n; i++) {
			h = h + 1 / i;
		}
		return h;
	}

	/**
	 * main method to test the class
	 * 
	 * @param ars
	 */
	public static void main(String[] ars) {
		Scanner s = new Scanner(System.in);
		/*
		 * try and catch to not terminate at wrong input
		 */
		try {
			System.out.println("enter harmonic no to find");
			int n = s.nextInt();
			System.out.println(harmonic(n));

		} catch (Exception e) {
			System.out.println("enter integer");
			main(ars);
		}
		s.close();

}
}
