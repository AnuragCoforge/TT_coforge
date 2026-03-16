package com.coforge.HibernateMapping;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.coforge.dao.EmployeeDAO;
import com.coforge.entities.Address;
import com.coforge.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hibernate Db Application");
        EmployeeDAO dao = new EmployeeDAO();
        
       
        
        
        
//        SessionFactory sf = new Configuration().configure().buildSessionFactory();
//        Session session = sf.openSession();
        
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("Menu Driven");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("case1: get all employees");
        	System.out.println("case2: Write to the table");
        	System.out.println("case3: get employee by id");
        	System.out.println("case4: delete employee by id");
        	
        	int ch = sc.nextInt();
        	switch(ch) {
        	case 1:
        		// reading all the employees present in the Table
        		dao.getAllEmployee().forEach(e->System.out.println(e));
        		break;
        	case 2:
//        		Writing to the table
        		
        		System.out.print("Enter the name: ");
        		String name = sc.next();
        		System.out.print("Enter Email: ");
        		String email = sc.next();
        		System.out.print("Enter Mobile No.: ");
        		String mno = sc.next();
        		
        		System.out.println("Enter city: ");
        		String city = sc.next();
        		System.out.print("Enter State: ");
        		String state = sc.next();
        		System.out.print("Enter zipcode: ");
        		String zipcode = sc.next();
        		
        		Address address = new Address(city, state, zipcode);
        		Employee emp = new Employee(name, email, mno, address);
        		dao.insertEmployee(emp);
        		System.out.println("data inserted");
        		break;
        		
        	case 3:
        		// get employee by id
        		System.out.print("Enter the id to retrieve data: ");
        		long id = sc.nextLong();
        		 if(dao.getEmployeeById(id)!=null) {
        	        	System.out.println(dao.getEmployeeById(id));
        	        }
        	        else {
        	        	System.out.println("No Employee exists with eid: "+ id);
        	        }
        		break;
        		
        	case 4:
        		//delete employee by id
        		System.out.println("Enter the id of  employee to be deleted: ");
        		long id_emp = sc.nextLong();
        		if(dao.getEmployeeById(id_emp)!=null) {
        			dao.deleteEmployee(id_emp);
        			System.out.println("Item deleted with emp_id: "+ id_emp);
    	        }
    	        else {
    	        	System.out.println("No Employee exists with eid: "+ id_emp);
    	        }
        		break;
        		

        	case 5:
        		
        		System.out.println("Enter Employee ID to update: ");
        		long uid = sc.nextLong();
        		sc.nextLine();
        		
        		Employee oldemp = dao.getEmployeeById(uid);
        		if(oldemp == null) {
        			System.out.println("Employee not found!");
        			break;
        		}
        	    System.out.println("Enter new Emplyee Name: ");
        	    String newName = sc.nextLine();
        	    
        	    System.out.println("Enter the Employee Email: ");
        	    String newEmail = sc.nextLine();
        	    
        	    System.out.println("Enter the New Mobile Number: ");
        	    String newMobile = sc.nextLine();
        	    
        	    System.out.println("Enter the new city: ");
        	    String newCity = sc.nextLine(); 
        	    
        	    System.out.println("Enter the new State: ");
        	    String newState = sc.nextLine(); 
        	    
        	    System.out.println("Enter the new ZipCode: ");
        	    String newZipCode = sc.nextLine(); 
        		
        		
        		//address update
        		
        		oldemp.getAddress().setCity(newCity);
        		oldemp.getAddress().setState(newState);
        		oldemp.getAddress().setPincode(newZipCode);
        		
        		//update Employee details
        		
        		oldemp.setEname(newName);
        		oldemp.setEmail(newEmail);
        		oldemp.setMobile(newMobile);
        		

        		dao.updateEmployee(oldemp);

        		System.out.println("Employee Updated Successfully!");
        		break;

        	}
        }
    }
}
