package com.succez.practice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.succez.exception.MyException;

public class FirstPractice {
	
	public static final String HEX = "0123456789abcdef";

	/**
	 * Ҫ���ܷ�����tree�ĵ�n������нڵ�ֵ�� �������˳��Ϊ�����ҡ�
	 * 
	 * @param tree
	 * @param n
	 */
	public static void treeLevel(TNode tree, int n) {
		int i = n;
		if (tree == null)
			return;
		if (i == 1)
			System.out.print(tree.getValue() + "---");
		treeLevel(tree.getLeft(), --i);
		i = n;
		treeLevel(tree.getRight(), --i);
	}

	/**
	 * ���ļ�����ת����byte���鷵��, ����ļ������ڻ��߶�����󷵻�null
	 * 
	 * @param fobj
	 * @return
	 * @throws MyException 
	 */
	public static byte[] file2buf(File fobj) throws MyException {
		InputStream in = null;
		ByteArrayOutputStream out = null;
		byte[] buf = null;
		try {
			in = new FileInputStream(fobj);
			out = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while ((n = in.read(b)) != -1) {
				out.write(b, 0, n);
			}
			buf = out.toByteArray();
		} catch (IOException e) {
			throw new MyException("�ļ���ȡʧ�ܣ�");
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return buf;
	}

	/**
	 * ��int��ת��Ϊ16λ���ַ����ַ���
	 * 
	 * @param i
	 * @return
	 */
	public static String intToHex(int i) {
		StringBuffer sb = new StringBuffer();
		while(i>=16){
			int a = i % 16;
			i /= 16;
			sb.append(HEX.charAt(a));
		}
		sb.append(HEX.charAt(i));
		return sb.reverse().toString();

	}

}
