

class Customer{
	
	int customerId;
	String customerName;
	long phoneNumber;
	
	void info() {
		
		System.out.println("Customer Id: "+ customerId);
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Phone Number: "+ phoneNumber);
	}
	
	
}

public class Customer01 {
	
	public static void main(String[] args) {
		
		Customer cus = new Customer();
		System.out.println("Customer Information: ");
		cus.customerId = 01;
		cus.customerName = "Ganesh Gupta";
		cus.phoneNumber = 8674576849l;
		cus.info();
	}

}
