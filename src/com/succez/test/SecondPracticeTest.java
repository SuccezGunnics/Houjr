package com.succez.test;

import org.junit.Test;

import com.succez.exception.MyException;
import com.succez.practice.SecondPractive;

public class SecondPracticeTest {

	@Test
	public void testDownload() {
		// �人��ѧ�������ϵͳ��֤��
		String url = "http://210.42.121.241/servlet/GenImg";
		// ���浽D����testĿ¼�£��ļ���Ϊϵͳʱ�䡣
		try {
			SecondPractive.download(url, "D:\\test\\" + System.currentTimeMillis()
					+ ".jpg");
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
