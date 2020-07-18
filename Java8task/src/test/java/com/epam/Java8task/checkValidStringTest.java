package com.epam.Java8task;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class checkValidStringTest extends TestCase {

	@Test
	public void test() {
		assertArrayEquals(new String[]{"abc","acd"}, stringCheckForA.getListOfValid(Arrays.asList("abc","acd","audi")).toArray());
	}

}