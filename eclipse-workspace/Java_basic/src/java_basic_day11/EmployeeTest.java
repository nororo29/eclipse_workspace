package java_basic_day11;

import java.util.ArrayList;

class Employee {
	public String name;
	public String grade;
	
	public Employee() {}
	public Employee(String name) {
		this.name = name;
	}
}

class Engineer extends Employee {
	private String skillset;
	
	public Engineer() {}
	public Engineer(String name) {
		super(name);
	}
	
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("lucy"));
		employeeList.add(new Engineer("gina"));
		
		for (Employee e : employeeList) {
			System.out.println(e.name);
		}
	}

}
