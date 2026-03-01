package com.coforge;
import java.util.*;
import java.util.function.Predicate;
public class DemoOnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(13);
		hs.add(14);
		hs.add(46);
		hs.add(22);
		hs.add(7);
		
		System.out.println(hs);
		
		for(Integer ele: hs) {
			System.out.println(ele);
		}
			Predicate<Integer> isEven=(e)->e%2==0;
			hs.removeIf(isEven);
			System.out.println(hs);
		
		
	}

}
