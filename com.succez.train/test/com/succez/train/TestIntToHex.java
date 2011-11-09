package com.succez.train;

import junit.framework.Assert;

import org.junit.Test;

public class TestIntToHex {
	@Test
	public void testIntToHex() {
		int i = 199999;
		Assert.assertEquals("30d3f", IntToHex.intToHex(i));

		//边界测试 测最大最小整数
		i = Integer.MAX_VALUE;
		Assert.assertEquals("7fffffff", IntToHex.intToHex(i));
		i = Integer.MIN_VALUE;
		Assert.assertEquals("80000000", IntToHex.intToHex(i));		
	}
}
