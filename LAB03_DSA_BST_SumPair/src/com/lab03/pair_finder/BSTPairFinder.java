package com.lab03.pair_finder;

import java.util.LinkedHashSet;
import java.util.Set;

import com.lab03.pair_finder.bst.BinarySearchTree;
import com.lab03.pair_finder.bst.TreeNode;

import internal.Argument;
import internal.Log;

public class BSTPairFinder {

	private BinarySearchTree tree;
	private boolean found = false;

	public BSTPairFinder(BinarySearchTree tree) {

		this.tree = tree;
	}

	public void findPair(int sum) {

		Set<Integer> nodes = new LinkedHashSet<Integer>();

		findPairInternal("R", sum, tree.getRoot(), nodes);

		if (!found) {
			System.out.println("For the sum [" + sum + "], Matching nodes NOT found");
		}
	}

	private boolean findPairInternal(String indicator, int sum, TreeNode aNode, Set<Integer> nodes) {

		if (aNode == null) {
			return false;
		}

		Log.log("findPairInternal", "OperationType [Recursion & Stack Push] %s %s",
				new Argument[] { new Argument("Indicator", indicator), new Argument("Node", aNode) });

		found = findPairInternal("L", sum, aNode.getLeftNode(), nodes);
		if (found) {
			return true;
		}

		int difference = sum - aNode.getData();

		if (nodes.contains(difference)) {

			found = true;
			System.out.println(
					"For the sum [" + sum + "], Matching nodes -> [" + aNode.getData() + ", " + difference + "]");
			return found;
		} else {

			nodes.add(aNode.getData());
		}

		Log.log("findPairInternal", "OperationType (Recursion & Stack Pop) %s %s %s %s",
				new Argument[] { new Argument("Indicator", indicator), new Argument("Node", aNode),
						new Argument("Node-Set", nodes), new Argument("Difference", difference) });

		if (!found) {
			return findPairInternal("R", sum, aNode.getRightNode(), nodes);
		} else {
			return true;
		}
	}

}