package com.coforge;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(6);
		l2.add(5);
		l2.add(3);
		l2.add(14);
		
		l.forEach( e->System.out.print(e + " ") );
		System.out.println();
		
		l.retainAll(l2); //only common elements in the colections are retained.
		
		System.out.println(l);
//		System.out.println(l2);
	}
}
