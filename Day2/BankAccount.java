package practiceDay31_1_2026;

public class BankAccount {
	
	private double balance;


	public double getBalance() {
		return balance;
	}
	public void setBalance(int bal) {
		this.balance = bal;
	}
	
	
	public void depositBank(double deposit) {
		
		balance = balance + deposit;
		System.out.println(balance);
	}
	
	public void withdrawBank(double with) {
		balance = balance - with;
		System.out.println(balance);
	}
	
	public void updatedBalance() {
		System.out.println(balance);
	}

}
