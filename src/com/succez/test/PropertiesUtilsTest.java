package com.succez.test;


import org.junit.Assert;
import org.junit.Test;

import com.succez.utils.PropertiesUtils;

public class PropertiesUtilsTest {

	@Test
	public void testGetConfigValue() {
		
		PropertiesUtils instance = PropertiesUtils.getInstance();
		String port1 = instance.getConfigValue("default.port");
		String port2 = instance.getConfigValue("default.port1");
		Assert.assertTrue(port1.equals("2016"));
		Assert.assertNull(port2);
	}

}
