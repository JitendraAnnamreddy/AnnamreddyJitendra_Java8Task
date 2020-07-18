package com.epam.Java8task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class ListPalindrome {

	public static List<String> listPalindromeStrings(List<String> input){
		Predicate<String> check=Palindrome::isStringValid;
		List<String> ans=new ArrayList<>();
		input.stream().forEach(x->{
			if(check.test(x)) {
				ans.add(x);
			}
		});
		return ans;
	}
	
}
