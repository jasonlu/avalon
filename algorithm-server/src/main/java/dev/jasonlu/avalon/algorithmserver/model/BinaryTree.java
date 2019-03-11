package dev.jasonlu.avalon.algorithmserver.model;

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

    public BinaryTree(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Input data is invalid.");
        }
        this.root = this.makeTree(arr, null, 0);
    }

    private Node makeTree(T[] arr, Node root, int i) {
        // Base case for recursion
        if (i < arr.length && arr[i] != null) {
            Node temp = new Node(arr[i]);
            temp.parent = root;
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
