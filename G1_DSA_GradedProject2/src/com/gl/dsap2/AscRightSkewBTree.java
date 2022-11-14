package com.gl.dsap2;

public class AscRightSkewBTree {

	public static class Node {

		int key;
		Node left, right;

		public Node(int x) {
			this.key = x;
		}
	}

	public Node rightRotation(Node y) {
		Node x = y.left;
		Node t2 = x.right;
		// right rotation
		x.right = y;
		y.left = t2;
		return x;
	}

	public Node leftRotation(Node x) {
		Node y = x.right;
		Node t2 = y.left;
		// left rotation
		y.left = x;
		x.right = t2;
		return y;
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

	public Node insertElementAvl(Node root, int x) {
		/*
		 * always start from the root node. and will return updated tree as a root.
		 * containing all the references.
		 */
		// create node
		if (root == null) {
			return (new Node(x));
		}
		if (x < root.key)
			root.left = insertElementAvl(root.left, x);
		else if (x > root.key)
			root.right = insertElementAvl(root.right, x);
		else // Duplicate keys not allowed
			return root;

		System.out.println("-----------------------------------");
		int height = heightOfNode(root);
		System.out.println();
		System.out.println("height of node: " + height);
		int balance = balanceofNode(root);
		System.out.println("balance: " + balance);
		if (balance < -1 && x > root.right.key) {
			// left rotation
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Left Rotation");
			return leftRotation(root);
		} else if (balance > 1 && x < root.left.key) {
			// right rotation
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Right Rotation");
			return rightRotation(root);
		} else if (balance > 1 && x > root.left.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing left Rotation");
			root.left = leftRotation(root.left);
			System.out.println("next, performing Right Rotation");
			return rightRotation(root);
		} else if (balance < -1 && x < root.right.key) {
			System.out.println("Value inserted successfully!!! and the tree is unbalanced");
			System.out.println("Hence, performing Right Rotation");
			root.right = rightRotation(root.right);
			System.out.println("next, performing left Rotation");
			return leftRotation(root);
		}

		return root;
	}

	public void inorderTraversal(Node node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		System.out.println("balance of node: " + node.key + " is " + balanceofNode(node));
		inorderTraversal(node.right);

	}

	public static void main(String[] args) {
		AscRightSkewBTree obj = new AscRightSkewBTree();
		Node root = null;
		int[] arr = { 50, 30, 60, 10, 55 }; // BST
		for (int i : arr) {
			if (root == null) {
				root = obj.insertElementAvl(root, i);

			} else {
				root = obj.insertElementAvl(root, i);

			}
		}

		System.out.println("inorder traversal: ");
		obj.inorderTraversal(root);
	}

}
