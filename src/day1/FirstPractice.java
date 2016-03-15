package day1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FirstPractice {

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
	 */
	public static byte[] file2buf(File fobj) {
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
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
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
		String s = "0123456789abcdef ";
		StringBuffer sb = new StringBuffer();
		for (@SuppressWarnings("unused")
		int j = 0; i >= 16; j++) {
			int a = i % 16;
			i /= 16;
			sb.append(s.charAt(a));
		}
		sb.append(s.charAt(i));
		return sb.reverse().toString();

	}

}
