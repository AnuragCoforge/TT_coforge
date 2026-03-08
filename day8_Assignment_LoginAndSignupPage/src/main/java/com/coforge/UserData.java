package com.coforge;
import java.util.*;
public class UserData {
	public static Set<String> username = new HashSet<>();
	public static Set<String> password = new HashSet<>();

	static {
		username.add("Anurag");
		password.add("Anurag@1234");
		
		username.add("Khushboo");
		password.add("Khushboo@1234");
	}
	
	public static void showAllUsers() {
		System.out.println("UserNames:" + username);
		System.out.println("Passwords:" +password);
		
	}
}
