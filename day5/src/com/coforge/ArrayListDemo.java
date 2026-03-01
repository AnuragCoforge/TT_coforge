package com.coforge;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		
		System.out.println(l);
		l.remove(1);
		Integer i = 134;
		l.remove(i);

		System.out.println(l);
		
		//clearing all the collection
		
//		l.removeAll(l);
//		System.out.println("Collection after removeAll");
//		System.out.println(l);
		
		//using replaceAll method
		l.replaceAll(e-> e - 10);
		System.out.println(l);
		
		//clear method
//		System.out.println("Before Clear: " + l);
//		l.clear();
//		System.out.println("After Clear: " + l);
		
		ArrayList<Integer> lClone = (ArrayList<Integer>) l.clone();
		System.out.println(lClone);
		
		System.out.println(l.hashCode());
		System.out.println(lClone.hashCode());
		
//		l.add(69);
//		System.out.println(l);
//		System.out.println(lClone);
//		System.out.println(l.hashCode());
//		System.out.println(lClone.hashCode());
		
		lClone.add(20);
		System.out.println(l);
		System.out.println(lClone);
		System.out.println(l.hashCode());
		System.out.println(lClone.hashCode());
	}

}
