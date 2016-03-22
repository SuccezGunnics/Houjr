package com.succez.test;

import org.junit.Assert;
import org.junit.Test;

import com.succez.practice.Int2Hex;

public class Int2HexTest {

	@Test
	public void testIntToHex() {
		
		Assert.assertEquals("7fffffff", Int2Hex.intToHex(Integer.MAX_VALUE));
		Assert.assertEquals("-80000000", Int2Hex.intToHex(Integer.MIN_VALUE));
		Assert.assertEquals("0", Int2Hex.intToHex(0));
		Assert.assertEquals("f", Int2Hex.intToHex(15));
		Assert.assertEquals("-f", Int2Hex.intToHex(-15));
		Assert.assertEquals("0", Int2Hex.intToHex(-0));
		Assert.assertEquals("1f", Int2Hex.intToHex(31));
		Assert.assertEquals("2", Int2Hex.intToHex(0));
		
	}

}
