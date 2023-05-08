package week3.day2.assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//declare String 1
		String text1 = "stops";
		//declare string 2
		String text2 = "potss";
		//check length of the string
		if (text1.length()==text2.length()) {
			System.out.println("length of text1:" +text1.length());
			System.out.println("length of text2:" +text2.length());
		}

		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println(charArray1);
		System.out.println(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("Both array has same value");
		}
		else {
			System.out.println("Both array does not have same Value");
		}

	}

}
