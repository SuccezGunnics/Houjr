package com.succez.utils;

public class TNode {

	// 存放数据
	private String value;
	// 左子节点
	private TNode left;
	// 右子节点
	private TNode right;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}

}