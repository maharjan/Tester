package com.pj.eulerproblem;

/**
 * Question : If we list all the natural numbers below 10 that are multiples of
 * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author prajin
 * 
 */
public class Problem1 {

	/**
	 * 15 is multiple of 3 & 5 both so count it only once & so on
	 */
	public void getSum() {
		int sum = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum : " + sum);
	}

	static public void main(String args[]) {
		Problem1 problem = new Problem1();
		problem.getSum();
	}
}
