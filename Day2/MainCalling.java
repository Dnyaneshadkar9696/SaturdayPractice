package practiceDay31_1_2026;

import practiceDay31_1_2026Interview.Bank;

public class MainCalling {
	
	public static void main(String[] args) {
		
		
		Student st = new Student();
		System.out.println("Student Information : ");
		st.setName("Ramesh Kumar");
		st.setId(23);
		System.out.println("Name : " +st.getName());
		System.out.println("Id : "+st.getId());
		
		System.out.println();
		
		BankAccount bk = new BankAccount();
		bk.setBalance(4000000);
		System.out.println("Balance : " + bk.getBalance());
		
		System.out.print("Deposit : ");
		bk.depositBank(20);
		
		System.out.print("Withdraw : ");
		bk.withdrawBank(40);
		
		System.out.print("Updated Balance : ");
		bk.updatedBalance();
		
		System.out.println();
		
		Employee emp = new Employee();
		System.out.println("Employee Salary : ");
		emp.setSalary(0.0);
		
		System.out.println();
//		System.out.println();
		
		Car ca = new Car();
		ca.setBrand("Bentley");
		ca.setPrise(32000000000.00);
		System.out.println("Car Brand: "+ ca.getBrand());
		System.out.println("Prise : "+ ca.getPrise());
		
		System.out.println();
		System.out.println("Product Details:  ");
		Product pd = new Product();
		
		pd.setPrise(300);
		System.out.println("Product Prise: "+ pd.getPrise());
		System.out.print("Discount Prise: ");
		pd.discountPrise(20);
		
		
		
		
		
 		
        
	}

}
