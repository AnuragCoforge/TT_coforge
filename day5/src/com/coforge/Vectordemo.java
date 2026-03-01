package com.coforge;
import java.util.*;
public class Vectordemo {
	public static void main(String[] args) {
		
//		Vector<Integer> vec = new Vector<>();
//		System.out.println(vec.capacity());
//		vec.add(11);
//		vec.add(12);
//		vec.add(13);
//		vec.add(14);
//		vec.add(15);
//		vec.add(16);
//		vec.add(17);
//		vec.add(18);
//		vec.add(19);
//		vec.add(10);
//		vec.add(22);
//		System.out.println(vec.capacity());
//
//		//enumeration on vector
//		
//		Enumeration<Integer> enums = vec.elements();
//		
//		while(enums.hasMoreElements()) {
//			System.out.println(enums.nextElement());
//			
//		}
//		
//		vec.trimToSize();
//		System.out.println(vec.size());
//		System.out.println(vec.capacity());
//
//		vec.add(90);
//		System.out.println(vec.capacity());
//		
//		
//		//ensureCapacity() : when we are sure about the minimum size of the vector and don't want the size to exceed that limit
//		
//		System.out.println();
//		int fVal = vec.removeFirst(); //removes and return the first element
//		System.out.println(fVal);
//		
//		
//		int lVal = vec.removeLast(); //removes and return the last element
//		System.out.println(lVal);
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		
		System.out.println(l);
		
		//ArrayList to a primitive array
		Integer []arr = l.toArray(new Integer[0]);
		System.out.println(arr[2]);
		
		//primitive array to List
		Integer arr1[] = {34, 54, 77, 83, 24};
		List<Integer> list = Arrays.asList(arr1);
		
		System.out.println(list);
	}
}
