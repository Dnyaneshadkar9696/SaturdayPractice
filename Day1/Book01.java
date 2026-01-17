
class  Book{
	
	int bookId;
	String title;
	String author;
	
	
	void info() {
		
		
		System.out.println("Book Id :"+bookId);
		System.out.println("Title: "+title);
		System.out.println("Author: "+ author);
	}
	
}




public class Book01 {
	
	public static void main(String[] args) {
		Book bk = new Book();
		System.out.println("Book Information");
		System.out.println();
		bk.bookId = 01;
		bk.title = "Atomic Habits";
		bk.author = "Neal";
		bk.info();
		System.out.println();
		Book bk2 = new Book();
		bk2.bookId = 02;
		bk2.title = "Invester";
		bk2.author = "Waren Buffet";
		bk2.info();
		
	}

}
