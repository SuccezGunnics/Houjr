package com.succez.test;

import org.junit.Assert;

import org.junit.Test;

import com.succez.practice.TreeLevel;
import com.succez.utils.TNode;

public class TreeLevelTest {
	
	@Test
	/**
	 * 生成一个二叉树，前序输出第n曾深度的节点
	 */
	public void testTreeLevel() {
		TreeLevel tree = new TreeLevel();
		TNode a = new TNode();
		TNode b = new TNode();
		TNode c = new TNode();
		TNode d = new TNode();
		TNode e = new TNode();
		TNode f = new TNode();
		TNode g = new TNode();
		a.setValue("a");
		b.setValue("b");
		c.setValue("c");
		d.setValue("d");
		e.setValue("e");
		f.setValue("f");
		g.setValue("g");
		a.setLeft(b);
		a.setRight(d);
		b.setLeft(g);
		b.setRight(e);
		d.setLeft(c);
		d.setRight(f);
		Assert.assertTrue(tree.getNodesVal(3, a).equals("g--e--c--f--"));
		Assert.assertTrue(tree.getNodesVal(2, a).equals("b--d--"));
		Assert.assertTrue(tree.getNodesVal(1, a).equals("a--"));
		Assert.assertTrue(tree.getNodesVal(0, a).equals(""));
		Assert.assertTrue(tree.getNodesVal(0, a).equals(""));
		Assert.assertTrue(tree.getNodesVal(4, a).equals(""));
	}

}
