package com.epam.Java8task;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class ListPalindromeTest extends TestCase {

	@Test
	public void test() {
		assertArrayEquals(new String[]{"eve","abeba","acca"}, ListPalindrome.listPalindromeStrings(Arrays.asList("apple","eve","abeba","acca")).toArray());
	}

}