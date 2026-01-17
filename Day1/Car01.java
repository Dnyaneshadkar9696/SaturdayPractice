
class Car{
	
	String brand;
	String model;
	int price;
	
	void info() {
		System.out.println("Car Information");
		System.out.println("Brand: "+ brand);
		System.out.println("Model: "+ model);
		System.out.println("Price: "+ price);
	}
	
}



public class Car01 {
	
	public static void main(String[] args) {
		Car ca = new Car();
		ca.brand="TaTa";
		ca.model="DLX-23";
		ca.price=50000;
		
		ca.info();
		
		
	}

}
