package assignment_03_binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	BinarySearchTree<String, Object> tree;

	@Before
	public void setUp() throws Exception {
		tree = new BinarySearchTree<String, Object>();
		tree.insert("b");
		tree.insert("c");
		tree.insert("a");
	}

	@Test
	public void testFind() {
		assertEquals("a, b, c", tree.toString());
		Node<String, Object> a = tree.find("a");
		Node<String, Object> b = tree.find("b");
		Node<String, Object> c = tree.find("c");

		assertEquals(b, a.parent);
		assertEquals(b, c.parent);
		assertEquals(null, b.parent);
	}

	@Test
	public void findNonExistent() {
		Node<String, Object> d = tree.find("d");
		assertEquals(null, d);
	}

}
