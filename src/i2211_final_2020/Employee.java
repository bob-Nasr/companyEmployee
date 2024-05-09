package i2211_final_2020;

public class Employee {
	
private static int idCounter = 1;
private int id;
private String name;
private double salary;
private int seniority;

	public Employee(String name, int salary, int seniority) {
		this.setId(idCounter++);
		this.setName(name);
		this.setSalary(salary);
		this.setSeniority(seniority);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

}
