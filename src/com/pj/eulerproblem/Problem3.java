package com.pj.eulerproblem;

import java.util.ArrayList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author prajin
 * 
 */
public class Problem3 {

	public void getLargestPrimeFactor(Long n) {
		List<Long> factors = new ArrayList<Long>();
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(new Long(i));
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		
		Long temp = null;
		for (int i = 0; i < factors.size(); i++) {
			for (int j = 1; j < factors.size(); j++) {
				if (factors.get(j) > factors.get(i)) {
					temp = factors.get(j);
				}
			}
		}

		for (Long l : factors) {
			System.out.println(l + " ");
		}
		System.out.println("Largest " + temp);
	}

	public static void main(String[] args) {
		Problem3 main = new Problem3();
		main.getLargestPrimeFactor(new Long("600851475143"));
	}
}
