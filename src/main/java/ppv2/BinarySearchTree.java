package ppv2;

public class BinarySearchTree {
    public boolean isBST(Node node) {
        return isBST(node, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public boolean isBST(Node node, int maxValue, int minValue) {
        if (node == null) return true;

        if (node.value >= maxValue || node.value <= minValue)
            return false;

        return isBST(node.leftChild, node.value, minValue) && isBST(node.rightChild, maxValue, node.value);
    }

    static protected class Node {
        int value;
        Node leftChild;
        Node rightChild;

        protected Node(int value) {
            this.value = value;
        }

        protected Node(int value, Node leftChild, Node rightChild) {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }
}
