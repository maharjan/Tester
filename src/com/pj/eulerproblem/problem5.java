package com.pj.eulerproblem;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20
 * 
 * @author prajin
 * 
 */
public class problem5 {

	/**
	 * The logic behind this program is quite simple. The LCM(Least Common
	 * Multiple) of numbers from 1-20 give us the required answer. We initialize
	 * the variable ‘num’ to 1 and i=2. We haven’t kept i=1 because finding
	 * LCM(1,1) is unnecessary and not required. So we start with
	 * num=LCM(num,i). The while loop keeps executing till i reaches its limit,
	 * which is 20 in this case. For the logic behind the LCM function, please
	 * check this program
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static long LCM(long a, long b) {
		long num1 = a, num2 = b;
		while (a != b) {
			if (a < b) {
				a += num1;
			} else {
				b += num2;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		long num = 1;
		int limit = 20; // This is the limit, you can change it to whatever you
						// want.
		int i = 2; // Initializing i to 2
		System.out.println("This program will find out the least number which is divisible by all numbers from 1 to " + limit);
		while (i <= limit) // While loop executes till i reaches the limit.
		{
			num = LCM(num, i); // Calling LCM function to calculate the LCM of
								// the current'num' and 'i'
			i++; // Incrementing i
		}
		System.out.println("The answer is: " + num); // Prints the final answer.

	}// End of main
}
