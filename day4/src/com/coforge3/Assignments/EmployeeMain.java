package com.coforge3.Assignments;
import java.util.function.Consumer;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Swapna",123,80000);
		Employee e2=new Employee("Amit",125,60000);
		Employee e3=new Employee("Swathi",13,90000);
		Employee e4=new Employee("Sruthi",23,50000);
		Employee e5=new Employee("Preeti",1234,80000);
		Employee empArr[]= {e1,e2,e3,e4,e5};
		
		for(Employee emp:empArr)
			System.out.println(emp);
		
		
		Consumer<Employee[]> empConsumer=(empArr1)->{
			double max=empArr1[0].getSalary();;
			for(Employee emp:empArr1) {
				System.out.println(emp.getEname());
				if(emp.getSalary()>max)
					max=emp.getSalary();	
			}
			System.out.println(max);
		};
		empConsumer.accept(empArr);
		
	}

}