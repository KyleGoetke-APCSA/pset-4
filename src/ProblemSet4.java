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
        ps.sum();
        ps.reverse();
        ps.digits();
        ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();

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
                System.out.printf("%s.\n", integerString.substring(i-1, i));
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
        long sum = 0;

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
                sum += digit;
                integer /= 10;
            } else {
                integer /= 10;
            }
        }

        // prints final answer
        System.out.println("\n" + sum + ".");
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
        long sum = 0;
        int numberOfValues = 0;

        // inserts blank space
        System.out.print("\n");

        // makes sure that the integer is in the correct range
        do {
            System.out.print("Non-negative integer: ");
            integer = in.nextInt();
            in.nextLine();
            if (integer >= 0) {
                sum += integer;
                numberOfValues++;
            }
        } while (integer >= 0);
        double avg = (double) sum / numberOfValues;

        // prints final answer
        System.out.printf("\n%,.2f.\n", avg);
    }


    /*
     * Exercise 5.
     *
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */

    public void prime() {
        // initialize variables
        long integer;
        boolean isPrime = true;

        // inserts blank space
        System.out.print("\n");

        // makes sure that the input is in the correct range
        do {
            System.out.print("Non-negative integer: ");
            integer = in.nextLong();
        } while (integer < 0);

        for (int i = 2; i <= integer / 2; ++i) {
            // condition for nonprime number
            if (integer % i == 0) {
                isPrime = false;
                break;
            }
        }

        // sets final answer based on isPrime
        String result = (isPrime) ? "Prime" : "Not prime";

        // prints final answer
        System.out.printf("\n%s.\n", result);
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */

    public void fibonacci() {
        // initialize variables
        int integer = -1;
        int integer1 = 0;
        int integer2 = 1;
        int integer3 = 0;

        // inserts blank space
        System.out.print("\n");

        // makes sure that the input is in the correct range
        do {
            System.out.print("Positive integer: ");
            integer = in.nextInt();
        } while (integer <= 0 || integer >= 93);

        // fibonacci sequence math
        for (int i = 1; i < integer; i++) {
            integer3 = integer1 + integer2;
            integer1 = integer2;
            integer2 = integer3;
        }

        // prints final answer
        System.out.printf("\n%d.\n", integer3);
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a positive integer. What are its factors?
     */

    public void factors() {
        // initialize variables
        long integer;

        // inserts blank space
        System.out.print("\n");

        // makes sure that the input is in the correct range
        do {
            System.out.print("Positive integer: ");
            integer = in.nextLong();
        } while (integer <= 0);


        // prints factors
        System.out.print("\n1, " + integer);
        for (int i = 2; i <= integer / i; i++) {
            if (integer % i == 0) {
                System.out.print(", " + i + ", " + integer / i);
            }
        }
        System.out.print(".");

        // inserts blank space
        System.out.print("\n");
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */

    public void mario() {
        // initialize variables
        int height = 0;
        int numOfSpaces = 0;
        int numOfBlocks = 0;

        // inserts blank space
        System.out.print("\n");

        // makes sure that the input is in the correct range
        do {
            System.out.print("Height: ");
            height = in.nextInt();
        } while (height <= 0 || height >= 25);

        // runs for the total height
        for (int i = 0; i < height; i++) {
            System.out.println();

            numOfSpaces = height - i - 1;
            for (int j = 0; j < numOfSpaces; j ++) {
                System.out.print(" ");
            }

            numOfBlocks = i + 2;
            for (int j = 0; j < numOfBlocks; j ++) {
                System.out.print("#");
            }
        }
        // inserts blank space
        System.out.print("\n");
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */

    public void luigi() {
        // initialize variables
        int height = 0;
        int numOfSpaces = 0;
        int numOfBlocks = 0;

        // inserts blank space
        System.out.print("\n");

        // makes sure that the input is in the correct range
        do {
            System.out.print("Height: ");
            height = in.nextInt();
        } while (height <= 0 || height >= 25);

        // runs for the total height
        for (int i = 0; i < height; i++) {
            System.out.println();

            numOfSpaces = height - i - 1;
            for (int j = 0; j < numOfSpaces; j ++) {
                System.out.print(" ");
            }

            numOfBlocks = i + 2;
            for (int j = 0; j < numOfBlocks; j ++) {
                System.out.print("#");
            }

            System.out.print("  ");

            for (int j = 0; j < numOfBlocks; j ++) {
                System.out.print("#");
            }

            for (int j = 0; j < numOfSpaces; j ++) {
                System.out.print(" ");
            }
        }
        // inserts blank space
        System.out.print("\n");
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */

    public void credit() {
        // initialize variables
        long cardNumber = 0;
        // String sumOneString = "";
        int sumTwo = 0;
        int sumOne = 0;
        String typeOfCard = "";
        String cardString = "";
        // Sets default value to invalid
        typeOfCard = "Invalid";

        // inserts blank space
        System.out.print("\n");

        // gets input from user
        do {
            System.out.print("Number: ");
            cardNumber = in .nextLong();
            cardString = Long.toString(cardNumber);
        } while (cardNumber <= 0);

        if (cardString.length() == 15 && (cardString.substring(0, 2).equals("37") ||
          cardString.substring(0, 2).equals("34")) && ((sumOne + sumTwo) % 10 == 0)) {
            typeOfCard = "Amex";
        } else if ((cardString.length() == 16 || cardString.length() == 13) && ((sumOne + sumTwo) % 10 == 0) &&
          (cardString.substring(0, 1).equals("4"))) {
            typeOfCard = "Visa";
        } else if (cardString.length() == 16 && ((sumOne + sumTwo) % 10 == 0)) {
            switch (cardString.substring(0, 2)) {
                case "51":
                    typeOfCard = "Mastercard";
                    break;
                case "52":
                    typeOfCard = "Mastercard";
                    break;
                case "53":
                    typeOfCard = "Mastercard";
                    break;
                case "54":
                    typeOfCard = "Mastercard";
                    break;
                case "55":
                    typeOfCard = "Mastercard";
                    break;
            }
        }

        // prints final answer
        System.out.printf("\n%s.\n", typeOfCard);
    }
}
