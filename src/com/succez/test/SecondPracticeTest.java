package com.succez.test;

import org.junit.Test;

import day1.SecondPractive;

public class SecondPracticeTest {

	@Test
	public void testDownload() {
		// 武汉大学教务管理系统验证码
		String url = "http://210.42.121.241/servlet/GenImg";
		// 保存到D盘下test目录下，文件名为系统时间。
		SecondPractive.download(url, "D:\\test\\" + System.currentTimeMillis()
				+ ".jpg");
	}

}
