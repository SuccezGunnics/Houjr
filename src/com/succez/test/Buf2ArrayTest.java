package com.succez.test;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.succez.practice.Buf2Array;

public class Buf2ArrayTest {

	@Test
	public void testFile2bufByFIS() {
		File file = new File("D:\\test\\test4.exe");
		try {
			long time1 = Buf2Array.file2bufByFIS(file).getRunTime();
			System.out.println(time1);
			long time2 = Buf2Array.file2bufByBAOS(file).getRunTime();
			System.out.println(time2);
			Integer.toHexString((int) time1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
