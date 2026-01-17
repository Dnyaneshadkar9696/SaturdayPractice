
class Student{
	
	int rollNo;
	String name;
	int marks;
	
	void info() {
		System.out.println("Student Information");
		System.out.println("Name :"+name );
		System.out.println("rollNo :"+name );
		System.out.println("marks :"+marks );
	}
	
	
}



public class Student01 {
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.rollNo = 1;
		std.name = "Raman";
		std.marks = 98;
		
		std.info();
		
		
	}

}
