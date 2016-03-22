package com.succez.practice;

import com.succez.utils.TNode;

public class TreeLevel {

	private StringBuilder sBuilder = new StringBuilder();

	private void treeLevel(TNode tree, int n) {
		int i = n;
		if (tree == null)
			return;
		if (i == 1)
			sBuilder.append(tree.getValue() + "--");
		treeLevel(tree.getLeft(), --i);
		i = n;
		treeLevel(tree.getRight(), --i);
	}

	public synchronized String getNodesVal(int n, TNode tree) {
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		if (sBuilder.length() != 0) {
			sBuilder.setLength(0);
		}
		treeLevel(tree, n);
		String result = sBuilder.toString();
		sBuilder.setLength(0);
		return result;
	}
	
	public  String getNodesValWhithoutThreadSafe(int n, TNode tree) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (sBuilder.length() != 0) {
			sBuilder.setLength(0);
		}
		treeLevel(tree, n);
		String result = sBuilder.toString();
		sBuilder.setLength(0);
		return result;
	}
	
	

}
