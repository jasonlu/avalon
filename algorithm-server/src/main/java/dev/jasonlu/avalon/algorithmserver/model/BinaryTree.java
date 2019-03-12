package dev.jasonlu.avalon.algorithmserver.model;

import java.util.HashSet;
import java.util.Set;

public class BinaryTree<T> {
    public class Node<T> {
        public Node left;
        public Node right;
        public Node parent;
        public T data;

        public Node(T data) {
            this.data = data;
        }
    }

    public Node<T> root;
    public Set<Node<T>> nodes;
    private long size = 0;

    public long getSize() {
        return size;
    }

    public long getHeight() {
        return height;
    }

    private long height = 0;

    /**
     * Takes an array and make a binary tree out of it.
     * The array notation is BFS traversal left to right of the tree.
     * e.g.
     *  [0, 1, 2, null, 4] makes a tree like this:
     *
     *          0
     *        /   \
     *       1     2
     *         \
     *          4
     * e.g.
     *  [0, 1, null, 3, 4, 5] makes a tree like this:
     *
     *          0
     *        /
     *       1
     *     /   \
     *    3     4
     *  (5 is missing because it has no parent (index: 2 => null) )
     *
     * This method also calculate the height of the tree.
     * Because of the input is a BFS notation array, the height is always minimal height.
     *
     *
     * @param arr the input array
     */
    public BinaryTree(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Input data is invalid.");
        }
        this.nodes = new HashSet<>();
        this.root = this.makeTree(arr, null, 0);
        this.size = arr.length;
        this.height = (long)Math.floor(Math.log(this.size)/Math.log(2));
    }

    private Node makeTree(T[] arr, Node root, int i) {
        // Base case for recursion
        if (i < arr.length && arr[i] != null) {
            Node temp = new Node(arr[i]);
            temp.parent = root;
            nodes.add(temp);
            root = temp;

            // insert left child
            root.left = makeTree(arr, root.left, 2 * i + 1);

            // insert right child
            root.right = makeTree(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void inOrder() {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}
