package com.epam.Java8task;

import java.util.*;
import java.util.function.*;

public class AverageIntList {

	public static Function<List<Integer>,Integer> avgSum= a->{
		int sum=0;
		for(int i=0;i<a.size();i++) {
			sum+=a.get(i);
		}
		return sum/a.size();
	};

	

}