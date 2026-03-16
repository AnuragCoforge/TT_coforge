package com.coforge.entities;

//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
	
	@Id //primary key 
	@GeneratedValue(strategy = GenerationType.AUTO) //auto increment the id if we don't provide
	
	private long eid;
	
	@Size(min=3, message="ename should have atleast 3 characters")
	@NotBlank
	private String ename;
	
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$")
	private String email;
	
	@Pattern(regexp = "[6789][0-9]{9}", message="invalid mobile number must start with 6,7,8 or 9 with exact length of 10 characters")
	private String mobile;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid", referencedColumnName = "aid")
	private Address address;
	
	public Employee(String ename, String email, String mobile, Address address) {
		super();
		this.ename = ename;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
}
