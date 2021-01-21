package com.tranquyet.tut_01;

public class ArrayExercise implements Exercise<ArrayExercise> {

	/**
	 * @Answer:
	 * 
	 *          Q1: It will be create an object of array
	 *          <p>
	 *          Q2: to use new to allocate an array, you must specify the type and
	 *          number of elements to allocate.
	 *          <p>
	 *          Q3: use to format the result when show in screen
	 *          <p>
	 * 
	 */
	@Override
	public void doExercise() {
		System.out.println("<Exercise:4.2>");

		/* Declare the variables. */

		int nums[] = { 2, 0, 1, 3 };

		// an array of integers

		/* Do some operations on array */

		int i;
		int n;
		int sumEven = 0;
		int sumOdd = 0;
		for (i = 0; i < 4; i++) {
			n = nums[i];
			if (n % 2 == 0) {
				sumEven += n;
			} else {
				sumOdd += n;
			}
		}
		System.out.print("Sum Odd Number: ");
		System.out.println(sumOdd);
		System.out.print("Sum Even Number: ");
		System.out.println(sumEven);
	}

	public static ArrayExercise getResult() {
		// TODO Auto-generated method stub
		return new ArrayExercise();
	}

}
