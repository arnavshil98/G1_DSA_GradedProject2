package com.gl.dsap2;

import java.util.ArrayList;

public class AscRightSkewBTree {

	public static class Node {

		int key;
		Node left, right;

		public Node(int x) {
			this.key = x;
		}
	}

	public static int heightOfNode(Node node) {
		if (node == null)
			return 0;
		return Math.max(heightOfNode(node.left), heightOfNode(node.right)) + 1;

	}

	public static int balanceofNode(Node node) {
		if (node == null)
			return 0;
		int hl = heightOfNode(node.left);
		int hr = heightOfNode(node.right);
		return hl - hr;
	}

	static ArrayList<Integer> arrList = new ArrayList<>();

	public void inorderTraversal(Node node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		arrList.add(node.key);
		System.out.println("balance of node: " + node.key + " is " + balanceofNode(node));
		inorderTraversal(node.right);

	}

	public static Node insertRightSkewTree(Node root, int i) {
		Node curNode = new Node(i);

		if (root == null) {
			return curNode;
		} else {
			root.right = insertRightSkewTree(root.right, i);

		}

		return root;
	}

	public static void main(String[] args) {
		AscRightSkewBTree obj = new AscRightSkewBTree();

		Node root = null;
		root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		System.out.println("inorder traversal of balanced BST: ");
		obj.inorderTraversal(root);
		root = null;

		for (Integer i : arrList) {
			if (root == null) {
				root = insertRightSkewTree(root, i);

			} else {
				root = insertRightSkewTree(root, i);

			}
		}

		System.out.println("inorder traversal of skewed BST: ");
		obj.inorderTraversal(root);
	}

}
