package com.epam.Java8task;

import java.util.*;
import java.util.function.*;

public class stringCheckForA {

static Predicate<String> isStringValid= s -> s.startsWith("a") && s.length()==3;

static List<String> getListOfValid(List<String> a) {
	List<String> ans=new ArrayList<>();
	a.stream().forEach(x-> {
		if(isStringValid.test(x))
		ans.add(x);
		});
	return ans;
}

}