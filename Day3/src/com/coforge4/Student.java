package com.coforge4;

public class Student {
	private String sname;
	private int sid;
	
	public Student() {
		super();
	}

	public Student(String sname, int sid) {
		super();
		this.sname = sname;
		this.sid = sid;
	}

	private static CollegeAddress address;
	

	
	public static CollegeAddress getAddress() {
		return address;
	}

	public static void setAddress(CollegeAddress address) {
		Student.address = address;
	}
	
	


	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", CollegeAddress"+address+"]";
	}




	static class CollegeAddress {
		private String city;
		private String state;
		private long pincode;
		
		
		
		
		public CollegeAddress() {
			super();
		}

		public CollegeAddress(String city, String state, long pincode) {
			super();
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}

		@Override
		public String toString() {
			return "CollegeAddress [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
		}
	}
	public static void main(String[] args) {
		CollegeAddress address = new Student.CollegeAddress("goa", "mp", 101);
		Student s1 = new Student("Anurag", 81000186);
		setAddress(address);
		System.out.println(s1);
	}
}
