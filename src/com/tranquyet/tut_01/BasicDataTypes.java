package com.tranquyet.tut_01;

public class BasicDataTypes implements Exercise<BasicDataTypes> {

	/**
	 * @Answer:
	 * 
	 * 
	 *          Q1: The procedure main like a key to help JVM which could recognize
	 *          the code and run these
	 *          <p>
	 *          Q3: double is data types in Java
	 *          <p>
	 *          Q4: variable
	 *          <p>
	 *          Q5: method
	 *          <p>
	 *          Q6: with println will add 1 empty line break
	 *          <p>
	 *          Q8+9: It could run if the variable were be casting to Integer
	 *          because of Double which is bigger than Integer with 8byte compare to
	 *          4byte respectively
	 * 
	 */
	@Override
	public void doExercise() {

		System.out.println("<Exercise:4.1>");
		/* Declare the variables. */

		double principal;
		// The value of the investment.

		double rate;
		// The annual interest rate.

		double interest;
		// Interest earned in one year.

		/* Do the computations. */

		principal = 17000;

		rate = 0.07;

		interest = principal * rate;
		// Compute the interest.

		principal = principal + interest;

		// Compute value of investment after one year, with interest.

		// (Note: The new value replaces the old value of principal.)

		/* Output the results. */

		System.out.print("The interest earned is $");

		System.out.println(interest);

		System.out.print("The value of the investment after one year is $");

		System.out.println(principal);

	}

	public static BasicDataTypes getResult() {
		// TODO Auto-generated method stub
		return new BasicDataTypes();
	}

}
