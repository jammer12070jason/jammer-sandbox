package com.jsr.tutorials.data.algorithm;

import org.junit.Before;
import org.junit.Test;

public class EuclidTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
			System.out.println("Running Euclid (for 461952, 116298, expecting 18)");
			org.junit.Assert.assertEquals(18, Euclid.greatestCommonDenominator(461952, 116298));
	}
}
