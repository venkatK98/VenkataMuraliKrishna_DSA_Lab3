package com.lab03.pair_finder;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lab03.pair_finder.bst.BinarySearchTree;
import com.lab03.pair_finder.bst.TestDataUtils;

import internal.Log;

public class BSTPairFinderTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find a Pair of Matching Nodes");

		int max = 1;

		for (int i = 0; i < max; i++) {
			try {
				test(sc.nextInt());
				// test(130);
				// test(190);
				// test(250);// invalid DATA
				max++;
				System.out.println("Enter a New Number / Press any Char to Cancel");

			} catch (InputMismatchException e) {

				System.out.println("\nYou must enter an integer value. Please try again\n");

			}

		}

		sc.close();

	}

	private static void test(int sum) {

		Log.ENABLE = true;

		BinarySearchTree tree = TestDataUtils.sampleBST1();

		Log.ENABLE = true;

		BSTPairFinder finder = new BSTPairFinder(tree);

		finder.findPair(sum);

		System.out.println("-----------------------");

		Log.ENABLE = false;

	}
}
