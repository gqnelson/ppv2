package ppv2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ppv2.BinarySearchTree.Node;

public class BinarySearchTreeTest {

    @Test
    public void testIsBST() {
        BinarySearchTree bst = new BinarySearchTree();
        assertTrue(bst.isBST(new Node(1)));
        assertTrue(bst.isBST(new Node(3, new Node(2), new Node(5))));
        assertTrue(bst.isBST(new Node(3, new Node(2, new Node(1), null), new Node(5))));

        assertFalse(bst.isBST(new Node(20, new Node(10), new Node(30, new Node(5), new Node(40)))));
        assertFalse(bst.isBST(new Node(3, new Node(2, new Node(1), new Node(4)), new Node(5))));
    }
}