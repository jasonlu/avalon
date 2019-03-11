package dev.jasonlu.avalon.algorithmserver.model;

import org.junit.Test;


import static org.junit.Assert.*;

public class BinaryTreeTest {

    BinaryTree<Integer> tree;

    @Test
    public void inOrder() {
        Integer[] arr = new Integer[] {0, 1, 2, 3, null, 5, 6, null, 7};
        this.tree = new BinaryTree<>(arr);
        this.tree.inOrder();
    }
}
