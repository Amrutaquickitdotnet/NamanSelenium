package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example001_LinkedList {

	public static void main(String[] args) {

		// LinkedList is class implements by List Interface and it has also called
		// doubly ArrayList / DoubleLinkedList

		List<String> colours = new LinkedList<String>();
		colours.add("Red");
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Orange");
		Iterator<String> colourlist = colours.iterator();
		while (colourlist.hasNext()) {
			System.out.println(colourlist.next());

		}
		System.out.println("******************************");

		LinkedList<String> pictures = new LinkedList<String>();
		pictures.add("The Wolf");
		pictures.add("The Wolf");
		pictures.add("The Wolf");
		pictures.add("The Wolf");
		pictures.add("The Wolf");

		Iterator<String> alllist =	pictures.iterator();
		while (alllist.hasNext()) {
			
			System.out.println(alllist.next());
		}
			
		}
	}
