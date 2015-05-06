package com.test.algo;
/**
 * Represents Single node in a tree
 * 
 * @author Pulkit Chandra
 *
 */
public class TreeNode {
	
	private final String data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	public TreeNode(String data, TreeNode leftChild, TreeNode rightChild) {
		super();
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public TreeNode(String data) {
		super();
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public String getData() {
		return data;
	}

}
