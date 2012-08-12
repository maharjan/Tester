package com.pj.eulerproblem;

/**
 * <strong>Question</strong>
 * <p>
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... +
 * 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * </p>
 * 
 * @author prajin
 * 
 */
public class Problem6 {
	Long sumOfSquare = new Long(0);
	Long squareOfSum = new Long(0);

	public void getDifference() {
		for (int i = 1; i <= 100; i++) {
			sumOfSquare = sumOfSquare + (long) Math.pow(i, 2);
			squareOfSum = squareOfSum + i;
		}
		squareOfSum = (long) Math.pow(squareOfSum, 2);
		System.out.println(squareOfSum - sumOfSquare);
	}

	static public void main(String args[]) {
		Problem6 main = new Problem6();
		main.getDifference();
	}
}
