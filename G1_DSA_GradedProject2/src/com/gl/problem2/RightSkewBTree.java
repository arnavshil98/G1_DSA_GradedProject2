package com.gl.problem2;

public class RightSkewBTree extends BinaryTreeNode {

	public static Node insertRightSkewTree(Node root, int i) {
		Node curNode = new Node(i);

		if (root == null) {
			return curNode;
		} else {
			root.right = insertRightSkewTree(root.right, i);

		}

		return root;
	}

	
}
