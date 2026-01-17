
class BankAccount{
	
	long accountNumber;
	String accountHolderName;
	double balance;
	
	void info() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Balance: "+ balance);
	}
}



public class BankAccount01 {
	
	public static void main(String[] args) {
		
		BankAccount ban = new BankAccount();
		System.out.println("Account Details: ");
		ban.accountNumber = 4345565544445l;
		ban.accountHolderName = "Ganesh Kumar";
		ban.balance = 45000.45d;
		ban.info();
	}

}
