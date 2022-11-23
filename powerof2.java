package com.bridge.com;

public class powerof2 {
	public static void main(String[] args) {
		// INITIALIZATION
				int num, mul = 1;

				// DATA INPUT THROUGH COMMAND LINE
				num = Integer.parseInt(args[0]);

				// CONDITION CHECK
				if (num > 31) {
					System.out.println("value of number should be less than 31");
					return;
				}

				// COMPUTATION
				else {
					System.out.println(mul);
					for (int j = 1; j <= num; j++) {
						mul = mul * 2;
						System.out.println(mul);
					}
				}
	}
}
