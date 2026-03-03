package com.coforge.day6_maven;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(12345767, "Anurag", "ICICI", 70000);
		acc.withdraw(10000);
		acc.deposit(10000);
		acc.withdraw(12000);
	}

}
