package com.succez.train;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import junit.framework.Assert;

import org.junit.Test;

import com.succez.train.FileToBuf;

public class TestFileTobuf {
	@Test
	public void testFileToBuf() throws IOException {
		//测试读取文件，文件放在源代码目录里
		URL res = TestFileTobuf.class.getResource("file2buf.txt");
		String str = res.getFile();
		File f = new File(str);
		byte[] bs = FileToBuf.file2Buf(f);
		Assert.assertEquals(4, bs.length);
		Assert.assertEquals("test", new String(bs));

		//测试文件无法读取的情况
		Assert.assertNull(null);
		f = new File("ss");
		Assert.assertNull(FileToBuf.file2Buf(f));
	}
}