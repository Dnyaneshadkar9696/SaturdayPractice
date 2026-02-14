package practiseDay14_2_2026.typecasting;

public class IntinLong {

	public void opration01() {

		double d = 25345353.75; // original double value
		int num = (int) d; // explicit casting double → integer
		
		// before Type casting long
		long b = 234253534545957575l;
		
		int g = (int) b;
		
		// data loss will happen here and it will print the last 32 bits of the data which will be random

		System.out.println("Double value: " + d);
		System.out.println("Integer value after casting: " + num);
		
		System.out.println();
		System.out.println("Long value : " + b);
		System.out.println("Integer value afer type casting: "+ g);
		System.out.println("data loss will happen here and it will print the last 32 bits of the data which will be random");
		
		System.out.println();
		
		

	}

}
