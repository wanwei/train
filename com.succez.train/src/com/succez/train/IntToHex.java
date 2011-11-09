package com.succez.train;

public final class IntToHex {
	/**
	 * 将整数转换为16进制的字符串
	 * 
	 * @param i
	 * @return
	 */
	public static String intToHex(int i) {
		// 建立一个char数组用来保存返回的16进制字符串，整数8位就够了		
		char[] buf = new char[8];
		int charPos = 8;
		while (i != 0) {
			buf[--charPos] = digits[i & 15];
			i = i / 16;
		}
		return new String(buf, charPos, 8 - charPos);
	}

	// 该数组是为了加快从整型转char的效率
	final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', 'a', 'b', 'c', 'd', 'e', 'f' };
}