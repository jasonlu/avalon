package dev.jasonlu.avalon.algorithmserver.model;

public class BinaryTreeResponse {
    private Integer[] intData;
    private long height, size, sumOfLongestPathRootToLeafOfInteger;
    private int[] path;

    public BinaryTree<Integer> getTree() {
        return tree;
    }

    public void setTree(BinaryTree<Integer> tree) {
        this.tree = tree;
    }

    private BinaryTree<Integer> tree;

    public Integer[] getIntData() {
        return intData;
    }

    public void setIntData(Integer[] intData) {
        this.intData = intData;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int[] getPath() {
        return path;
    }

    public void setPath(int[] path) {
        this.path = path;
    }

    public long getSumOfLongestPathRootToLeafOfInteger() {
        return sumOfLongestPathRootToLeafOfInteger;
    }

    public void setSumOfLongestPathRootToLeafOfInteger(long sumOfLongestPathRootToLeafOfInteger) {
        this.sumOfLongestPathRootToLeafOfInteger = sumOfLongestPathRootToLeafOfInteger;
    }
}
