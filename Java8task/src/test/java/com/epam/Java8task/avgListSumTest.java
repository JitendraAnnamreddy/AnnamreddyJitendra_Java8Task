package com.epam.Java8task;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class avgListSumTest extends TestCase {

	
	@Test
	public void test1() {
		Assert.assertEquals(10,(int)AverageIntList.avgSum.apply(Arrays.asList(10,10,10)));
	}
	
}