package com.succez.test;

import org.junit.Assert;
import org.junit.Test;

import com.succez.practice.Int2Hex;

public class Int2HexTest {

	@Test
	public void testIntToHex() {
		Assert.assertTrue(Int2Hex.intToHex(Integer.MAX_VALUE).equals("7fffffff"));
		Assert.assertTrue(Int2Hex.intToHex(Integer.MIN_VALUE).equals("-80000000"));
		Assert.assertTrue(Int2Hex.intToHex(15).equals("f"));
		Assert.assertTrue(Int2Hex.intToHex(0).equals("0"));
		Assert.assertTrue(Int2Hex.intToHex(-15).equals("-f"));
		Assert.assertTrue(Int2Hex.intToHex(16).equals("10"));
		Assert.assertTrue(Int2Hex.intToHex(-16).equals("-10"));
	}

}
