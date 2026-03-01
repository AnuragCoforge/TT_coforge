package com.coforge;
import java.util.*;
public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList l = new ArrayList();
//		
//		l.add("Anurag Tiwari");
//		l.add(81000186);
//		l.add(true);
//		l.add(7.65f);
//		l.add('A');
//		
//		System.out.println(l);
//
//		
//		for(int i=0 ; i<l.size(); i++) {
//			System.out.println(l.get(i));
//		}
//		--------------------------------------------------------IMP---------
//		java.util.ArrayList<Integer> intAL = new java.util.ArrayList<>(); //another way of using without import statement.
//		-----------------------------------------------------------------------
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(11);
		l.add(10);
		l.add(9);
		l.add(8);
		l.add(7);
		l.add(7);
		
		for(int i=0 ; i<l.size() ; i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println();
		for(int element: l) {
			System.out.print(element+ " ");
		}
		System.out.println();
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			if(i == 7) l.remove(i);
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.print("After iteration the ArrayList is: ");
		System.out.println(l);
	}

}
