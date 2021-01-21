package com.tranquyet.tut_01;

public class ArrayExercise implements Exercise<ArrayExercise> {

	@Override
	public void doExercise() {
		System.out.println("<Exercise:4.2>");

		/* Declare the variables. */

		int nums[] = { 2, 0, 1, 3 };
		// an array of integers

		/* Do some operations on array */

		int sum = 0, i;
		int n;
		for (i = 0; i < 4; i++) {
			n = nums[i];
			System.out.printf("nums[%d] = %d%n", i, n);
			sum = sum + n;
		}
		System.out.print("Sum: ");
		System.out.println(sum);
	}

	public ArrayExercise getResult() {
		// TODO Auto-generated method stub
		return new ArrayExercise();
	}

}
