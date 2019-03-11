package dev.jasonlu.avalon.algorithmserver.algorithms;

import dev.jasonlu.avalon.algorithmserver.model.BinaryTree;

public class BinaryTreeAlgorithms<T extends Number> {

    BinaryTree<T> tree;
    long maxSum, maxLen;

    public BinaryTreeAlgorithms(BinaryTree<T> tree) {
        this.tree = tree;
    }

    public Long sumOfLongestPathRootToLeafOfInteger() {
        if (tree.root == null) {
            throw new RuntimeException("Invalid input, the tree is null");
        }

        maxSum = Integer.MIN_VALUE;
        maxLen = 0;
        doSumOfLongestPathRootToLeafOfInteger(tree.root, 0, 0);
        return maxSum;
    }

    private void doSumOfLongestPathRootToLeafOfInteger(BinaryTree.Node root,
                                                         long sum,
                                                         long len) {
        // Exit condition
        if (root == null) {
            // update maximum length and maximum sum
            // according to the given conditions
            if (maxLen < len) {
                maxLen = len;
                maxSum = sum;
            } else if (maxLen == len && maxSum < sum)
                maxSum = sum;
            return;
        }


        // do left
        doSumOfLongestPathRootToLeafOfInteger(root.left,
                sum + (Integer)root.data,
                len + 1);
        // do right
        doSumOfLongestPathRootToLeafOfInteger(root.right,
                sum + (Integer)root.data,
                len + 1);
    }
}
