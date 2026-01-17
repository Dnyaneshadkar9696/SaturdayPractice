
class Employee{
	int empId;
	String empName;
	double empSalary;
	
	void info() {
		
		System.out.println("Employee Information");
		System.out.println("Name : "+ empName);
		System.out.println("Id :"+empId);
		System.out.println("Salary :"+empSalary);
	}
	
}


public class Employee01 {
	
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.empId = 11;
		em.empName="Suraj";
		em.empSalary= 35000.34d;
		
		em.info();
		
		
		
	}

}
