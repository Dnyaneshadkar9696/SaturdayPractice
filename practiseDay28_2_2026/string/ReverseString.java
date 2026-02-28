package practiseDay28_2_2026.string;

public class ReverseString {
	
	
	public void calling() {
		this.reverseString();
		System.out.println();
		System.out.println();
		this.checkPalindrom();
		System.out.println();
		this.countVowelsConsonents();
		System.out.println();
		this.countUpperLowerCase();
		System.out.println();
		this.remoceSpaces();
		System.out.println();
		this.printinLine();
		System.out.println();
		this.countNumber();
		System.out.println();
		this.nonRepeatedCharacter();
	}
	
	public void reverseString() {
		
		String sub = "Java";
		System.out.println("Input String is : "+ sub);
		System.out.print("Reverse String is : ");
		 for(int i = sub.length()-1 ; i >=0; i--) {
			 
			 System.out.print( sub.charAt(i));
			 
		 }
	}
	
	public void checkPalindrom() {
		String name = "madam";
		String output = "";
		
		// to check the string is palindrome or not 
		
		for (int j = name.length() -1 ; j >=0 ; j--) {
			
			output= output + name.charAt(j);
		}
		
		if(output.equals(name)) {
			// we used here the equals method
			System.out.println("The given String is a Palindrome");
		}
		else {
			System.out.println("The given String is not a Palindrome");
		}
		
		
	}
	
	
	public void countVowelsConsonents() {
		
		
		String input = "Education";
		int countV= 0;
		int countC = 0;
		
		for(int l = 0 ; l <= input.length()-1; l++) {
			
			char ch = input.charAt(l);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				countV++;
			}
			else {
				countC++;
			}
			
		}
		System.out.print("Vowels : "+ countV);
		System.out.print(", Consonants : "+ countC);
		
		
	}
	
	public void countUpperLowerCase() {
		// to count upper and lower case characters
		
		String  inp = "JavaTrainer";

		int countU = 0;
		int countL = 0;
		
		for(int m = 0 ; m <= inp.length()-1; m++) {
			
			// to find the capital and smaller letters
			
			char chh = inp.charAt(m);
			
			if( chh >= 'A' && chh <= 'Z') {
				countU++;
				
			}
			else {
				countL++;
			}
			
		}
		System.out.print("Upper Case : "+ countU);
		System.out.print(", Lower Case : "+ countL);
		
		if(inp.isEmpty()) {
			// to use is empty method to check the string is empty or not 
			System.out.println(" ,String is empty");
		}
		 else {
			 System.out.println(" ,String is not empty");
		 }
	}
	
	public void remoceSpaces() {
		
		// Remove all the spaces from the string
		
		String ham = "Java is Powerfull";
		String res = "";
		
		for(int e = 0 ; e <= ham.length() - 1; e++) {
		
			
			if(ham.charAt(e) != ' ') {
				// were  e is not equal to the space then it will be added in the string
				res = res + ham.charAt(e);
			}
		
		}
		System.out.println("The String : "+ res);
		
		
		
	}
	
	public void printinLine() {
		String namee = "Core";
		System.out.println("Printing in a single line");
		for(int g = 0 ; g <= namee.length() -1; g++)
		{
			char jj = namee.charAt(g);
			System.out.println(jj);
		}
	}
	
	public void countNumber() {
		String numberC = "Java1234";
		String def = "JaVa";
		int countN = 0;
		for(int z = 0 ; z <= numberC.length() - 1 ; z++) {
			
			char df = numberC.charAt(z);
			
			if(df >= '0' && df <= '9') {
				// we are seeing each digit individually
				countN++;
			}
		}
		String alter = "";
		for(int w = 0; w <= def.length()-1; w++) {
			
			char gd = def.charAt(w);
			
			if(gd >= 'A' && gd <= 'Z') {
				alter = alter + Character.toLowerCase(gd);
				
			}
			else {
				alter = alter + Character.toUpperCase(gd);
			}
		}
		
		System.out.println("Digits : "+ countN);
		System.out.println("Alternate Capital : " + alter);
	}
	
	public void nonRepeatedCharacter() {
		
		// like success so first non repeating is u
		
		String sam = "success";
		
		char falero;
		for(int s = 0; s <= sam.length() -1 ; s++) {
			
			char c = sam.charAt(s);
			// it will give us s
			for(int y = 1; y <= sam.length() -1; y++) {
				
//				char sam.char = sam.charAt(y);/
				
				if( c == sam.charAt(y)) {
					continue;
					
				}
				else if ( c != sam.charAt(y)) {
					System.out.println(c);
					break;
				}
				
				
				
			}
			
			
		}
	}

}
