package BinarySearchTree;

public class BinaryTree<K extends Comparable> {
	BinaryTreeNode<K> rootNode;

	public void add(K key) {
		this.rootNode = addRecursive(rootNode, key);
	}

	private BinaryTreeNode<K> addRecursive(BinaryTreeNode<K> currentNode, K key) {
		if (currentNode == null) {
			BinaryTreeNode<K> newTreeNode = new BinaryTreeNode<K>(key);
			return newTreeNode;
		}
		if (currentNode.getKey().compareTo(key) < 0) {
			currentNode.setRight(addRecursive(currentNode.right, key));
		} else if (currentNode.getKey().compareTo(key) > 0) {
			currentNode.setLeft(addRecursive(currentNode.left, key));
		}
		return currentNode;
	}

	public Integer getSize() {
		return getSizeRecursive(rootNode);
	}

	public Integer getSizeRecursive(BinaryTreeNode<K> currentNode) {
		if (currentNode == null)
			return 0;
		else {
			return 1 + this.getSizeRecursive(currentNode.left) + this.getSizeRecursive(currentNode.right);
		}

	}

	public boolean searchNode(K key) {
		BinaryTreeNode<K> tempNode = searchRecursive(rootNode, key);
		return tempNode == null ? false : true;
	}

	public BinaryTreeNode<K> searchRecursive(BinaryTreeNode<K> currentNode, K key) {
		if (currentNode == null)
			return null;
		else if (currentNode.getKey().compareTo(key) == 0)
			return currentNode;
		else if (currentNode.getKey().compareTo(key) < 0)
			return searchRecursive(currentNode.right, key);
		else
			return searchRecursive(currentNode.left, key);

	}

}
