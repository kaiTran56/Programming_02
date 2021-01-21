package com.tranquyet.tut_01;

import java.util.Arrays;

public class StringExercise implements Exercise<StringExercise> {

	/**
	 * @Answer:
	 * 
	 *          Q1: import to access built-in and user-defined packages into your
	 *          java source file so that your class can refer to a class that is in
	 *          another package by directly using its name.
	 *          <p>
	 *          Q2: 18
	 *          <p>
	 *          Q3: be be && true
	 *          <p>
	 *          Q5: true because of the same string pool memory which is a part in
	 *          heap memory
	 *          <p>
	 *          Q6: characters: [t, o, , b, e, , o, r, , n, o, t, , t, o, , b, e]
	 *          chars.length
	 *          <p>
	 *          Q7: print the result
	 *          <p>
	 *          Q8: It was converted to Char Arrays
	 */

	@Override
	public void doExercise() {
		System.out.println("<Exercise:4.3>");
		/* Declare the variables. */
		String str = "to be or not to be";
		// a string
		/* Do some operations on string */
		char chars[] = str.toCharArray();

		// the array of characters
		// that make up the string
		// convert the array to string
		String charsAsString = Arrays.toString(chars);
		int len = str.length();
		// the number of characters
		String w1 = str.substring(3, 5);
		// get a sub string
		String w2 = str.substring(16, 18);
		// get another sub string
		boolean equal = w1.equals(w2);
		// compare strings for equality
		/* Print out the results */
		System.out.println("string: " + str);
		System.out.println("length: " + len);
		System.out.println("word 1: " + w1);
		System.out.println("word 2: " + w2);
		System.out.println("word 1 is equal to word 2? " + equal);
		System.out.println("characters: " + charsAsString);
	}

	public static StringExercise getResult() {
		// TODO Auto-generated method stub
		return new StringExercise();
	}

}
