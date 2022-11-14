package com.gl.problem2;

import com.gl.problem2.BinaryTreeNode.Node;

public class MainPortal {

	public static void main(String[] args) {
		RightSkewBTree obj = new RightSkewBTree();

		Node root = null;
		root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		System.out.println("lateral traversal of balanced BST: ");
		obj.inorderTraversal(root);
		obj.levelOrderTraversal(root);
		root = null;

		for (Integer i : obj.arrList) {
			if (root == null) {
				root = obj.insertRightSkewTree(root, i);

			} else {
				root = obj.insertRightSkewTree(root, i);

			}
		}
		System.out.println("");
		System.out.println("lateral traversal of skewed BST: ");
		obj.levelOrderTraversal(root);


	}

}
