package com.coforge.day6_maven;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> fruitTree = new TreeMap<>();
        fruitTree.put(1,"apple");
        fruitTree.put(3,"banana");
        fruitTree.put(5,"mango");
        fruitTree.put(2,"papaya");
        fruitTree.put(4,"watermelon");
        
        System.out.println(fruitTree);
        
        for(Integer key: fruitTree.keySet()) {
        	System.out.println(key + " --> " +fruitTree.get(key));
        }
        
	}

}
