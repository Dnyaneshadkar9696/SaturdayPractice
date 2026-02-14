package practiseDay14_2_2026;

public class Son implements Grandfather, Father {

	@Override
	public void fatherInfo() {

		System.out.println("Hellow  I am Father of Suresh");

	}

	@Override
	public void grandFatherInfo() {

		System.out.println("Hellow I am Grandfather of Suresh");

	}

	public void sonInfo() {
		System.out.println("Hi I am Suresh");
	}

	@Override
	public void age() {
		// Grand father
		System.out.println("Age of GrandFather is  : 78");

	}

	@Override
	public void age(int a) {
		
		System.out.println("Age of Father is : 66");

	}

}
