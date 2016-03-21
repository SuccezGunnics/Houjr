package com.succez.practice;

public class Int2Hex {

	// 存放十六进制数字字符的数组。
	private static final char[] HEX = { '0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	/**
	 * 将十进制数字转换为16进制数字字符串 如果为负数，则在字符串前面添加“-”
	 * 
	 * @param number 整形数字
	 * @return
	 */
	public static String intToHex(int number) {
		if (number == Integer.MIN_VALUE) {
			return "-80000000";
		}
		int position = 0;
		char[] hexChars = new char[9];
		Boolean isNegative = false;
		if (number < 0) {
			isNegative = true;
			number = 0 - number;
		}
		while (number >= 16) {
			int a = number % 16;
			number /= 16;
			hexChars[position++] = HEX[a];
		}
		hexChars[position] = HEX[number];
		if (isNegative) {
			hexChars[++position] = '-';
		}
		StringBuilder strHex = new StringBuilder();
		for(int count = position;count>=0;count--){
			strHex.append(hexChars[count]);
		}
	return strHex.toString();
	}
}
