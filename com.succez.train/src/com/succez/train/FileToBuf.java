package com.succez.train;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class FileToBuf {

	/**
	 * 将文件内容转换成byte数组返回,如果文件不存在或者读入错误返回null
	 * 
	 * @param fobj
	 * @return
	 */
	public static byte[] file2Buf(File fobj) {
		if (fobj == null || !fobj.exists())
			return null;
		//test git
		long len = fobj.length();
		if (len > Integer.MAX_VALUE)
			return null;
		byte[] b = new byte[(int) len];
		try {
			FileInputStream is = new FileInputStream(fobj);
			try {
				is.read(b);
			} finally {
				is.close();
			}
			return b;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
