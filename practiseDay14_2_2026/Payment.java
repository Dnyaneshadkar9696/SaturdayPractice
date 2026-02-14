package practiseDay14_2_2026;

public class Payment implements GooglePay , PhonePay{
	
	@Override
	public void googlePay() {

		System.out.println("Payment is done through Google");
	}
	
	@Override
	public void phonePay() {
		
		System.out.println("Payment is done through PhonePay");
		
	}
	
	public void paymentInfo() {
		
		System.out.println("The Payment Information : ");
	}

}
