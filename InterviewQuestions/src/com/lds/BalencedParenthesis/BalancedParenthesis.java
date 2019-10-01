package com.lds.BalencedParenthesis;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String p = "(({[s]))";
		int pCounter = 0; // keeps count of parenthesis
		int sCounter = 0; // keeps count of square brackets
		int wCounter = 0; // keeps count of squiggly brackets
		int balance; // determines if counts are balanced

		// Loop through the string and perform an if statement on each character
		for (int i = 0; i < p.length(); i++) {

			/*
			 * If the character at the current index "i" is an open parenthesis or bracket
			 * increment the counter for that bracket, and decrement if it is a closed
			 * bracket.
			 */
			if (p.charAt(i) == '(') {
				pCounter++;
			} else if (p.charAt(i) == '[') {
				sCounter++;
			} else if (p.charAt(i) == '{') {
				wCounter++;
			} else if (p.charAt(i) == ')') {
				pCounter--;
			} else if (p.charAt(i) == ']') {
				sCounter--;
			} else if (p.charAt(i) == '}') {
				wCounter--;
			} else {
				//ignore letters and numbers
				continue;
			}
		}

		// Add the counters together to get one single balanced counter
		balance = pCounter + sCounter + wCounter;

		// If the balanced counter is not equal to 0 then the parenthesis are not equal.
		if (balance != 0) {
			System.out.printf(
					"String is not balanced. Parenthesis balance = %d. \nCounters:\n p = %d\n s = %d\n w = %d\n",
					balance, pCounter, sCounter, wCounter);
		} else {
			System.out.printf("String is balanced. Parenthesis balance = %d. \nCounters:\n p = %d\n s = %d\n w = %d\n",
					balance, pCounter, sCounter, wCounter);
		}

	}

}
