package com.lab03.pair_finder.bst;

public class TestDataUtils {

	public static BinarySearchTree sampleBST1() {

		BinarySearchTree tree = new BinarySearchTree();

		int arr[] = { 40, 20, 60, 10, 30, 70 };

		for (int i = 0; i <= arr.length - 1; i++) {
			tree.insert(arr[i]);
		}

		return tree;
	}
}
