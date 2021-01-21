package com.tranquyet.tut_01;

import java.util.Arrays;

public class StringExercise implements Exercise<StringExercise> {

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

	public StringExercise getResult() {
		// TODO Auto-generated method stub
		return new StringExercise();
	}

}
