package i2211_final_2020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		Company company = new Company("I2211");

		try {
			company.addDept("HR");
			company.addDept("IT");
			company.addDept("Sales");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		String filePath = "C:\\Users\\User\\eclipse-workspace\\i2211_final_2020\\src\\i2211_final_2020\\Employment.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		    
			String line;
			while ((line = br.readLine()) != null) {
				String[] employeeData = line.split(", ");
				if (employeeData.length == 2) {
				    String name = employeeData[0];
				    String departmentType = employeeData[1];
				    
				    System.out.println(name + " is in " + departmentType);

				    Department department = company.getDepartment(departmentType);
				    if (department != null) {
				        department.hireEmployee(name);
				    } else {
				        System.out.println("Department '" + departmentType + "' does not exist.");
				    }
				} else {
				    System.out.println("Invalid data format in the file: " + line);
				}
			}
		    
		} catch (IOException e) {
		    System.out.println("Error reading the file: " + e.getMessage());
		}
		
		
		
	}
}
