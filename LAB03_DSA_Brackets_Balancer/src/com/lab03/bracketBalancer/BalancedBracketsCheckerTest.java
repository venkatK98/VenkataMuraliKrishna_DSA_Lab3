package com.lab03.bracketBalancer;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {

		test("{[()]}");
		test("{}");
		test("[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("M[]W");
		test("<[]M");
		test("[<>");

	}

	private static void test(String brackets) {

		BalancedBracketsChecker checker = new BalancedBracketsChecker(brackets);
		Result result = checker.check();
		System.out.println(result);
	}
}
