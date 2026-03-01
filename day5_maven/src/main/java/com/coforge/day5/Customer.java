package com.coforge.day5;

public class Customer implements Comparable<Customer>{
	private int custId;
	private String custName;
	private double orderCost;
	
	public Customer() {
		super();
	}
	
	public Customer(int custId, String custName, double orderCost) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.orderCost = orderCost;
	}

	
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", orderCost=" + orderCost + "]";
	}
	
	@Override
	public int compareTo(Customer o) {
//		System.out.println(o.orderCost);
//		System.out.println(this.orderCost);
		return (int)(this.getOrderCost() - o.getOrderCost());
	}
	
}
