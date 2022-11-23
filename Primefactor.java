package com.bridge.com;


public class Primefactor {
	public static void main(String[] args) {
		int number=22;
		for (int i=2; i<number; i++) {
			while(number%i==0) {
				System.out.println(i+" ");
				number=number/i;
			}
		}
		if (number>2) {
			System.out.println(number);
		}
	
}

}
