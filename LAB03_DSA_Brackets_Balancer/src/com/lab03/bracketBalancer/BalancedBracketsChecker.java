package com.lab03.bracketBalancer;

import java.util.Set;
import java.util.Stack;

public class BalancedBracketsChecker {
	private String expression;
	private Result result;

	public BalancedBracketsChecker(String expression) {

		this.expression = expression;
		this.result = new Result(expression);
	}

	public Result check() {

		// Quick Check
		if (expression.length() % 2 != 0) {

			result.setErrorMessage("Number of character are NOT even");
			result.setBalanced(false);
			return result;
		}
		Stack<Character> stack = new Stack<Character>();
		Set<Character> openBracketsSet = BracketsManager.getOpenBracketCharsSet();
		Set<Character> closeBracketsSet = BracketsManager.getCloseBracketCharsSet();

		for (int index = 0; index < expression.length(); index++) {

			char aChar = expression.charAt(index);

			if (openBracketsSet.contains(aChar)) {
				stack.push(aChar);
			} else if (closeBracketsSet.contains(aChar)) {
				Bracket bracketObj = BracketsManager.getBracket(aChar);

				Character openCharFromStack = stack.pop();

				if (openCharFromStack.equals(bracketObj.getOpenChar())) {

					// Match
					continue;
				} else {
					break;
				}

			} else {
				System.out.println("Invalid character encountered " + "during traversal.." + aChar);
				result.setBalanced(false);
				break;
			}
		}
		boolean empty = stack.isEmpty();

		if (empty) {
			result.setBalanced(true);
		} else {
			result.setBalanced(false);
		}

		return result;

	}

}
