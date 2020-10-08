package BinarySearchTree;

public class BinaryTreeNode<K extends Comparable> {
	K key;
	BinaryTreeNode<K> left;
	BinaryTreeNode<K> right;

	public BinaryTreeNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public BinaryTreeNode<K> getLeft() {
		return this.left;
	}

	public void setLeft(BinaryTreeNode<K> left) {
		this.left = left;
	}

	public BinaryTreeNode<K> getRight() {
		return this.right;
	}

	public void setRight(BinaryTreeNode<K> right) {
		this.right = right;
	}
}
