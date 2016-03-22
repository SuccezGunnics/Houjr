package com.succez.test;

import java.io.File;

import org.junit.Test;

import com.succez.practice.Buf2Array;
import com.succez.utils.Result;

public class Buf2ArrayTest {

	@Test
	public void testFile2bufByFIS() {
		File file = new File("D:\\test\\test5.iso");
		Result result = Buf2Array.file2bufByFIS(file);
		System.out.println(result.isSuccessful());
		System.out.println(result.getExceptionType());
	}

}
