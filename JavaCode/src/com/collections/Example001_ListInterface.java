package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example001_ListInterface {

	public static void main(String[] args) {
		
		//enum 
		// Can not create object of interface
		
	
//		List<String> list = new ArrayList<String>();// Creating arraylist
//		
//		// adding objects in arraylist 
//		// Storing element in orderlist (FIFO)
//		list.add("Naman");//0
//		list.add("Naman1");//1
//		list.add("Naman11");//2
//		list.add("Naman11");//3
//		list.add("Naman12");//4
//		list.add("Naman13");//5
//		
//		// Traversing list through Iterator 
//	Iterator<String>names =	list.iterator();
//	
//    while(names.hasNext()) {
//    	
//    	System.out.println(names.next());
//    }
	List<Integer>rollnumber = new ArrayList<Integer>();
	rollnumber.add(12);
	rollnumber.add(13);
	rollnumber.add(14);
	rollnumber.add(15);
	rollnumber.add(12);
	rollnumber.add(12);
	
	Iterator<Integer> numberList =	rollnumber.iterator();
	while(numberList.hasNext()) {
		System.out.println(numberList.next());
	}
	
	
	
		
}
}