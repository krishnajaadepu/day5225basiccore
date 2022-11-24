package com.bridge.com;
/*Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P -> Percentage of Head vs Tails*/

import java.util.Scanner;
public class flipcoin {
	static void flipPerc(int times) {
		double heads = 0;
		for (int i = 0; i < times; i++) {
			if (Math.random() > 0.5) {
				heads++;
			}
		}
		System.out.println("heads percentage is " + (float) (heads / times) * 100);
		System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter  no of times  to flip the coin");
		int times = s.nextInt();
		flipPerc(times);
		s.close();
	}
	
}
