package com.pj.eulerproblem;

import java.util.ArrayList;
import java.util.List;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author prajin
 * 
 */
public class Problem4 {
	List<Integer> palindromeNumbers = new ArrayList<Integer>();

	/**
	 * init palindrome process
	 */
	public void getPalindrome() {
		for (int i = 100; i < 1000; i++) {
			for (int j = 101; j < 1000; j++) {
				if (palindromeCheck(String.valueOf(i * j))) {
					palindromeNumbers.add(i * j);
				}
			}
		}
		biggestPalindromeNumber();
	}

	/**
	 * Check for palindrome number
	 * 
	 * @param number
	 * @return
	 */
	public boolean palindromeCheck(String number) {
		String reverse = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			reverse = reverse + number.charAt(i);
		}
		if (number.equals(reverse)) {
			System.out.println(number);
			return true;
		}
		return false;
	}

	/**
	 * Sort out biggest palindrome number
	 */
	public void biggestPalindromeNumber() {
		int temp = 0;
		for (int i = 0; i < palindromeNumbers.size(); i++) {
			for (int j = 1; j < palindromeNumbers.size(); j++) {
				if (palindromeNumbers.get(j) > palindromeNumbers.get(i)) {
					temp = palindromeNumbers.get(j);
				}
			}
		}
		System.out.println("Largest Palindrome : " + temp);
	}

	public static void main(String args[]) {
		Problem4 main = new Problem4();
		main.getPalindrome();
	}
}
