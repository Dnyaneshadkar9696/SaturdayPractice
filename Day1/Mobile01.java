
class Mobile{
	
	String company;
	String color;
	int cost;
	
	void info() {
		System.out.println("Company :"+company);
		System.out.println("Color :"+color);
		System.out.println("Cost :"+cost);
	}
}



public class Mobile01 {
	
	public static void main(String[] args) {
		Mobile  mob = new Mobile();
		System.out.println("*Mobile Information*");
		System.out.println();
		mob.company = "Oppo";
		mob.color = "Pink";
		mob.cost = 15000;
		mob.info();
		
	}

}
