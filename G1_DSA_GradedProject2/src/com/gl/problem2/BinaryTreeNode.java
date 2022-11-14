package com.gl.problem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNode {
	public static class Node {

		int key;
		Node left, right;

		public Node(int x) {
			this.key = x;
		}
	}

	static ArrayList<Integer> arrList = new ArrayList<>();

	public void inorderTraversal(Node node) {
		if (node == null)
			return;
		inorderTraversal(node.left);
		arrList.add(node.key);
		inorderTraversal(node.right);

	}

	static Queue<Node> queue = new LinkedList<Node>();

	public void levelOrderTraversal(Node node) {
		if (queue.isEmpty()) {
			queue.add(node);

		}
		while (!queue.isEmpty()) {

			node = queue.poll();

			if (node != null) {
				System.out.print(node.key+ " ");
				queue.add(node.left);
				queue.add(node.right);
			}
		}
	}
}
