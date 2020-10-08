package BinarySearchTree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void adding3NodesToBSTShouldPassTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();

		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);

		Integer size = binaryTree.getSize();

		boolean result = size.equals(3);
		Assert.assertTrue(result);
	}

	@Test
	public void addingAllNodesToBSTShouldPassTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		Integer[] nodes = { 56, 30, 22, 40, 11, 3, 16, 70, 60, 95, 65, 63, 67 };
		for (Integer n : nodes) {
			binaryTree.add(n);
		}

		Integer size = binaryTree.getSize();

		boolean result = size.equals(13);
		Assert.assertTrue(result);
	}

	@Test
	public void searchingaNodeInBSTShouldPassTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		Integer[] nodes = { 56, 30, 22, 40, 11, 3, 16, 70, 60, 95, 65, 63, 67 };
		for (Integer n : nodes) {
			binaryTree.add(n);
		}

		Integer size = binaryTree.getSize();

		boolean searchResult = binaryTree.searchNode(63);
		boolean result = size.equals(13);
		Assert.assertTrue(result && searchResult);
	}

}
