package com.succez.practice;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.succez.utils.CommonUtils;
import com.succez.utils.Result;

/**
 * 定义两种方法实现将文件信息读入byte数组
 * 
 * @author 侯景瑞
 *
 */

public class Buf2Array {

	/**
	 * 使用FileInputStream 每次读取4096字节，剩余长度小于4096，则读取剩余长度。
	 * 
	 * @param fobj
	 *            源文件，大小必须小于integer.MaxValue
	 * @return 返回result对象，其中第一个参数是读文件的数组，第二个参数是读取文件时间
	 * @throws IOException
	 */
	public static Result file2bufByFIS(File fobj) {
		boolean isSuccessful = true;
		long runTime = 0;
		String exceptionType =null;
		byte[] buf = null;
		InputStream in = null;
		try {
			long start = System.currentTimeMillis();
			in = new FileInputStream(fobj);
			int fileLength = (int) fobj.length();
			buf = new byte[fileLength];
			int offset = 0;
			int readCount = 0;
			int length = fileLength > 4096 ? 4096 : fileLength;
			while (offset < fileLength
					&& (readCount = in.read(buf, offset, length)) >= 0) {
				System.out.println(readCount);
				offset += readCount;
			}
		runTime = System.currentTimeMillis()-start;
		} catch (Exception e) {
			exceptionType = e.getClass().getName();
			System.out.println("执行出错：出现"+exceptionType);
			isSuccessful = false;
		} finally {
			CommonUtils.free(in);
		}
	
		return new Result(buf, runTime,isSuccessful,exceptionType);
	}

	/**
	 * 首先通过FileInputStream对象in加载文件， 然后将in读取的字节流写入ByteArrayOutputStream对象out中
	 * 将out转换为字节数组
	 * 
	 * @param fobj
	 *            源文件，大小必须小于integer.MaxValue
	 * @return 返回result对象，其中第一个参数是读文件的数组，第二个参数是读取文件时间
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
