package practiceDay31_1_2026;

public class Product {
	
	private int prise;

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}
	
	public void discountPrise(int discount) {
		
		prise = prise - discount;
		System.out.println(prise);
		
	}
	
	
	

}
