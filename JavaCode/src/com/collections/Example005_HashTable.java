package com.collections;

import java.awt.Insets;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Example005_HashTable {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap();
		hashmap.put("One", 1);
		hashmap.put("Two", 2);
		hashmap.put(null, 2);
		hashmap.put(null, 4); // only one null key allowed
		hashmap.put("Three", null);
		hashmap.put("Four", null);// more than one nulls are allowed in value pair
		System.out.println(hashmap);
		
		
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("One", 1);
		hashtable.put("Two", 2);
		hashtable.put("Two", 2);
		hashtable.put("Two", 2);
		hashtable.put("Two", 2);//LIFO
		hashtable.put("Yellow", 4);
		hashtable.put("Pink", 3);
		
		hashtable.put("Test45", null); // not allowing null value
		
		hashtable.put(null, 12); // not allowing null key 
		
		// Hashtable disallow any null key and null value 
		
		
		
		// iterating using enhanced for loop
		
		for( Map.Entry<String, Integer>   list     :hashtable.entrySet()) {
			System.out.println(list.getKey()+ list.getValue());
			
		}

		// get the value for given key
		Integer value = hashtable.get("Two");
		System.out.println(value);

		// remove element from hashtable

		hashtable.remove("One");
		System.out.println(hashtable);

		if(hashtable.containsKey("Pink")) {
			
	Integer a =		hashtable.get("Pink");
	System.out.println("value for Key"+ "\"Pink\" is : "+ a);
		}
		System.out.println("Size of hashtable"+ hashtable.size());
		
		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
		String key =	keys.nextElement();
		System.out.println("Key:"+ " "+key);

		}
//load factor value = 0.75 / initial capacity is 11 
	}
}