package PractiseSaturday16May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Questions {

	// to find the unique elements in the array

	public void calling() {

		this.uniqArrElements();
		System.out.println();

		System.out.println();
		this.countString();

		System.out.println();
		this.combineArrayList();

		System.out.println();
		this.anotherwayToMerge();
		// unique elements

		System.out.println();
		this.anagramCheck();

		System.out.println();
		this.reverseWord();
	}

	public void uniqArrElements() {

		ArrayList<int[]> al = new ArrayList();

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		int[] newar = new int[2];

		// to find the common elements between them like [ 3,4 ]

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					newar[j] = arr1[i];
					al.add(newar);

				} else {
					continue;
				}
			}
		}

		System.out.print("[");
		for (int t = 0; t < newar.length; t++) {
			System.out.print(" " + newar[t]);

		}

		System.out.print(" ]");

	}

	// To count the Vowels and Consonants in the String

	public void countString() {

		String name = "Hellow my name is Dnyanesh";

		int consonants = 0;
		int vowels = 0;

		char[] arr1 = name.toCharArray();

		for (int i = 0; i < arr1.length; i++) {

			char ch = arr1[i];

			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
				consonants++;
			} else {
				vowels++;
			}

		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}

	// Merge two arraylist without the duplicates

	public void combineArrayList() {

		ArrayList<Integer> ar = new ArrayList<>();

		ar.add(11);
		ar.add(12);
		ar.add(13);
		ar.add(14);
		ar.add(15);
		ar.add(16);

		ArrayList<Integer> ar2 = new ArrayList<>();

		ar2.add(21);
		ar2.add(22);
		ar2.add(13);
		ar2.add(14);
		ar2.add(25);
		ar2.add(26);

		ar.addAll(ar2);

//		System.out.println(ar);

		LinkedHashSet r = new LinkedHashSet(ar);

		System.out.print("[");
		for (Object d : r) {
			System.out.print(d + " ");

		}
		System.out.println("]");
	}

	public void anotherwayToMerge() {
		ArrayList<Integer> ars = new ArrayList<>();

		ars.add(11);
		ars.add(12);
		ars.add(13);
		ars.add(14);
		ars.add(15);
		ars.add(16);

		ArrayList<Integer> are = new ArrayList<>();

		are.add(21);
		are.add(22);
		are.add(13);
		are.add(14);
		are.add(25);
		are.add(26);

		for (Integer y : are) {
			// we take are one , one element and check it with the ars
			if (!ars.contains(y)) {
				ars.add(y);
			}
		}
		System.out.println(ars + " ");

	}

	// Check wheater two strings are anagram using the HashMap or ArrayList

	public void anagramCheck() {

		String one = "DOG";
		String two = "GOD";

		// optimized solution convert into array and use the array methosd

		char[] ch = one.toCharArray();
		char[] chh = two.toCharArray();

		// we have the method of Arrays clss that sorts the elments in the array

		Arrays.sort(ch);
		Arrays.sort(chh);

		if (Arrays.equals(ch, chh)) {

			System.out.println("Anagram");
		} else {
			System.out.println(" Not a Anagram");
		}

	}

	// reverse each word

	public void reverseWord() {

		String word = "Java is Powerfull";

		String[] sd = word.split(" ");

		for (String s : sd) {
			StringBuilder b = new StringBuilder(s);

			b.reverse();
			System.out.print(b+ " ");
		}

	}

}
