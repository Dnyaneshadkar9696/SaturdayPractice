

class Bike{
	
	String bikeName;
	int enginCc;
	int price;
	
	void info() {
		System.out.println("Bike Name: "+ bikeName);
		System.out.println("Engin CC: "+ enginCc);
		System.out.println("Price: "+ price);
	}
	
}



public class Bike01 {
	
	public static void main(String[] args) {
		
		Bike bkr = new Bike();
		System.out.println("Bike Information: ");
		bkr.bikeName = " Pulsor";
		bkr.enginCc = 120;
		bkr.price = 150000;
		
		bkr.info();
	}

}
