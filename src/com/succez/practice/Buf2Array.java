package com.succez.practice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.succez.utils.CommonUtils;
import com.succez.utils.Result;

/**
 * �������ַ���ʵ�ֽ��ļ���Ϣ����byte����
 * 
 * @author ���
 *
 */

public class Buf2Array {
	
	/**
	 * ʹ��FileInputStream ÿ�ζ�ȡ4096�ֽڣ�ʣ�೤��С��4096�����ȡʣ�೤�ȡ�
	 * 
	 * @param fobj Դ�ļ�����С����С��integer.MaxValue
	 * @return  ����result�������е�һ�������Ƕ��ļ������飬�ڶ��������Ƕ�ȡ�ļ�ʱ��
	 * @throws IOException
	 */
	public static Result file2bufByFIS(File fobj) throws IOException {
		if (!CommonUtils.isLegalFile(fobj)) {
			return null;
		}
		byte[] buf = null;
		InputStream in = null;
		long start = System.currentTimeMillis();
		try {
			in = new FileInputStream(fobj);
			int fileLength = (int) fobj.length();
			buf = new byte[fileLength];
			int offset = 0;
			int length = fileLength >= 4096 ? 4096 : fileLength;
			while (offset < fileLength && (in.read(buf, offset, length) >= 0)) {
				offset += 4096;
				if (fileLength - offset < 4096) {
					length = fileLength - offset;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new IOException();
		} finally {
			CommonUtils.free(in);
		}
		long end = System.currentTimeMillis();
		return new Result(buf, end - start);
	}

	/**
	 * ����ͨ��FileInputStream����in�����ļ���
	 * Ȼ��in��ȡ���ֽ���д��ByteArrayOutputStream����out��
	 * ��outת��Ϊ�ֽ�����
	 * @param fobj Դ�ļ�����С����С��integer.MaxValue
	 * @return ����result�������е�һ�������Ƕ��ļ������飬�ڶ��������Ƕ�ȡ�ļ�ʱ��
	 * @throws IOException
	 */
	public static Result file2bufByBAOS(File fobj) throws IOException {
		if (!CommonUtils.isLegalFile(fobj)) {
			return null;
		}
		InputStream in = null;
		ByteArrayOutputStream out = null;
		byte[] buf = null;
		long start = System.currentTimeMillis();
		try {
			in = new FileInputStream(fobj);
			out = new ByteArrayOutputStream(4096);
			byte[] b = new byte[(int) fobj.length()];
			int n;
			while ((n = in.read(b)) != -1) {
				out.write(b, 0, n);
			}
			buf = out.toByteArray();
		} catch (IOException e) {
		} finally {
			CommonUtils.free(out);
			CommonUtils.free(in);
		}
		long end = System.currentTimeMillis();
		return new Result(buf, end - start);
	}

}
