package practiceDay31_1_2026;

public class Employee {
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}
		else {
			System.err.println("Salary should be above zero");
		}
		
	}
	
	

}
