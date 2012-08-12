package com.pj.eulerproblem;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 * 
 * @author prajin
 * 
 */
public class Problem7 {
	private int counter = 0;

	public void calculatePrimeNumbers() {
		for (int i = 2;; i++) {
			if (isPrime(i)) {
				counter++;
//				System.out.print(counter + " : " + i + ", ");
			}
			if (counter == 10001) {
				System.out.println("PN " + i);
				break;
			}
		}
	}

	boolean isPrime(int n) {
		if (n > 2 && n % 2 == 0) {
			return false;
		}
		for (int i = 2; 2 * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		new Problem7().calculatePrimeNumbers();
	}
}
