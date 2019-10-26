# Problem Set 4

It's time to put your skills to the test. This problem set focuses on using iterative control structures. The `main` method is done for you. Lines 30-39 trigger each of the predefined methods, which you can think of as self-contained executable pieces of logic. Write your code for each exercise in the corresponding method.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-4`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. Clone my skeleton repository into a directory named `pset-4`.
```
$ git clone git@github.com:ap-java-ucvts/pset-4-skeleton.git pset-4
```
4. Change into your newly created `pset-4` directory.
```
$ cd pset-4
```
5. Overwrite the remote, which originally points at my skeleton repository.
```
$ git remote rename origin upstream
```
6. Add a new remote that points at your `pset-4` repository. Replace `YOUR-USERNAME` with your actual username.
```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-4.git
```
7. Open up the `ProblemSet4.java` file in the text editor of your choice.

That's a lot of comments. Read each one carefully, as they are designed to point you in the right direction for each exercise.

## Exercises

The specifications for each exercise are outlined below. Your job is to write lines of code to produce answers to my questions. Each exercise requires that you ask the user to enter one or more values. Your code must meet the requirements set forth in this section (as well as the *Deliverables* section).

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

### Exercise 1

Prompt the user to enter two integers. The first integer is a lower bound, and the second integer is an upper bound. Compute the sum of all even integers between the lower and upper bounds, including the bounds themselves.

Your code must work for all integers in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1].

![Exercise 1 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-1.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* The lower bound must be less than or equal to the upper bound.
* Format the sum with separating commas.
* Continuously prompt the user until a valid input is provided.

### Exercise 2

Prompt the user to enter a positive integer. Print the digits of this integer in reverse order.
     
Your code must work for all integers in the range [1, 2<sup>31</sup> - 1].

![Exercise 2 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-2.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Separate each digit with a comma and a space.
* Continuously prompt the user until a valid input is provided.

### Exercise 3

Prompt the user to enter a positive integer. Compute the sum of all of the odd digits in the integer.

Your code must work for all integers in the range [1, 2<sup>31</sup> - 1].

![Exercise 3 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-3.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Continuously prompt the user until a valid input is provided.

### Exercise 4

Prompt the user to enter a series of non-negative integers. When the user enters a negative integer, you can assume he or she is done entering values. What is the average of the values entered?

Your code must work for all integers in the range [0, 2<sup>31</sup> - 1].

![Exercise 4 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-4.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Continuously prompt the user until a valid input is provided.
* Round the average to two decimal places.

### Exercise 5

Prompt the user to enter a non-negative integer. Is this number prime?

There are two possible outputs.
* `Prime.`
* `Not prime.`

Your code must work for all integers in the range [0, 2<sup>31</sup> - 1].

![Exercise 5 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-5.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Continuously prompt the user until a valid input is provided.

### Exercise 6

Prompt the user to enter a positive integer. If the integer the user enters is called `n`, what is the `n`<em>th</em> Fibonacci number?

Your code must work for all integers in the range [1, 92].

![Exercise 6 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-6.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Continuously prompt the user until a valid input is provided.

### Exercise 7

Prompt the user to enter a positive integer. What are its factors?

Your code must work for all integers in the range [1, 2<sup>31</sup> - 1].

![Exercise 7 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-7.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Separate each factor with a comma and a space.
* Continuously prompt the user until a valid input is provided.

### Exercise 8

Prompt the user to enter an integer. Print a Super Mario-style half-pyramid of the specified height.

Your code must work for all integers in the range [1, 24].
     
![Exercise 8 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-8.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Continuously prompt the user until a valid input is provided.

### Exercise 9

Prompt the user to enter an integer. Print a Super Mario-style full pyramid of the specified height.

Your code must work for all integers in the range [1, 24].

![Exercise 9 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-9.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Print two spaces between the left and right halves of the pyramid.
* Continuously prompt the user until a valid input is provided.

### Exercise 10

Prompt the user to enter a credit card number (not a real one!). According to Luhn's algorithm, is the credit card number valid?

There are four possible outputs.
* `Amex.`
* `Mastercard.`
* `Visa.`
* `Invalid.`

Luhn's algorithm works as follows.
1. Multiply every other digit of the card number by two, starting with the second-to-last digit.
2. Add the products of those digits.
3. Add the digits that were not initially multiplied by two.
4. Add the sums from Steps 2 and 3.
5. If the last digit of the sum from Step 4 is a zero, then the card number is valid.

* American Express uses 15-digit numbers, starting with 34 or 37.
* Mastercard uses 16-digit numbers, starting with 51, 52, 53, 54, or 55.
* Visa uses 13- or 16-digit numbers, starting with 4.

Here's an example using an American Express card: 378282246310005.

First, you should identify the digits to be multiplied: every other digit, starting with the second-to-last digit. For clarity, these are in bold.
```
3**7**8**2**8**2**2**4**6**3**1**0**0**0**5
```
Now, multiply these digits by two.
```
7 x 2 + 2 x 2 + 2 x 2 + 4 x 2 + 3 x 2 + 0 x 2 + 0 x 2
```
Now, you have the products.
```
14 + 4 + 4 + 8 + 6 + 0 + 0
```
You need to add the digits of these products (not the products themselves).
```
1 + 4 + 4 + 4 + 8 + 6 + 0 + 0 = 27
```
Next, add that sum (i.e., 27) to the sum of the digits that weren't multiplied by two.
```
27 + 3 + 8 + 8 + 2 + 6 + 1 + 0 + 5 = 60
```
Since the checksum ends in in a zero, then the card number is valid. Because the original number is 15 digits and starts with a 37, it is an `Amex`.

Here a few examples you can use for testing.
* `378282246310005` and `371449635398431` should verify as `Amex.`
* `5555555555554444` and `5105105105105100` should verify as `Mastercard.`
* `4111111111111111` and `4012888888881881` should verify as `Visa.`

![Exercise 10 Output](https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-exercise-10.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
Continuously prompt the user until a valid input is provided, which is defined as a positive integer.

## Deliverables

Your code should produce the following output.

<span>
  <img src="https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-all-1.png" alt="Problem Set 4a Output" width="49.75%"/> <img src="https://github.com/ap-java-ucvts/pset-4-skeleton/blob/master/images/pset-4-all-2.png" alt="Problem Set 4b Output" width="49.75%"/>
</span>

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* October 27, 2019, at 11:59pm.

If you submit your problem set at midnight (i.e., October 28, 2019, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 5 unique commits to your repository.
* Your code must meet each requirement outlined in the *Exercises* and *Deliverables* sections.
* Your code must adhere to the course style guidelines.

Happy coding!
