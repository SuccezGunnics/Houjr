package com.succez.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;


public class CommonUtils {
	
	private CommonUtils(){
		super();
	}
	
	public static boolean isLegalFile(File file) {
		if (!file.exists()) {
			System.out.println("路径错误！");
			return false;
		}
		if (file.isDirectory()) {
			System.out.println("文件不存在");
			return false;
		}
		if (file.length() > Integer.MAX_VALUE) {
			System.out.println("文件过大！");
		}
		return true;
	}

	public static void free(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
