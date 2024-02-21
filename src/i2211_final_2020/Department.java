package i2211_final_2020;

import java.util.List;
import java.util.ArrayList;

public class Department {
	
private String type;
private List<Employee> employees;
private Employee head;

	public Department(String name) {
		this.setType(name);
		List<Employee> employees = new ArrayList<>();
		this.setEmployees(employees);
		this.setHead(null);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employee getHead() {
		return head;
	}
	public void setHead(Employee head) {
		this.head = head;
	}

public void hireEmployee(String noob) {
	int new_S=0;
	
	if(getType() == "HR") {
		new_S=1000;
	}else if(getType()=="IT") {
		new_S=1500;		
	}else if(getType()=="Sales") {
		new_S=1300;		
	};
		
	Employee newbie = new Employee(noob,new_S,0);
	employees.add(newbie);
	System.out.println(noob + " was hired");
	
}

public void promotions() {
	for(int i=0;i< employees.size();i++) {
		employees.get(i).setSeniority(employees.get(i).getSeniority()+1);
		
		if(getType() == "HR") {
			employees.get(i).setSalary(employees.get(i).getSalary()*1.3);
		}else if(getType()=="IT") {
			employees.get(i).setSalary(employees.get(i).getSalary()*1.5);
		}else if(getType()=="Sales") {
			employees.get(i).setSalary(employees.get(i).getSalary()*1.4);
		};

	}
}

public void assignHead() {
	
	int max_Senior=0;
	Employee new_head = null;
	for(int i=1;i<employees.size();i++) {
		if(max_Senior < employees.get(i).getSeniority()) {
			max_Senior = employees.get(i).getSeniority();
			new_head = employees.get(i);
		}
	}
	
	setHead(new_head);
	
}


}
