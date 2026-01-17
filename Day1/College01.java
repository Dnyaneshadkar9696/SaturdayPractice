
class College{
	
	String collegeName;
	float rating;
	String city;
	
	void info() {
		System.out.println("College Name: "+ collegeName);
		System.out.println("Rating: "+ rating + "/5");
		System.out.println("City: "+ city);
	}
	
}



public class College01 {
	
	public static void main(String[] args) {
		College cog = new College();
		System.out.println("College information");
		cog.collegeName = "Modern Collge";
		cog.city = "Pune";
		cog.rating = 4.5f;
		cog.info();
	}

}
