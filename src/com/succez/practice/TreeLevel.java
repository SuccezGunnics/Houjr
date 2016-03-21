package com.succez.practice;

import com.succez.utils.TNode;

public class TreeLevel {
	
	private StringBuilder sBuilder = new StringBuilder();

	public  void treeLevel(TNode tree, int n) {
		int i = n;
		if (tree == null)
			return;
		if (i == 1)
			sBuilder.append(tree.getValue()+"--");
		treeLevel(tree.getLeft(), --i);
		i = n;
		treeLevel(tree.getRight(), --i);
	}
	
	public String getNodesVal(int n,TNode tree){
		 treeLevel(tree,n);
		String result = sBuilder.toString();
		sBuilder.setLength(0);
		return result;
	}

}
