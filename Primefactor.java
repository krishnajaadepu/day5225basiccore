package com.bridge.com;

/*Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.*/

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
