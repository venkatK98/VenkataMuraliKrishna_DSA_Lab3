package com.lab03.pair_finder.bst;

import internal.Log;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		constructTreeWithLog1();
		constructTestWithoutLog2();

	}

	static void constructTreeWithLog1() {

		Log.ENABLE = true;

		BinarySearchTree sampleTree1 = TestDataUtils.sampleBST1();

		Log.ENABLE = false;
	}

	static void constructTestWithoutLog2() {

		Log.ENABLE = false;

		BinarySearchTree sampleTree1 = TestDataUtils.sampleBST1();
	}

}
