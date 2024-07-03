package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Example003_SetCollections {

	public static void main(String[] args) {
		
		
	
	Set<String>data = new HashSet<String>();
	data.add("name1");
	
	data.add("name2");
	
	data.add("name1");
	data.add("name11");
	System.out.println(data);
	
	
		
}
}