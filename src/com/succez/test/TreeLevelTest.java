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
		TreeLevel level = new TreeLevel();
		Assert.assertEquals("g--e--c--f--", level.getNodesVal(3, a));
		//Assert.assertEquals("g--e--c--f--1", level.getNodesVal(3, a));
		Assert.assertEquals("b--d--", level.getNodesVal(2, a));
		//Assert.assertEquals("b--d--1", level.getNodesVal(2, a));
		Assert.assertEquals("a--", level.getNodesVal(1, a));
		Assert.assertEquals("", level.getNodesVal(0, a));
		Assert.assertEquals("", level.getNodesVal(5, a));
		Assert.assertEquals("", level.getNodesVal(-1, a));
		Assert.assertEquals("a", level.getNodesVal(5, a));

		// Thread[] threads = new Thread[1000];
		// for(int i=0;i<threads.length;i++){
		// threads[i] = new Thread(new Runnable(){
		// public void run(){
		// TreeLevel level = new TreeLevel();
		// //System.out.println("the result is :"+ level.getNodesVal(3, a));
		// System.out.println("the result is :"+
		// level.getNodesValWhithoutThreadSafe(3, a));
		// }
		// });
		// threads[i].start();
		// }
		// for (int i=0; i<threads.length; i++){
		// try {
		// threads[i].join(); //等待所有线程运行结束
		// } catch (InterruptedException e1) {
		// // ignore
		// }
		// }
	}

}
