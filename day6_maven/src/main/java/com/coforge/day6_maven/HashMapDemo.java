package com.coforge.day6_maven;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Swapna");
		map.put(5, "Amit");
		map.put(3, "Rahul");
		map.put(7, "Swapna");
		
		System.out.println(map);
		
		for(Integer key: map.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		for(String val: map.values()) {
			System.out.print(val + " ");
		}
		System.out.println();
//		map.put(null, "Anurag");
//		System.out.println(map);
		
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Smit"));
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		Iterator<Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(map.get(5));
	}
}
