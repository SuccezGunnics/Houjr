package com.succez.test;

import java.io.File;

import org.junit.Test;

import day1.FirstPractice;
import day1.TNode;

public class FirstPracticeTest {

	@Test
	/**
	 * 将文件内容读入byte数组
	 */
	public void testFile2buf() {
		File file = new File("D:/test/text.txt");
		byte[] buf = FirstPractice.file2buf(file);
		for (byte b : buf) {
			System.out.println(b);
		}
	}

	@Test
	public void testIntToHex() {
		System.out.println(FirstPractice.intToHex(1023));
	}

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
		FirstPractice.treeLevel(a, 3);
	}

}
