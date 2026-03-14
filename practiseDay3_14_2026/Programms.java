package practiseDay3_14_2026;

import java.util.Scanner;

public class Programms {

	Scanner sc = new Scanner(System.in);

	public void call() {

		this.printAllElements();
		System.out.println();
		this.countOfElements();
		System.out.println();
		this.findAverage();
		System.out.println();
		this.largElement();
		System.out.println();
		this.smallestElement();
		System.out.println();
		this.countEvenOdd();
		System.out.println();
		this.serchElement();
		System.out.println();
		this.reverseArray();
		System.out.println();
		this.evenPosition();
		System.out.println();
		this.oddPosition();
		
		System.out.println();
		
		this.twoDArray();
		System.out.println();
		this.sumofArray();
		
		System.out.println();
		this.printMetrix();
	}

	public void printAllElements() {

		System.out.println("The Array : ");

		int[] arr = { 12, 21, 23, 44, 54, 65 };

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

	public void countOfElements() {

		int[] arr1 = { 32, 43, 56, 54, 67, 34 };

		int sum = 0;

		for (int j = 0; j < arr1.length; j++) {

			sum = sum + arr1[j];

		}

		System.out.println("The Sum  of all elements is :" + sum);
	}

	public void findAverage() {

		int[] arrAvg = { 43, 64, 6, 23, 65, 9 };

		int sum = 0;
		int avg = 0;

		for (int d = 0; d < arrAvg.length; d++) {
			sum = sum + arrAvg[d];
		}
		avg = sum / 6;
		System.out.println("The Average of the Array is : " + avg);

	}

	public void largElement() {

		int[] large = { 34, 56, 544, 34, 644, 45 };

		int max = large[0];

		for (int r = 0; r < large.length; r++) {

			if (large[r] > max) {
				max = large[r];
			}
		}
		System.out.println("The largest Element is : " + max);

	}

	public void smallestElement() {

		int[] small = { 34, 56, 544, 4, 644, 45 };

		int min = small[0];

		for (int r = 0; r < small.length; r++) {

			if (small[r] < min) {
				min = small[r];
			}
		}
		System.out.println("The Smallest Element is : " + min);

	}

	public void countEvenOdd() {

		int[] arr12 = { 4, 49, 87, 15, 23, 2 };

		int countE = 0;
		int countO = 0;

		for (int t = 0; t < arr12.length; t++) {
			if (arr12[t] % 2 == 0) {
				countE++;
			} else {
				countO++;
			}

		}
		System.out.println("The Count of Even Number : " + countE);
		System.out.println("The Count of the Odd Number : " + countO);
	}

	public void serchElement() {

		int[] arr13 = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println("Enter the element to search : ");
		int a = sc.nextInt();

		for (int e = 0; e < arr13.length; e++) {
			if (arr13[e] == a) {
				System.out.println("Element Found");
				break;
			}
		}

	}
	// program to reverse an array

	public void reverseArray() {

		int[] original = { 1, 2, 3, 4, 5, 6 };

		int[] reverse = new int[original.length];
		int j = 0;

		for (int s = original.length - 1; s >= 0; s--) {
			reverse[j] = original[s];
			j++;
		}

		// now have to print the reversed array
		System.out.println("Reversed Array : ");
		for (int c = 0; c < reverse.length; c++) {
			System.out.print(reverse[c] + " ");
		}

	}

	// program to print the elements at the even index position

	public void evenPosition() {

		int[] position = { 43, 54, 5, 33, 64, 34, 32 };

		System.out.println("Print the element at the even index position : ");
		for (int i = 0; i < position.length; i++) {

			if (i % 2 == 0) {
				System.out.println(position[i]);
			}

		}
	}

	// to print elements at the odd index position

	public void oddPosition() {

		int[] position = { 43, 54, 5, 33, 64, 34, 32 };

		System.out.println("Print the element at the odd index position : ");
		for (int i = 0; i < position.length; i++) {

			if (i % 2 != 0) {
				System.out.println(position[i]);
			}

		}
	}
	
	// Program to find the sum of each column in 2D array
	
	public void twoDArray() {
		
		int[][] arr = {{23, 32, 65}, {43, 53, 54}, {65, 43, 65}};
		
		// we have given the 2 D array
		
		// to get the sum of the each column
		
//		for(int r = 0 ; r < arr.length ; r++) {
//			// above column is for rows 
//			for(int c = 0 ; c <= arr[r].length; c++) {
//				
//				System.out.println(arr[r][c]);
//				
//			}
//		}
		
		// here what we have to do is the outer loop is of column as the 
		// the 0 value remains constant in the first iteration and in second it changes
		
		// we can take the outer loop as of column and of the inner loop as of rows
		
		for(int c = 0 ; c < arr[0].length; c++) {
			
			// this arr[0] will go till the 0 1 2 checks the total number of the columns
			
			int sum = 0;
			
			for( int r = 0 ; r < arr.length; r++) {
				sum = sum + arr[r][c];
				
			}
			
			System.out.println("The sum of column " + c +" is :"+ sum);
		}
	}
	
	// programm to find the sum of all the elements in the  2 D array
	
	public void sumofArray() {
		int[][] arrr = {{23, 32, 65}, {43, 53, 54}, {65, 43, 65}};

		// sum of all the elements in the 2 D array
		int sum = 0;
		for(int s = 0 ; s < arrr.length; s++) {
			for(int v = 0 ; v < arrr.length; v++) {
			
				sum = sum + arrr[s][v];
			}
		}
		
		System.out.println("Sum of all the elements in 2 D array : "+ sum);
	}
	
	
	public void printMetrix() {
		
		int[][] aarr = {{23, 32, 65}, {43, 53, 54}, {65, 43, 65}};

		for(int dd = 0 ; dd < aarr.length; dd++) {
			for(int sc = 0; sc < aarr.length; sc++) {
				
				System.out.print(aarr[dd][sc]+" ");
			}
			System.out.println();
		}
		
	}

}
