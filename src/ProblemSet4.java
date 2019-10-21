/*
 * Problem Set 4.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet4 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();

        // comment out or uncomment as needed

        // ps.sum();
        // ps.reverse();
        ps.digits();
        // ps.average();
        // ps.prime();
        // ps.fibonacci();
        // ps.factors();
        // ps.mario();
        // ps.luigi();
        // ps.credit();

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     *
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */

    public void sum() {
		// initialize variables
		long lowerBound;
		long upperBound;
		long integerSum = 0;

		// inserts blank space
		System.out.print("\n");

		// makes sure that lowerBound < upperBound
		do {
			System.out.print("Lower bound: ");
	        lowerBound = in.nextLong();
			System.out.print("Upper bound: ");
	        upperBound = in.nextLong();
		} while (lowerBound > upperBound);

		// checks if lowerBound is even - if not, increases lowerBound
		if (lowerBound % 2 != 0) {
			lowerBound += 1;
		}

		// as long as lowerBound > upperBound, integerSum increases
		for (long i = lowerBound; i <= upperBound; i += 2) {
			integerSum += i;
		}

	   // prints the final sum
	   System.out.printf("\n%,d.\n", integerSum);
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */

    public void reverse() {
		// initialize variables
		int integer = 0;

		// inserts blank space
		System.out.print("\n");

		// makes sure that the integer is in the correct range
		do {
			System.out.print("Positive integer: ");
	        integer = in.nextInt();
		} while (integer <= 0);

		String integerString = Long.toString(integer);
		int stringLength = integerString.length();

		// inserts blank space
		System.out.print("\n");

		// prints the reversed integer
		for (int i = stringLength; i > 0; i--) {
			if (i == 1) {
				System.out.printf("%s.\n\n", integerString.substring(i-1, i));
			} else {
				System.out.printf("%s, ", integerString.substring(i-1, i));
			}
		}
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */

    public void digits() {
		// initialize variables
		long integer = 0;
		long digit = 0;
		long total = 0;

		// inserts blank space
		System.out.print("\n");

		// makes sure that the integer is in the correct range
		do {
	        System.out.print("Positive integer: ");
	        integer = in.nextLong();
		} while (integer <= 0);

		// runs as long as integer > 0
		while (integer > 0) {
			digit = integer % 10;
			// gets odd digits
			if (digit % 2 != 0) {
				total += digit;
				integer /= 10;
			} else {
				integer /= 10;
			}
		}
		// prints final answer
		System.out.println("\n" + total + ".");
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */

    public void average() {
		// initialize variables
		long integer = 0;

		// inserts blank space
		System.out.print("\n");

		// makes sure that the integer is in the correct range
		do {
	        System.out.print("Non-negative integer: ");
	        integer = in.nextLong();
		} while (integer <= 0);
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {

    }
}
