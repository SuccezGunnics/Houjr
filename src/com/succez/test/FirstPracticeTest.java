package com.succez.test;

import java.io.File;

import org.junit.Test;

import com.succez.exception.MyException;
import com.succez.practice.FirstPractice;
import com.succez.practice.TNode;

public class FirstPracticeTest {

	@Test
	/**
	 * 将文件内容读入byte数组
	 */
	public void testFile2buf() {
		File file = new File("D:/test/text.txt");
		byte[] buf = null;
		try {
			buf = FirstPractice.file2buf(file);
		} catch (MyException e) {
			e.printStackTrace();
		}
		for (byte b : buf) {
			System.out.println(b);
		}
	}

	@Test
	public void testIntToHex() {
		int i = 15;
		assert (FirstPractice.intToHex(15).equalsIgnoreCase(Integer
				.toHexString(i))) : "错误";
		System.out.println("转换正确！");
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
		FirstPractice.treeLevel(a, -1);
	}

}
