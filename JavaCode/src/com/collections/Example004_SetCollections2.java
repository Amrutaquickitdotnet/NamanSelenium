package com.collections;

import java.awt.Insets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example004_SetCollections2 {

	public static void main(String[] args) {
		
		
	Set<String>s1 = new HashSet<String>();
	s1.add("Naman");
	
	s1.add("Amruta");
	
	
	Set<String>s2 = new HashSet<String>();
	
	
	
	
	System.out.println("s1 Element"+s1);
	
	s2.add("Test");
	s2.add("Naman");
	
	System.out.println("S2 Element"+s2);
	
	//s1.addAll(s2);
	
	System.out.println("Union"+s1);
			
	
		
}
}