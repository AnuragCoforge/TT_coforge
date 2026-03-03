package com.coforge.day6_maven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Account {
	private long accId;
	private String accHolderName;
	private String bankName;
	private double balance;
	
	public void withdraw(double amount) {
		if(amount<= this.balance) {
			this.balance -= amount;
			System.out.println("Withdraw Successfull");
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("amount depsited");
	}
}
