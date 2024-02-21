package i2211_final_2020;

import java.util.List;
import java.util.ArrayList;

public class Company {

private String name;
private List<Department> Departments;
	
	public Company(String name) {
		this.setName(name);
		List<Department> Departments = new ArrayList<>();
		this.setDepartments(Departments); 
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Department> getDepartments() {
		return Departments;
	}
	public void setDepartments(List<Department> Departments) {
		this.Departments = Departments;
	}
	
	public Department getDepartment(String t) {
		Department d = null;
		
		if(getDepartments()==null) {
			System.out.println("No departments found");
			return null;
		}
		
		else {			
			for(Department temp : Departments) {
				if(temp.getType() == t) {
					d=temp;
					System.out.println(t + " was found");
					return d;
				}
			}
			System.out.println(t + " doesn't exist");
			return null;
		}		
	}

	public void addDept(String name) {
		
		if(getDepartment(name)==null) {
			Department d = new Department(name);
			Departments.add(d);
			System.out.println(d.getType() + " was added");
			return;
		}
		else {
			for(Department d : Departments) {
				if(d.getType() == name) {
					System.out.println("Department exists!");
					break;
				}
			}
			Department d = new Department(name);
			Departments.add(d);
		}
	}
	
}
