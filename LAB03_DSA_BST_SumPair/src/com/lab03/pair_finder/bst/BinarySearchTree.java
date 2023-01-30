package com.lab03.pair_finder.bst;

import internal.Argument;
import internal.Log;

public class BinarySearchTree {

	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(Integer value) {

		Log.lineSeparator();
		Log.log("INSERT", "Inserting value %s", new Argument[] { new Argument("Data", value) });
		root = insert(root, value);
	}

	private TreeNode insert(TreeNode rootNode, Integer value) {

		if (rootNode == null) {

			if (root == null) {

				Log.log("RootNode", "Labeling Node %s as root", new Argument[] { new Argument("Node", value) });
			}

			return newNode(value);
		} else if (value <= rootNode.getData()) {

			TreeNode newNode = insert(rootNode.getLeftNode(), value);

			Log.log("SetLeftNode", "For the node object, %s, the Left node property is updated with %s",

					new Argument[] { new Argument("Node", rootNode), new Argument("Node", newNode), });

			rootNode.setLeftNode(newNode);
			return rootNode;
		} else {

			TreeNode newNode = insert(rootNode.getRightNode(), value);

			Log.log("setRightNode", "For the node object, %s, the Right node property is updated with %s",

					new Argument[] { new Argument("Node", rootNode), new Argument("Node", newNode), });

			rootNode.setRightNode(newNode);
			return rootNode;
		}
	}

	private TreeNode newNode(Integer value) {

		TreeNode newNode = new TreeNode(value);
		return newNode;

	}

	public TreeNode getRoot() {
		return root;
	}
}
