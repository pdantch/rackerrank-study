package br.com.dantech;

import java.util.Scanner;

/**
 * Task Given an integer, , perform the following conditional actions:
 * 
 * If n is odd, print Weird. 
 * If n is even and in the inclusive range of 2 to 5, print Not Weird.
 * If n is even and in the inclusive range of 6 to 20, print Weird.
 * If n is even and greater than 20, print Not Weird.
 * 
 * Complete the stub code provided in your editor to print whether or not n is
 * weird.
 * 
 * Input Format
 * 
 * A single line containing a positive integer, .
 * 
 * Constraints
 * 
 * 1 <= n <=100
 * 
 * Output Format
 * 
 * Print Weird if the number is weird; otherwise, print Not Weird.
 * 
 * Sample Input 0
 * 
 * 3 Sample Output 0
 * 
 * Weird Sample Input 1
 * 
 * 24 Sample Output 1
 * 
 * Not Weird Explanation
 * 
 * Sample Case 0: n = 3 
 * is odd and odd numbers are weird, so we print Weird.
 * 
 * Sample Case 1: n = 24 
 * n > 20 and is even, so it isn't weird. Thus, we print Not Weird.
 * 
 * 
 * @author Dantch
 *
 */
public class JavaIfElse {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (isPair(num)) {
			if (num >= 2 && num <= 5 || num > 20) {
				System.out.println("Not Weird");
			}
			if (num >= 6 && num <= 20) {
				System.out.println("Weird");
			}
		} else {
			System.out.println("Weird");
		}

		scanner.close();

	}

	static Boolean isPair(int num) {
		return (num % 2 == 0);
	}

}