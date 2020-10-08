package BinarySearchTree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void Adding3NodesToBSTShouldPassTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();

		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);

		Integer size = binaryTree.getSize();

		boolean result = size.equals(3);
		Assert.assertTrue(result);
	}

}
