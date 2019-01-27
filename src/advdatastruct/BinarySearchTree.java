//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree {
	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(Comparable val) {
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null) {
			tree = new TreeNode(val);
			return tree;
		}

		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);

		if (dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if (dirTest > 0)
			tree.setRight(add(val, tree.getRight()));

		return tree;
	}

	public void inOrder() {
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	// add preOrder, postOrder, and revOrder
	public void preOrder() {
		preOrder(root);
		out.println("\n\n");
	}

	private void preOrder(TreeNode tree) {
		if (tree != null) {
			out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder() {
		postOrder(root);
		out.println("\n\n");
	}

	private void postOrder(TreeNode tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			out.print(tree.getValue() + " ");
		}
	}

	public void revOrder() {
		revOrder(root);
		System.out.println("\n\n");
	}

	private void revOrder(TreeNode tree) {
		if (tree != null) {
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}

	public int getNumLevels() {
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree) {
		if (tree == null)
			return 0;
		else if (getNumLevels(tree.getLeft()) > getNumLevels(tree.getRight()))
			return 1 + getNumLevels(tree.getLeft());
		else
			return 1 + getNumLevels(tree.getRight());
	}

	// add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull
	public int getNumNodes() {
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree) {
		if (tree == null) {
			return 0;
		} else if (tree.getLeft() == null && tree.getRight() == null) {
			return 1;
		} else {
			return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
		}
	}

	public boolean isFull() {
		return isFull(root);
	}

	private boolean isFull(TreeNode tree) {
		if (tree == null) {
			return true;
		} else if (tree.getLeft() == null && tree.getRight() != null) {
			return false;
		} else if (tree.getRight() == null && tree.getLeft() != null) {
			return false;
		} else {
			return isFull(tree.getRight()) && isFull(tree.getLeft());
		}
	}


	public int getNumLeaves() {
		return getNumLeaves(root);
	}

	private int getNumLeaves(TreeNode tree) {
		if (tree == null) {
			return 0;
		} else if (tree.getLeft() == null && tree.getRight() == null) {
			return 1;
		} else {
			return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
		}
	}

	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(TreeNode tree) {
		if (tree == null) {
			return 0;
		} else {
			int leftH = getHeight(tree.getLeft());
			int rightH = getHeight(tree.getRight());

			return (leftH > rightH) ? (leftH + 1): (rightH + 1); 
		}
	}

	public int getWidth() {
		int maxWidth = 0;

		for (int i = 1; i < getHeight(); i++) {
			int width = getWidth(root, i);

			if (width > maxWidth) {
				maxWidth = width;
			}
		}
		return maxWidth;
	}

	private int getWidth(TreeNode tree, int level) {
		if (tree == null) {
			return 0;
		} else if (level == 1) {
			return 1;
		} else if (level > 1) {
			return getWidth(tree.getLeft(), level - 1) + getWidth(tree.getRight(), level - 1);
		}

		return 0;
	}



	

	// add extra credit options here - 10 points each

	// search

	// maxNode

	// minNode

	// level order

	// display like a tree

	// remove

	public String toString() {
		return "";
	}

	private String toString(TreeNode tree) {
		return "";
	}
}