
class Laptop{
	
	int ram;
	String processor;
	int price;
	
	void info() {
		System.out.println("Ram: "+ ram);
		System.out.println("Processor: "+ processor);
		System.out.println("Price: "+ price);
	}
	
}



public class Laptop01 {
	
	public static void main(String[] args) {
		
		Laptop lap = new Laptop();
		System.out.println("Laptop Information");
		lap.ram = 8;
		lap.processor = "Snap Dragon";
		lap.price = 45000;
		lap.info();
		
	}

}
